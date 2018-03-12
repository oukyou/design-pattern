/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/08.
 */
package com.oukyou.pattern.singleton.simple;

import java.io.Serializable;

/**
 * 饿汉式单例
 */
public final class HungrySingleton implements Serializable {

	/**
	 * 序列化UID
	 */
	private static final long serialVersionUID = -5837614681758513702L;
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

	/**
	 * 获取计数器
	 */
	private int count;

	/**
	 * 计数器
	 * 
	 * @return 计数器
	 */
	public int getCount() {
		return count;
	}

	/**
	 * 设置计数器
	 * 
	 * @param count 计数器
	 */
	public void setCount(int count) {
		this.count = count;
	}

//	/**
//	 * 保证序列化结果唯一
//	 * 
//	 * @return 实例
//	 */
//	protected Object readResolve() {
//		return INTANCE;
//	}
}
