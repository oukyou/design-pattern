/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/12.
 */
package com.oukyou.pattern.proxy.staticed;

/**
 * Oubb
 */
public final class Oubb implements Buyer {

	/**
	 * @see Buyer#buyCosmetic()
	 */
	@Override
	public void buyCosmetic() {
		System.out.println("我想买一套SK2化妆品。");
	}

}
