/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/15.
 */
package com.oukyou.pattern.adapter.log;

import java.util.Date;

/**
 * íˆèòì˙éu
 */
public final class ApplicationLogger implements Logger {

	/**
	 * @see Logger#info(String...)
	 */
	@Override
	public void info(String... msgs) {
		StringBuilder logBuilder = new StringBuilder("Application info log:");
		logBuilder.append(new Date().toString());
		for (String msg : msgs) {
			logBuilder.append(",").append(msg);
		}

		System.out.println(logBuilder.toString());
	}

	/**
	 * @see Logger#warn(String...)
	 */
	@Override
	public void warn(String... msgs) {
		StringBuilder logBuilder = new StringBuilder("Application warnning log:");
		logBuilder.append(new Date().toString());
		for (String msg : msgs) {
			logBuilder.append(",").append(msg);
		}

		System.out.println(logBuilder.toString());
	}

	/**
	 * @see Logger#error(String...)
	 */
	@Override
	public void error(String... msgs) {
		StringBuilder logBuilder = new StringBuilder("Application error log:");
		logBuilder.append(new Date().toString());
		for (String msg : msgs) {
			logBuilder.append(",").append(msg);
		}

		System.out.println(logBuilder.toString());
	}

}
