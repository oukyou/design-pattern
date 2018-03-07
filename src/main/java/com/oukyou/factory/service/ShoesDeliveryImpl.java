/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.factory.service;

import com.oukyou.factory.domain.Ems;
import com.oukyou.factory.domain.Sal;
import com.oukyou.factory.domain.Ship;

/**
 * 鞋子配送接口实现
 */
public class ShoesDeliveryImpl implements ShoesDelivery {

	/**
	 * 配送
	 * 
	 * @param shoesName 鞋子品牌
	 * @param deliveryName 快递名称
	 */
	@Override
	public void delivery(String shoesName, String deliveryName) {
		if ("ems".equals(deliveryName)) {
			Ems ems = new Ems(shoesName);
			ems.accept();
		} else if ("sal".equals(deliveryName)) {
			Sal sal = new Sal(shoesName);
			sal.accept();
		} else if ("ship".equals(deliveryName)) {
			Ship ship = new Ship(shoesName);
			ship.accept();
		} else {
			System.err.println("我们没有" + deliveryName + "的快递服务。");
		}
	}

	/**
	 * 获取快递状态
	 * 
	 * @param shoesName 鞋子品牌
	 * @param deliveryName 快递名称
	 */
	@Override
	public void getDeliveryStatus(String shoesName, String deliveryName) {
		if ("ems".equals(deliveryName)) {
			Ems ems = new Ems(shoesName);
			ems.getDeliveryStatus();
		} else if ("sal".equals(deliveryName)) {
			Sal sal = new Sal(shoesName);
			sal.getDeliveryStatus();
		} else if ("ship".equals(deliveryName)) {
			Ship ship = new Ship(shoesName);
			ship.getDeliveryStatus();
		} else {
			System.err.println("很抱歉，没有" + deliveryName + "的快递状态。");
		}
	}
}
