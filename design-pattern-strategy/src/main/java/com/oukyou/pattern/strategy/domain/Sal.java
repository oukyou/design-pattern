/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/12.
 */
package com.oukyou.pattern.strategy.domain;

/**
 * Sal
 */
public final class Sal implements ExpressDelivery {

	/**
	 * @see ExpressDelivery#delivery()
	 */
	@Override
	public String delivery() {
		System.out.println("欢迎使用SAL，预计2周后到达目的地。");
		return "已经到达目的地海关，正在准备通关手续。";
	}

}
