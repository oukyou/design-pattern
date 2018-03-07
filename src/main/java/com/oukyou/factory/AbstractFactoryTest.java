/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.factory;

import com.oukyou.factory.domain.Shoes;

/**
 * 抽象工厂测试
 */
public class AbstractFactoryTest {

	/**
	 * Main执行方法
	 * 
	 * @param args 入力参数
	 * @throws InterruptedException 线程中断例外
	 */
	public static void main(String[] args) throws InterruptedException {
		// 获取鞋子抽象工厂
		AbstractShoesFactory factory = FactoryProducter.getFactory();
		// 生产不同品牌的鞋子
		Shoes nike = factory.produceNike("GREEN", 41D, 100);
		Shoes adidas = factory.produceAdidas("BLUE", 42D, 200);
		Shoes jordon = factory.produceJordon("WHITE", 43D, 300);

		Thread.sleep(1000);

		// 查询生产进度
		System.out.println(nike.getProduceStatus());
		System.out.println(adidas.getProduceStatus());
		System.out.println(jordon.getProduceStatus());
	}
}
