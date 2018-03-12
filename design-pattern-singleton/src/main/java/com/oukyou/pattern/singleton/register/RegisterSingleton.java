/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/09.
 */
package com.oukyou.pattern.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 注册式单例
 */
public final class RegisterSingleton {

	/**
	 * 注册容器
	 */
	private static Map<String, Object> regisMap = new ConcurrentHashMap<String, Object>();

	/**
	 * 获取实例<br>
	 * 为保证线程安全，需要加synchronized同步锁
	 * 
	 * @param className 类名
	 * @return 实例
	 */
	public static synchronized RegisterSingleton getInstance(String className) {
		RegisterSingleton instance = null;
		if (className == null) {
			className = RegisterSingleton.class.getName();
		}

		if (regisMap.containsKey(className)) {
			instance = (RegisterSingleton) regisMap.get(className);
		} else {
			try {
				instance = RegisterSingleton.class.newInstance();
				regisMap.put(className, instance);
			} catch (Exception e) {
				instance = null;
			}
		}
		return instance;
	}
}
