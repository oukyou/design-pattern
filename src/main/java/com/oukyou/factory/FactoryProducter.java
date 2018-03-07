/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.factory;

/**
 * 工厂生成器
 */
public final class FactoryProducter {

	/**
	 * 获取鞋子生产工厂
	 * 
	 * @return 鞋子生产工厂
	 */
	public static AbstractShoesFactory getFactory() {
		return new ShoesProduceFactory();
	}
}
