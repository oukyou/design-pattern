/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/08.
 */
package com.oukyou.pattern.singleton.simple;

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
