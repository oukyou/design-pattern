/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.factory.domain;

/**
 * Adidas牌鞋子
 */
public final class Adidas extends Shoes {

	/**
	 * 构造方法
	 * 
	 * @param color 颜色
	 * @param size 码数
	 * @param count 双数
	 */
	public Adidas(String color, Double size, int count) {
		super(color, size, count);
		this.name = "Adidas";
	}
}
