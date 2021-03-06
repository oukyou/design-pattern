/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/08.
 */
package com.oukyou.pattern.singleton.inner;

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
