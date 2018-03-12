/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/09.
 */
package com.oukyou.pattern.prototype.deep;

import java.io.Serializable;

/**
 * 电脑
 */
public final class Computer implements Serializable {
	/**
	 * 序列化UID
	 */
	private static final long serialVersionUID = 8642737602596930419L;
	/**
	 * 类型
	 */
	private String type;

	/**
	 * 获取类型
	 * 
	 * @return 类型
	 */
	public String getType() {
		return type;
	}

	/**
	 * 设置类型
	 * 
	 * @param type 类型
	 */
	public void setType(String type) {
		this.type = type;
	}
}
