/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/20.
 */
package com.oukyou.pattern.observer.subject;

import com.oukyou.pattern.observer.core.MetamorphosisEvent;

/**
 * 湘南女子高中生
 */
public final class ShounanJK extends Subject {

	/**
	 * 变态出没
	 */
	public void metamorphosisAppear() {
		MetamorphosisEvent event = new MetamorphosisEvent(this);
		System.out.println("女高:被变态抓住了，谁来救救我！！！");

		notifyObservers(event);
	}
}
