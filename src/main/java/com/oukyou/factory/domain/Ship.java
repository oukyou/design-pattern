/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.factory.domain;

/**
 * 船运
 */
public final class Ship extends ExpressDelivery {

	/**
	 * 构造函数
	 * 
	 * @param shoesName 鞋子品牌
	 */
	public Ship(String shoesName) {
		this.shoesName = shoesName;
		this.name = "船运";
	}

	/**
	 * @see ExpressDelivery#getDeliveryStatus()
	 */
	@Override
	public void getDeliveryStatus() {
		System.out.println("当前配送的" + shoesName + "牌鞋子快递还在海上，请耐心等候。");
	}
}
