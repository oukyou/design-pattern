/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.pattern.factory.domain;

/**
 * 鞋子
 */
public class Shoes {

	/**
	 * 品牌名
	 */
	protected String name;

	/**
	 * 颜色
	 */
	protected String color;

	/**
	 * 码数
	 */
	protected Double size;

	/**
	 * 双数
	 */
	protected int count;

	/**
	 * 构造方法
	 * 
	 * @param color 颜色
	 * @param size 码数
	 * @param count 双数
	 */
	public Shoes(String color, Double size, int count) {
		this.color = color;
		this.size = size;
		this.count = count;
	}

	/**
	 * 获取品牌名
	 * 
	 * @return 品牌名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 获取颜色
	 * 
	 * @return 颜色
	 */
	public String getColor() {
		return color;
	}

	/**
	 * 获取码数
	 * 
	 * @return 码数
	 */
	public Double getSize() {
		return size;
	}

	/**
	 * 获取双数
	 * 
	 * @return 双数
	 */
	public int getCount() {
		return count;
	}

	/**
	 * 接受订单
	 */
	public void accept() {
		System.out.println("已接受生产" + count + "双" + color + "色，"
				+ String.valueOf(size) + "码，" + name + "牌鞋子的订单。");
	}
}
