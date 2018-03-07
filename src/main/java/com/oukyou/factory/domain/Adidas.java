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
		System.out.println("订单创建完成@" + name);
	}

	/**
	 * @see Shoes#getProduceStatus()
	 */
	@Override
	public String getProduceStatus() {
		return "已经生产了" + (count - 120) + "双" + color + "色，"
				+ String.valueOf(size) + "码, " + name + "牌鞋子了。";
	}
}
