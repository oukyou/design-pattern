/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.pattern.factory.factory;

import com.oukyou.pattern.factory.service.ShoesDeliveryService;
import com.oukyou.pattern.factory.service.ShoesProduceService;

/**
 * 鞋子抽象工厂
 */
public abstract class AbstractShoesFactory {

	/**
	 * 获取鞋子生产接口
	 * 
	 * @return 鞋子生产接口
	 */
	public abstract ShoesProduceService getShoesProduceService();

	/**
	 * 获取鞋子配送接口
	 * 
	 * @return 鞋子配送接口
	 */
	public abstract ShoesDeliveryService getShoesDevlieryService();
}
