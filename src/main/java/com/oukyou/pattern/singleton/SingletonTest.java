/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/08.
 */
package com.oukyou.pattern.singleton;

import com.oukyou.pattern.singleton.enums.EnumSingleton;
import com.oukyou.pattern.singleton.inner.StaticInnerSingleton;
import com.oukyou.pattern.singleton.register.RegisterSingleton;
import com.oukyou.pattern.singleton.simple.HungrySingleton;
import com.oukyou.pattern.singleton.simple.LazySingletonThreadSafe;
import com.oukyou.pattern.singleton.simple.LazySingletonUnThreadSafe;

/**
 * 单例模式测试
 */
public class SingletonTest {

	/**
	 * 执行方法
	 * 
	 * @param args 入力参数
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		for (int i = 0; i < 10; i++) {
			createLazySingletonUnThreadSafeThread();
		}

		Thread.sleep(1000);
		System.out.println("----------------华丽的分割线----------------");

		for (int i = 0; i < 10; i++) {
			createLazySingletonThreadSafeThread();
		}

		Thread.sleep(1000);
		System.out.println("----------------华丽的分割线----------------");

		for (int i = 0; i < 10; i++) {
			createHungrySingletonThread();
		}

		Thread.sleep(1000);
		System.out.println("----------------华丽的分割线----------------");

		for (int i = 0; i < 10; i++) {
			createStaticInnerSingletonThread();
		}

		Thread.sleep(1000);
		System.out.println("----------------华丽的分割线----------------");

		for (int i = 0; i < 10; i++) {
			createEnumSingletonThread();
		}

		Thread.sleep(1000);
		System.out.println("----------------华丽的分割线----------------");

		for (int i = 0; i < 10; i++) {
			createRegisterSingletonThread();
		}
	}

	private static void createLazySingletonUnThreadSafeThread() {
		new Thread() {
			public void run() {
				System.out.println(LazySingletonUnThreadSafe.getInstance());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			};
		}.start();
	}

	private static void createLazySingletonThreadSafeThread() {
		new Thread() {
			public void run() {
				System.out.println(LazySingletonThreadSafe.getInstance());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			};
		}.start();
	}

	private static void createHungrySingletonThread() {
		new Thread() {
			public void run() {
				System.out.println(HungrySingleton.getInstance());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			};
		}.start();
	}

	private static void createStaticInnerSingletonThread() {
		new Thread() {
			public void run() {
				System.out.println(StaticInnerSingleton.getInstance());
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			};
		}.start();
	}

	private static void createEnumSingletonThread() {
		new Thread() {
			public void run() {
				System.out.println(EnumSingleton.ADMIN);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			};
		}.start();
	}

	private static void createRegisterSingletonThread() {
		new Thread() {
			public void run() {
				System.out.println(RegisterSingleton.getInstance(null));
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			};
		}.start();
	}

}
