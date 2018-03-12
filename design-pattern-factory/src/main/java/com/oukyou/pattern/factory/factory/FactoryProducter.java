/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.pattern.factory.factory;

/**
 * 工厂生成器
 */
public final class FactoryProducter {

	/**
	 * 私有构造函数
	 */
	private FactoryProducter() {
		// 什么都不做
	}
	/**
	 * 获取鞋子生产工厂
	 * 
	 * @param option 操作
	 * @return 鞋子生产工厂
	 */
	public static AbstractShoesFactory getFactory(String option) {
		AbstractShoesFactory factory = null;

		if ("produce".equals(option)) {
			// 如果是生产，创建鞋子生产工厂
			factory = new ShoesProduceFactory();
		} else if ("delivery".equals(option)) {
			// 如果是配送，创建鞋子生产工厂
			factory = new ShoesDeliveryFactory();
		}

		return factory;
	}
}
