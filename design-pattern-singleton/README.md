# 单例模式示例代码

### 1. 饿汉式
   在类加载时就完成了初始化，所以类加载较慢，但获取对象的速度快。
```
/**
 * 饿汉式单例
 */
public final class HungrySingleton {
      /**
	 * 实例
	 */
	private static final HungrySingleton INTANCE = new HungrySingleton();

	/**
	 * 构造方法
	 */
	private HungrySingleton() {
		// 什么都不做
	}

	/**
	 * 获取实例
	 */
	public static HungrySingleton getInstance() {
		return INTANCE;
	}
}
```
### 2. 懒汉式
  类加载时不初始化，在初次调用是实例化。
  在高并发情况下有线程安全问题，所以需要同步锁来保证唯一性。

##### 2.1 线程不安全
```
/**
 * 懒汉式单例<br>
 * 线程不安全
 */
public final class LazySingletonUnThreadSafe {
	/**
	 * 实例
	 */
	private static LazySingletonUnThreadSafe instance = null;

	/**
	 * 构造方法
	 */
	private LazySingletonUnThreadSafe() {
		// 什么都不做
	}

	/**
	 * 获取实例
	 */
	public static LazySingletonUnThreadSafe getInstance() {
		if (instance == null) {
			instance = new LazySingletonUnThreadSafe();
		}
		return instance;
	}
}
```

##### 2.2 线程安全
```
/**
 * 懒汉式单例<br>
 * 线程安全
 */
public final class LazySingletonThreadSafe {
	/**
	 * 实例
	 */
	private static LazySingletonThreadSafe instance = null;

	/**
	 * 构造方法
	 */
	private LazySingletonThreadSafe() {
		// 什么都不做
	}

	/**
	 * 获取实例
	 */
	public static synchronized LazySingletonThreadSafe getInstance() {
		if (instance == null) {
			instance = new LazySingletonThreadSafe();
		}
		return instance;
	}
}
```

### 3. 枚举式
```
/**
 * 枚举型单例
 */
public enum EnumSingleton {

	ADMIN, GUEST;

	// 这里隐藏了一个空的私有构造方法
	private EnumSingleton() {
	}
}
```

###  4. 内部静态类实现
```
/**
 * 内部静态类单例
 */
public final class StaticInnerSingleton {

	/**
	 * 实例化标志
	 */
	private boolean initialized = false;
	
	/**
	 * 构造方法
	 */
	private StaticInnerSingleton() {
		synchronized (StaticInnerSingleton.class){
            if(initialized == false){
                initialized = !initialized;
            }else{
                throw new RuntimeException("不可多重实例化。");
            }
        }

	}

	/**
	 * 获取实例
	 */
	public static StaticInnerSingleton getInstance() {
		return SingletonHolder.INSTANCE;
	}

	/**
	 * 静态类(生成静态实例)
	 */
	private static class SingletonHolder {
		public static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
	}
}
```

### 5. 注册式
  作为一个注册式的单例容器，要保证线程安全需要加同步锁。
```
/**
 * 注册式单例
 */
public final class RegisterSingleton {

	/**
	 * 注册容器
	 */
	private static Map<String, Object> regisMap = new ConcurrentHashMap<String, Object>();

	/**
	 * 获取实例<br>
	 * 为保证线程安全，需要加synchronized同步锁
	 * 
	 * @param className 类名
	 * @return 实例
	 */
	public static synchronized RegisterSingleton getInstance(String className) {
		RegisterSingleton instance = null;
		if (className == null) {
			className = RegisterSingleton.class.getName();
		}

		if (regisMap.containsKey(className)) {
			instance = (RegisterSingleton) regisMap.get(className);
		} else {
			try {
				instance = RegisterSingleton.class.newInstance();
				regisMap.put(className, instance);
			} catch (Exception e) {
				instance = null;
			}
		}
		return instance;
	}
}
```

### 6. 序列化以及反序列化
  如果不实现readResolve方法，将对象单例类序列化之后修改其中的属性值再反序列化，
  得到的结果的不同的实例。
```
        public static void main(String[] args) {
		HungrySingleton singleton = HungrySingleton.getInstance();
		singleton.setCount(100);

		// 序列化
		try {
			FileOutputStream fileOut = new FileOutputStream("SerializableTest");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(singleton);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 修改计数器
		singleton.setCount(200);

		// 反序列化
		HungrySingleton singleton2 = null;
		try {
			FileInputStream fileIn = new FileInputStream("SerializableTest");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			singleton2 = (HungrySingleton) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			System.out.println("找不到HungrySingleton类");
			c.printStackTrace();
		}

		if (singleton == singleton2) {
			System.out.println("同一个实例");
		} else {
			System.out.println("不同的实例");
		}

		System.out.println(singleton.getCount());
		System.out.println(singleton2.getCount());
	}
```
###### 输出结果
```
不同的实例
200
100
```
###### HungrySingleton .java 实现readResolve 方法
```
	/**
	 * 保证序列化结果唯一
	 * 
	 * @return 实例
	 */
	protected Object readResolve() {
		return INTANCE;
	}
}
```
###### 输出结果
```
相同的实例
200
200
```

