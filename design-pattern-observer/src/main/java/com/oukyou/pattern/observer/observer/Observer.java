/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/20.
 */
package com.oukyou.pattern.observer.observer;

import com.oukyou.pattern.observer.core.Event;

/**
 * 观察者
 */
public interface Observer {
	/**
	 * 通知方法
	 * 
	 * @param e 事件
	 */
	public void notify(Event e);
}
