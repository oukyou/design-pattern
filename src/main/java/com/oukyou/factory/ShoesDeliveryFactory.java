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
 * 鞋子配送工厂
 */
public class ShoesDeliveryFactory extends AbstractShoesFactory {

	/**
	 * @see AbstractShoesFactory#getShoesProduce()
	 */
	@Override
	public ShoesProduce getShoesProduce() {
		return null;
	}

	/**
	 * @see AbstractShoesFactory#getShoesProduce()
	 */
	@Override
	public ShoesDelivery getShoesDevliery() {
		return ShoesServiceFactory.createShoesDelivery();
	}

}