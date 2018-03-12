/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/12.
 */
package com.oukyou.pattern.strategy.domain;

/**
 * 快递
 */
public interface ExpressDelivery {

	/**
	 * 配送
	 * 
	 * @return 配送结果
	 */
	public String delivery();
}
