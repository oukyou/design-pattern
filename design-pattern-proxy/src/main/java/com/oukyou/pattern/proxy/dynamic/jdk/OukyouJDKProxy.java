/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/13.
 */
package com.oukyou.pattern.proxy.dynamic.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.oukyou.pattern.proxy.staticed.Buyer;

/**
 * OukyouJDK代理
 */
public final class OukyouJDKProxy implements InvocationHandler {

	/**
	 * 目标对象
	 */
	private Buyer target;

	/**
	 * 构造方法
	 * 
	 * @param buyer 买手
	 */
	public OukyouJDKProxy(Buyer buyer) {
		super();
		this.target = buyer;
	}

	/**
	 * 获取代理
	 * 
	 * @return 代理对象
	 */
	public Object getProxy() {
		return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), target.getClass().getInterfaces(),
				this);
	}

	/**
	 * @see InvocationHandler#invoke(Object, Method, Object[])
	 */
	@Override
	public Object invoke(Object obj, Method method, Object[] args) throws Throwable {
		Object result = method.invoke(target, args);
		System.out.println("我是代购小王，正在为您挑选便宜的货源。");
		return result;
	}

}
