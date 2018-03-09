/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/09.
 */
package com.oukyou.pattern.prototype;

import com.oukyou.pattern.prototype.deep.Oukyou;
import com.oukyou.pattern.prototype.simple.Sheep;
import com.oukyou.pattern.prototype.simple.SheepFood;

/**
 * 原型模式测试
 */
public class PrototypeTest {

	/**
	 * 执行方法
	 * 
	 * @param args 入力参数
	 * @throws CloneNotSupportedException 不支持克隆异常
	 */
	public static void main(String[] args) throws CloneNotSupportedException {
		Sheep sheep = new Sheep();
		sheep.setWeight(100D);
		sheep.setAge(2);
		sheep.setSheepFood(new SheepFood());

		// 浅克隆，创建一个地址引用
		Sheep sheep2 = (Sheep) sheep.clone();
		System.out.println(sheep.getSheepFood());
		System.out.println(sheep2.getSheepFood());
		System.out.println(sheep.getSheepFood() == sheep2.getSheepFood());

		Oukyou oukyou = new Oukyou();
		Oukyou oukyouCopy = (Oukyou) oukyou.clone();

		// 深克隆，完全复制一个新对象
		System.out.println(oukyou.getComputerList() );
		System.out.println(oukyouCopy.getComputerList());
		System.out.println(oukyou.getComputerList() == oukyouCopy.getComputerList());
	}
}
