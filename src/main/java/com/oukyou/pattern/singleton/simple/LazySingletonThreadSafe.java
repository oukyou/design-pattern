/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/08.
 */
package com.oukyou.pattern.singleton.simple;

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
