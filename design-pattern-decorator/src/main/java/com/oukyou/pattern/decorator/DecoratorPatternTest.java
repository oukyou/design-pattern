/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/15.
 */
package com.oukyou.pattern.decorator;

import java.util.Date;

import com.oukyou.pattern.decorator.db.DbAccessLogger;
import com.oukyou.pattern.decorator.db.DbAccessLoggerImpl;
import com.oukyou.pattern.decorator.log.ApplicationLogger;
import com.oukyou.pattern.decorator.log.Logger;
import com.oukyou.pattern.decorator.log.SystemLogger;

/**
 * 装饰器模式测试
 */
public final class DecoratorPatternTest {

	/**
	 * Main执行方法
	 * 
	 * @param args 入力参数
	 */
	public static void main(String[] args) {
		// 程序日志
		Logger appLogger = new ApplicationLogger();
		DbAccessLogger dbLogger = new DbAccessLoggerImpl(appLogger);
		dbLogger.info("app-column-name", "app-column-age");
		dbLogger.add(new Date().toString(), "column-name", "column-age");

		System.out.println("-------------------");

		// 系統日志
		Logger sysLogger = new SystemLogger();
		dbLogger = new DbAccessLoggerImpl(sysLogger);
		dbLogger.add(new Date().toString(), "column-name", "column-age");
		dbLogger.error("error-column-name", "error-column-age");
	}
}
