/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.factory.service;

/**
 * 鞋子生产接口
 */
public interface ShoesProduce {

	/**
	 * 鞋子生产
	 * 
	 * @param name 品牌
	 * @param color 颜色
	 * @param size 码数
	 * @param count 双数
	 */
	public void produce(String name, String color, Double size, int count);
}
