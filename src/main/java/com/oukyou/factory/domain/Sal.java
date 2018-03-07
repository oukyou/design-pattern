/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.factory.domain;

/**
 * 空运
 */
public final class Sal extends ExpressDelivery {

	/**
	 * 构造函数
	 * 
	 * @param shoesName 鞋子品牌
	 */
	public Sal(String shoesName) {
		this.shoesName = shoesName;
		this.name = "空运";
	}

	/**
	 * @see ExpressDelivery#getDeliveryStatus()
	 */
	@Override
	public void getDeliveryStatus() {
		System.out.println("当前配送的" + shoesName + "牌鞋子已经到达海关，正在进行报关手续。");
	}
}
