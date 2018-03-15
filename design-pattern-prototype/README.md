# 原型模式示例代码

### 1. 浅克隆方式   
  实现Java提供的Cloneable接口，重写clone方法，拷贝一个地址引用。

#### 1.1. 代码解析   
###### 1.1.1 Sheep.java 关键代码
```
	/**
	 * 重写克隆
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
```

###### 1.1.2 SheepFood.java 关键代码
```
	/**
	 * 重写克隆
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
```

### 2. 深克隆方式   
  深克隆方式有序列化反序列化方式，直接创建新对象对属性一个一个设值，beanutils.copyproperties方式等等。它是创建一个完全一模一样的被复制对象，被复制对象的所有变量都含有与原来的对象相同的值，除去那些引用其他对象的变量。那些引用其他对象的变量将指向被复制过的新对象，而不再是原有的那些被引用的对象。

#### 2.1. 代码解析  
###### 2.1.1. 深克隆关键代码
```
	/**
	 * 重写克隆
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return this.deepClone();
	}

	/**
	 * 深度克隆
	 * 
	 * @return 克隆后对象
	 */
	public Object deepClone() {
		Oukyou oukyouCopy = null;
		try {
			// 通过序列化和反序列化深度克隆
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);

			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);

			oukyouCopy = (Oukyou) ois.readObject();
			Computer mac = new Computer();
			mac.setType("Mac");
			oukyouCopy.getComputerList().add(mac);
		} catch (Exception e) {
			System.err.println("克隆失败");
			e.printStackTrace();
		}

		return oukyouCopy;
	}
```

