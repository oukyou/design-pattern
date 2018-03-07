/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.factory.domain;

/**
 * Nike牌鞋子
 */
public final class Nike extends Shoes {

	/**
	 * 构造方法
	 * 
	 * @param color 颜色
	 * @param size 码数
	 * @param count 双数
	 */
	public Nike(String color, Double size, int count) {
		super(color, size, count);
		this.name = "Nike";
		System.out.println("订单创建完成@" + name);
	}

	/**
	 * @see Shoes#getProduceStatus()
	 */
	@Override
	public String getProduceStatus() {
		return "已接受生产" + count + "双" + color + "色，" + String.valueOf(size)
				+ "码，" + name + "牌鞋子的订单。";
	}
}
