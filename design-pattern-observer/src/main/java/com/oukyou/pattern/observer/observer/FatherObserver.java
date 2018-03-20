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
 * 父亲观察者
 */
public final class FatherObserver implements Observer {

	/**
	 * @see Observer#notify(Event)
	 */
	@Override
	public void notify(Event event) {
		System.out.printf("父亲：<%s 求救%n", event.getTarget());
		if (event instanceof MetamorphosisEvent) {
			System.err.println("    --->>>有变态骚扰女儿，马上去救援!!<<<---");
		}
	}

}
