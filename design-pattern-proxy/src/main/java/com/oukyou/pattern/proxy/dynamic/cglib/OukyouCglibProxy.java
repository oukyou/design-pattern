/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/13.
 */
package com.oukyou.pattern.proxy.dynamic.cglib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * OukyouCglib代理
 */
public final class OukyouCglibProxy implements MethodInterceptor {

	/**
	 * 获取对象实例
	 * 
	 * @param clazz 父类
	 * @return 实例
	 */
	public Object getInstance(Class<?> clazz) {

		Enhancer enhancer = new Enhancer();
		// 设置父类
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);

		return enhancer.create();

	}

	/**
	 * @see MethodInterceptor#intercept(Object, Method, Object[], MethodProxy)
	 */
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		methodProxy.invokeSuper(o, objects);
		System.out.println("我是代购小王，正在为您挑选便宜的货源。");
		return null;
	}
}
