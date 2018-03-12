/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/08.
 */
package com.oukyou.pattern.singleton.simple;

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
