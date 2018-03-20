/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/20.
 */
package com.oukyou.pattern.observer;

import com.oukyou.pattern.observer.observer.FatherObserver;
import com.oukyou.pattern.observer.observer.PoliceObserver;
import com.oukyou.pattern.observer.subject.ShounanJK;

/**
 * 观察者模式测试
 */
public final class ObserverPatternTest {
	/**
	 * 执行方法
	 * 
	 * @param args 参数
	 */
	public static void main(String[] args) {
		ShounanJK shounanJK = new ShounanJK();

		// 发现变态要向警察报警
		PoliceObserver policeObserver = new PoliceObserver();
		shounanJK.addObserver(policeObserver);

		// 发现变态要告诉父亲
		FatherObserver fatherObserver = new FatherObserver();
		shounanJK.addObserver(fatherObserver);

		// 变态出没
		shounanJK.metamorphosisAppear();
	}
}
