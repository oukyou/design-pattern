/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/12.
 */
package com.oukyou.pattern.strategy;

import com.oukyou.pattern.strategy.domain.DeliveryType;

/**
 * 策略模式测试
 */
public class StrategyPatternTest {
	/**
	 * 执行方法
	 * 
	 * @param args 入力参数
	 */
	public static void main(String[] args) {
		Order order = new Order("20180312194058253");
		// System.out.println(order.delivery(new Ems()));

		System.out.println(order.delivery(DeliveryType.EMS));
		System.out.println("--------------------");
		System.out.println(order.delivery(DeliveryType.SAL));
		System.out.println("--------------------");
		System.out.println(order.delivery(DeliveryType.SHIP));

	}
}
