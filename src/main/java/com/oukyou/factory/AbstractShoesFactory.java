/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.factory;

import com.oukyou.factory.domain.Shoes;

/**
 * 鞋子抽象工厂
 */
public abstract class AbstractShoesFactory {
	/**
	 * 生产Nike鞋子
	 * 
	 * @param color 颜色
	 * @param size 码数
	 * @param count 双数
	 * @return Nike鞋子
	 */
	public abstract Shoes produceNike(String color, Double size, int count);

	/**
	 * 生产Adidas鞋子
	 * 
	 * @param color 颜色
	 * @param size 码数
	 * @param count 双数
	 * @return Adidas鞋子
	 */
	public abstract Shoes produceAdidas(String color, Double size, int count);

	/**
	 * 生产Jordon鞋子
	 * 
	 * @param color 颜色
	 * @param size 码数
	 * @param count 双数
	 * @return Jordon鞋子
	 */
	public abstract Shoes produceJordon(String color, Double size, int count);
}
