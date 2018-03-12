/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.pattern.factory.service;

/**
 * 鞋子服务工厂
 */
public final class ShoesServiceFactory {

	/**
	 * 私有构造函数
	 */
	private ShoesServiceFactory() {
		// 什么都不做
	}

	/**
	 * 创建鞋子生产接口
	 * 
	 * @return 鞋子生产接口
	 */
	public static ShoesProduceService createShoesProduceService() {
		return new ShoesProduceServiceImpl();
	}

	/**
	 * 创建鞋子配送接口
	 * 
	 * @return 鞋子配送接口
	 */
	public static ShoesDeliveryService createShoesDeliveryService() {
		return new ShoesDeliveryServiceImpl();
	}
}
