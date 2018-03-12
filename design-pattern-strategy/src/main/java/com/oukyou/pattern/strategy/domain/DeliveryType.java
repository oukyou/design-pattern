/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/12.
 */
package com.oukyou.pattern.strategy.domain;

/**
 * 快递种类
 */
public enum DeliveryType {
	/**
	 * EMS
	 */
	EMS(new Ems()),
	/**
	 * SAL
	 */
	SAL(new Sal()),
	/**
	 * SHIP
	 */
	SHIP(new Ship());

	/**
	 * 快递
	 */
	private ExpressDelivery delivery;

	/**
	 * 私有构造函数
	 * 
	 * @param delivery 快递
	 */
	private DeliveryType(ExpressDelivery delivery) {
		this.delivery = delivery;
	}

	/**
	 * 获取快递
	 * 
	 * @return 快递
	 */
	public ExpressDelivery getExpressDelivery() {
		return this.delivery;
	}
}
