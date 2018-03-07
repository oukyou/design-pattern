/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.factory.domain;

/**
 * Jordon牌鞋子
 */
public final class Jordon extends Shoes {
	
	/**
	 * 构造方法
	 * 
	 * @param color 颜色
	 * @param size 码数
	 * @param count 双数
	 */
	public Jordon(String color, Double size, int count) {
		super(color, size, count);
		this.name = "Jordon";
		System.out.println("订单创建完成@" + name);
	}

	/**
	 * @see Shoes#getProduceStatus()
	 */
	@Override
	public String getProduceStatus() {
		return "已经生产了" + count + "双" + color + "色，" + String.valueOf(size)
				+ "码, " + name + "牌鞋子了。订单完成！";
	}
}
