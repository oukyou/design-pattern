/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/08.
 */
package com.oukyou.pattern.singleton.enums;

/**
 * 枚举型单例
 */
public enum EnumSingleton {

	ADMIN, GUEST;

	// 这里隐藏了一个空的私有构造方法
	private EnumSingleton() {
	}
}