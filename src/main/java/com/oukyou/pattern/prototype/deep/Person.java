/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/09.
 */
package com.oukyou.pattern.prototype.deep;

/**
 * 人
 */
public class Person {
	/**
	 * 姓名
	 */
	private String name;
	/**
	 * 年龄
	 */
	private int age;

	/**
	 * 获取姓名
	 * 
	 * @return 姓名
	 */
	public String getName() {
		return name;
	}

	/**
	 * 设置姓名
	 * 
	 * @param weight 姓名
	 */
	public void setName(String name) {
		this.name = name;
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
}
