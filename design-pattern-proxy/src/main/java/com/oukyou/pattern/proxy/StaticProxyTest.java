/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/12.
 */
package com.oukyou.pattern.proxy;

import com.oukyou.pattern.proxy.staticed.Oubb;
import com.oukyou.pattern.proxy.staticed.Oukyou;

/**
 * 静态代理模式测试
 */
public class StaticProxyTest {
	
	/**
	 * 执行方法
	 * 
	 * @param args 入力参数
	 */
	public static void main(String[] args) {
		Oukyou oukyou = new Oukyou(new Oubb());
		oukyou.doBuy();
	}
}
