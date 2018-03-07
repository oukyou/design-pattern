/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.factory;

import com.oukyou.factory.service.ShoesDelivery;
import com.oukyou.factory.service.ShoesProduce;

/**
 * 鞋子抽象工厂
 */
public abstract class AbstractShoesFactory {

	/**
	 * 获取鞋子生产接口
	 * 
	 * @return 鞋子生产接口
	 */
	public abstract ShoesProduce getShoesProduce();

	/**
	 * 获取鞋子配送接口
	 * 
	 * @return 鞋子配送接口
	 */
	public abstract ShoesDelivery getShoesDevliery();
}
