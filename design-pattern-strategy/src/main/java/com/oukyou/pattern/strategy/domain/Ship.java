/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/12.
 */
package com.oukyou.pattern.strategy.domain;

/**
 * 海运
 */
public final class Ship implements ExpressDelivery {

	/**
	 * @see ExpressDelivery#delivery()
	 */
	@Override
	public String delivery() {
		System.out.println("欢迎使用海运，预计一个月后到达目的地。");
		return "目前货物还在海上，请耐心等待。";
	}

}
