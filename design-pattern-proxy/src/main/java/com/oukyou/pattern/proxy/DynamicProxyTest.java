/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/13.
 */
package com.oukyou.pattern.proxy;

import com.oukyou.pattern.proxy.dynamic.cglib.OukyouCglibProxy;
import com.oukyou.pattern.proxy.dynamic.jdk.OukyouJDKProxy;
import com.oukyou.pattern.proxy.staticed.Buyer;
import com.oukyou.pattern.proxy.staticed.Oubb;

/**
 * 动态代理模式测试
 */
public class DynamicProxyTest {

	/**
	 * 执行方法
	 * 
	 * @param args 入力参数
	 */
	public static void main(String[] args) {
		// JDK动态代理测试
		Buyer buyer = new Oubb();
		OukyouJDKProxy oukyouJDKProxy = new OukyouJDKProxy(buyer);
		Buyer buyerProxy = (Buyer) oukyouJDKProxy.getProxy();
		buyerProxy.buyCosmetic();

		// Cglib动态代理测试
		OukyouCglibProxy OukyouCglibProxy = new OukyouCglibProxy();
		Oubb oubb = (Oubb) OukyouCglibProxy.getInstance(Oubb.class);
		oubb.buyCosmetic();
	}
}
