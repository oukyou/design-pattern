/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/20.
 */
package com.oukyou.pattern.observer.observer;

import com.oukyou.pattern.observer.core.Event;
import com.oukyou.pattern.observer.core.MetamorphosisEvent;

/**
 * 警察观察者
 */
public class PoliceObserver implements Observer {

	/**
	 * @see Observer#notify(Event)
	 */
	@Override
	public void notify(Event event) {
		System.out.printf("警察：<%s 报警%n", event.getTarget());
		if (event instanceof MetamorphosisEvent) {
			System.err.println("    --->>>发现一个变态，立刻逮捕!!<<<---");
		}
	}
}
