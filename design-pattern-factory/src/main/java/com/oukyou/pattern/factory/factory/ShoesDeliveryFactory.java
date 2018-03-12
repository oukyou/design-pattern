/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.pattern.factory.factory;

import com.oukyou.pattern.factory.service.ShoesDeliveryService;
import com.oukyou.pattern.factory.service.ShoesProduceService;
import com.oukyou.pattern.factory.service.ShoesServiceFactory;

/**
 * 鞋子配送工厂
 */
public final class ShoesDeliveryFactory extends AbstractShoesFactory {

	/**
	 * @see AbstractShoesFactory#getShoesProduceService()
	 */
	@Override
	public ShoesProduceService getShoesProduceService() {
		return null;
	}

	/**
	 * @see AbstractShoesFactory#getShoesProduceService()
	 */
	@Override
	public ShoesDeliveryService getShoesDevlieryService() {
		return ShoesServiceFactory.createShoesDeliveryService();
	}

}