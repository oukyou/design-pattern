/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.factory;

import com.oukyou.factory.domain.Adidas;
import com.oukyou.factory.domain.Jordon;
import com.oukyou.factory.domain.Nike;
import com.oukyou.factory.domain.Shoes;

/**
 * 鞋子生产工厂
 */
public final class ShoesProduceFactory extends AbstractShoesFactory {

	/**
	 * @see AbstractShoesFactory#produceNike(String, Double, int)
	 */
	@Override
	public Shoes produceNike(String color, Double size, int count) {
		return new Nike(color, size, count);
	}

	/**
	 * @see AbstractShoesFactory#produceNike(String, Double, int)
	 */
	@Override
	public Shoes produceAdidas(String color, Double size, int count) {
		return new Adidas(color, size, count);
	}

	/**
	 * @see AbstractShoesFactory#produceNike(String, Double, int)
	 */
	@Override
	public Shoes produceJordon(String color, Double size, int count) {
		return new Jordon(color, size, count);
	}
}
