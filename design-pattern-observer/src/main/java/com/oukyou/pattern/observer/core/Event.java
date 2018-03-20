/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/20.
 */
package com.oukyou.pattern.observer.core;

/**
 * 事件
 */
public class Event {

	/**
	 * 目标对象
	 */
	private final Object target;

	/**
	 * 构造方法
	 * 
	 * @param target 目标对象
	 */
	public Event(Object target) {
		this.target = target;
	}

	/**
	 * 获取目标对象
	 * 
	 * @return 目标对象
	 */
	public Object getTarget() {
		return target;
	}

}