/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/20.
 */
package com.oukyou.pattern.observer.core;

/**
 *
 * 变态者事件
 */
public final class MetamorphosisEvent extends Event {

	/**
	 * 构造方法
	 * 
	 * @param source 袭击对象
	 */
	public MetamorphosisEvent(Object source) {
		super(source);
		System.err.println("变态:发现一个女子高中生！！");
	}
}