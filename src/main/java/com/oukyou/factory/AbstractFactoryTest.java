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
		// 获取鞋子生产工厂
		AbstractShoesFactory proFac = FactoryProducter.getFactory("produce");
		ShoesProduce shoesProduce = proFac.getShoesProduce();
		// 生产存在品牌鞋子
		shoesProduce.produce("Nike", "Red", 41D, 100);
		shoesProduce.produce("Adidas", "Blue", 42D, 200);
		shoesProduce.produce("Jordon", "White", 43D, 300);
		// 生产不存在品牌鞋子
		shoesProduce.produce("LiNing", "Green", 43D, 300);

		// 获取鞋子生产工厂
		AbstractShoesFactory delFac = FactoryProducter.getFactory("delivery");
		ShoesDelivery shoesDelivery = delFac.getShoesDevliery();
		// 使用已知快递配送鞋子
		shoesDelivery.delivery("Nike", "ems");
		shoesDelivery.delivery("Adidas", "sal");
		shoesDelivery.delivery("Jordon", "ship");
		// 使用未知快递配送鞋子
		shoesDelivery.delivery("Nike", "DHL");

		// 查询已知快递配送状态
		shoesDelivery.getDeliveryStatus("Adidas", "ems");
		shoesDelivery.getDeliveryStatus("Jordon", "sal");
		shoesDelivery.getDeliveryStatus("Nike", "ship");
		// 查询未知快递配送状态
		shoesDelivery.getDeliveryStatus("Nike", "SF");

	}
}
