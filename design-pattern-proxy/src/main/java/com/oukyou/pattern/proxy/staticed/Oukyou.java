/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/12.
 */
package com.oukyou.pattern.proxy.staticed;

/**
 * Oukyou
 */
public final class Oukyou {

	/**
	 * 买手
	 */
	private Buyer buyer;

	/**
	 * 构造方法
	 * 
	 * @param buyer 买手
	 */
	public Oukyou(Buyer buyer) {
		this.buyer = buyer;
	}

	/**
	 * 执行购买
	 */
	public void doBuy() {
		buyer.buyCosmetic();

		System.out.println("我是代购，准备帮你挑选价格便宜的SK2化妆品。");
	}
}
