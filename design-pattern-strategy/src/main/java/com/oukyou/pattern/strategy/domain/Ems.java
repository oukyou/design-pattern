/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/12.
 */
package com.oukyou.pattern.strategy.domain;

/**
 * Ems
 */
public class Ems implements ExpressDelivery {

	/**
	 * @see ExpressDelivery#delivery()
	 */
	@Override
	public String delivery() {
		System.out.println("欢迎使用EMS，预计3天后到达目的地。");
		return "已经到达目的地。";
	}

}
