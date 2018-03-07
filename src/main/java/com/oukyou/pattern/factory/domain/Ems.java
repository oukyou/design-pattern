/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.pattern.factory.domain;

/**
 * EMS
 */
public final class Ems extends ExpressDelivery {

	/**
	 * 构造函数
	 * 
	 * @param shoesName 鞋子品牌
	 */
	public Ems(String shoesName) {
		this.shoesName = shoesName;
		this.name = "EMS";
	}

	/**
	 * @see ExpressDelivery#getDeliveryStatus()
	 */
	@Override
	public void getDeliveryStatus() {
		System.out.println("当前配送的" + shoesName + "牌鞋子即将到达。");
	}
}
