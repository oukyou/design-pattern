/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/20.
 */
package com.oukyou.pattern.observer.subject;

import java.util.ArrayList;
import java.util.List;

import com.oukyou.pattern.observer.core.Event;
import com.oukyou.pattern.observer.observer.Observer;

/**
 * 被观察者
 */
public class Subject {

	/**
	 * 观察者对象一览
	 */
	private List<Observer> observerList = new ArrayList<Observer>();

	/**
	 * 向观察者通报
	 * 
	 * @param event 发生的事件
	 */
	public void notifyObservers(Event event) {
		for (Observer observer : observerList) {
			observer.notify(event);
		}
	}

	/**
	 * 添加观察者
	 * 
	 * @param observer 观察者
	 */
	public void addObserver(Observer observer) {
		observerList.add(observer);
	}
}
