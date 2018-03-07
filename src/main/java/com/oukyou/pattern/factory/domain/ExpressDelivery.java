/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.pattern.factory.domain;

/**
 * 快递
 */
public abstract class ExpressDelivery {
	/**
	 * 品牌名
	 */
	protected String shoesName;

	/**
	 * 快递名
	 */
	protected String name;

	/**
	 * 获取品牌名
	 * 
	 * @return 品牌名
	 */
	public String getShoesName() {
		return shoesName;
	}

	/**
	 * 获取快递名
	 * 
	 * @return 快递名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 接受配送
	 */
	public void accept() {
		System.out.println("已接受使用" + name + "配送" + shoesName + "牌鞋子。");
	}
	
	/**
	 * 获取配送状态
	 */
	public abstract void getDeliveryStatus();
}
