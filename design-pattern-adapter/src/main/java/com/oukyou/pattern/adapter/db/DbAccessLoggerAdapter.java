/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/15.
 */
package com.oukyou.pattern.adapter.db;

import com.oukyou.pattern.adapter.log.Logger;

/**
 * 数据库日志适配器
 */
public final class DbAccessLoggerAdapter implements DbAccessLogger {

	/**
	 * 日志
	 */
	private Logger logger;

	/**
	 * 构造方法
	 * 
	 * @param logger 日志
	 */
	public DbAccessLoggerAdapter(Logger logger) {
		this.logger = logger;
	}

	/**
	 * @see DbAccessLogger#add(String...)
	 */
	@Override
	public void add(String... msgs) {
		logger.info(msgs);

		StringBuilder logBuilder = new StringBuilder("DbAccess log:");
		for (String msg : msgs) {
			logBuilder.append(",").append(msg);
		}

		System.out.println(logBuilder.toString());

		logger.warn("There is no warnning.");
		logger.error("There is no error.");
	}

}
