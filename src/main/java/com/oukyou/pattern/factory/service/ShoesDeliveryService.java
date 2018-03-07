/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.pattern.factory.service;

/**
 * 鞋子配送接口
 */
public interface ShoesDeliveryService {

	/**
	 * 配送
	 * 
	 * @param shoesName 鞋子品牌
	 * @param deliveryName 快递名称
	 */
	public void delivery(String shoesName, String deliveryName);

	/**
	 * 获取快递状态
	 * 
	 * @param shoesName 鞋子品牌
	 * @param deliveryName 快递名称
	 */
	public void getDeliveryStatus(String shoesName, String deliveryName);

}
