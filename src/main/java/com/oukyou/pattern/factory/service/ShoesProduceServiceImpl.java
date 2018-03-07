/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月7日
 */
package com.oukyou.pattern.factory.service;

import com.oukyou.pattern.factory.domain.Adidas;
import com.oukyou.pattern.factory.domain.Jordon;
import com.oukyou.pattern.factory.domain.Nike;

/**
 * 鞋子生产接口实现
 */
public final class ShoesProduceServiceImpl implements ShoesProduceService {

	/**
	 * 鞋子生产
	 * 
	 * @param name 品牌
	 * @param color 颜色
	 * @param size 码数
	 * @param count 双数
	 */
	@Override
	public void produce(String name, String color, Double size, int count) {
		if ("Nike".equals(name)) {
			Nike nike = new Nike(color, size, count);
			nike.accept();
		} else if ("Adidas".equals(name)) {
			Adidas adidas = new Adidas(color, size, count);
			adidas.accept();
		} else if ("Jordon".equals(name)) {
			Jordon jordon = new Jordon(color, size, count);
			jordon.accept();
		} else {
			System.err.println("我们不生产" + name + "品牌的鞋子。");
		}
	}
}
