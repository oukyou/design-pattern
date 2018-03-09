/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/09.
 */
package com.oukyou.pattern.prototype.simple;

/**
 * 羊食物
 */
public final class SheepFood extends Sheep {

	/**
	 * 重写克隆
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
