/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/09.
 */
package com.oukyou.pattern.prototype.simple;

/**
 * 羊
 */
public class Sheep implements Cloneable {

	/**
	 * 体重
	 */
	private Double weight;
	/**
	 * 年龄
	 */
	private int age;

	/**
	 * 羊食物
	 */
	private SheepFood sheepFood;

	/**
	 * 获取体重
	 * 
	 * @return 体重
	 */
	public Double getWeight() {
		return weight;
	}

	/**
	 * 设置体重
	 * 
	 * @param weight 体重
	 */
	public void setWeight(Double weight) {
		this.weight = weight;
	}

	/**
	 * 获取年龄
	 * 
	 * @return 年龄
	 */
	public int getAge() {
		return age;
	}

	/**
	 * 设置年龄
	 * 
	 * @param age 年龄
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 获取羊食物
	 * 
	 * @return 羊食物
	 */
	public SheepFood getSheepFood() {
		return sheepFood;
	}

	/**
	 * 设置羊食物
	 * 
	 * @param 羊食物
	 */
	public void setSheepFood(SheepFood sheepFood) {
		this.sheepFood = sheepFood;
	}

	/**
	 * 重写克隆
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
