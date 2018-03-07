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
 * 鞋子生产工厂
 */
public final class ShoesProduceFactory extends AbstractShoesFactory {

	/**
	 * @see AbstractShoesFactory#getShoesProduceService()
	 */
	@Override
	public ShoesProduceService getShoesProduceService() {
		return ShoesServiceFactory.createShoesProduceService();
	}

	/**
	 * @see AbstractShoesFactory#getShoesDevlieryService()
	 */
	@Override
	public ShoesDeliveryService getShoesDevlieryService() {
		return null;
	}

}
