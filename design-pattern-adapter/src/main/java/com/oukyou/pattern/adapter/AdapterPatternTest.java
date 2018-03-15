/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/15.
 */
package com.oukyou.pattern.adapter;

import java.util.Date;

import com.oukyou.pattern.adapter.db.DbAccessLogger;
import com.oukyou.pattern.adapter.db.DbAccessLoggerAdapter;
import com.oukyou.pattern.adapter.log.ApplicationLogger;
import com.oukyou.pattern.adapter.log.Logger;
import com.oukyou.pattern.adapter.log.SystemLogger;

/**
 * 适配器模式测试
 */
public final class AdapterPatternTest {

	/**
	 * Main执行方法
	 * 
	 * @param args 入力参数
	 */
	public static void main(String[] args) {
		// 程序日志
		Logger appLogger = new ApplicationLogger();
		DbAccessLogger dbLogger = new DbAccessLoggerAdapter(appLogger);
		dbLogger.add(new Date().toString(), "column-name", "column-age");

		System.out.println("-------------------");

		//系统日志
		Logger sysLogger = new SystemLogger();
		dbLogger = new DbAccessLoggerAdapter(sysLogger);
		dbLogger.add(new Date().toString(), "column-name", "column-age");
	}
}
