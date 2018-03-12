/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/12.
 */
package com.oukyou.pattern.strategy;

import com.oukyou.pattern.strategy.domain.DeliveryType;

/**
 * 快递订单
 */
public final class Order {

	/**
	 * 订单ID
	 */
	private String orderId;

	/**
	 * 构造方法
	 * 
	 * @param orderId 订单ID
	 */
	public Order(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * 配送
	 * 
	 * @param deliveryType 快递类型
	 * @return 配送结果
	 */
	public String delivery(DeliveryType deliveryType) {
		return "订单ID:" + orderId + "的快递状态是" + deliveryType.getExpressDelivery().delivery();
	}

}
