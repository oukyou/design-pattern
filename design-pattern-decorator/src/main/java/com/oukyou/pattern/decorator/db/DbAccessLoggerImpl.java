/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/15.
 */
package com.oukyou.pattern.decorator.db;

import com.oukyou.pattern.decorator.log.Logger;

/**
 * 数据库日志实现
 */
public final class DbAccessLoggerImpl implements DbAccessLogger {

	/**
	 * 日志
	 */
	private Logger logger;

	/**
	 * 构造方法
	 * 
	 * @param logger 日志
	 */
	public DbAccessLoggerImpl(Logger logger) {
		this.logger = logger;
	}

	/**
	 * @see DbAccessLogger#add(String...)
	 */
	@Override
	public void add(String... msgs) {
		StringBuilder logBuilder = new StringBuilder("DbAccess log:");
		for (String msg : msgs) {
			logBuilder.append(",").append(msg);
		}

		System.out.println(logBuilder.toString());
	}

	/**
	 * @see Logger#info(String...)
	 */
	@Override
	public void info(String... msgs) {
		logger.info(msgs);
	}

	/**
	 * @see Logger#warn(String...)
	 */
	@Override
	public void warn(String... msgs) {
		logger.warn(msgs);

	}

	/**
	 * @see Logger#error(String...)
	 */
	@Override
	public void error(String... msgs) {
		logger.error(msgs);
	}

}
