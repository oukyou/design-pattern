/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/15.
 */
package com.oukyou.pattern.adapter.log;

/**
 * 日志
 */
public interface Logger {

	/**
	 * 记录情报日志
	 * 
	 * @param msgs 日志内容
	 */
	public void info(String... msgs);

	/**
	 * 记录警告日志
	 * 
	 * @param msgs 日志内容
	 */
	public void warn(String... msgs);

	/**
	 * 记录错误日志
	 * 
	 * @param msgs 日志内容
	 */
	public void error(String... msgs);
}
