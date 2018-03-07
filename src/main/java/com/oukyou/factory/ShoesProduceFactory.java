/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.factory;

import com.oukyou.factory.service.ShoesDelivery;
import com.oukyou.factory.service.ShoesProduce;
import com.oukyou.factory.service.ShoesServiceFactory;

/**
 * 鞋子生产工厂
 */
public final class ShoesProduceFactory extends AbstractShoesFactory {

	/**
	 * @see AbstractShoesFactory#getShoesProduce()
	 */
	@Override
	public ShoesProduce getShoesProduce() {
		return ShoesServiceFactory.createShoesProduce();
	}

	/**
	 * @see AbstractShoesFactory#getShoesDevliery()
	 */
	@Override
	public ShoesDelivery getShoesDevliery() {
		return null;
	}

}
