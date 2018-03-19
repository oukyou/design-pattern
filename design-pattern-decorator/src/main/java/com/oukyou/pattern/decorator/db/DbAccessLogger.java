/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/15.
 */
package com.oukyou.pattern.decorator.db;

import com.oukyou.pattern.decorator.log.Logger;

/**
 * 数据库连接日志
 */
public interface DbAccessLogger extends Logger{

	/**
	 * 追加日志
	 * 
	 * @param msgs 日志内容
	 */
	public void add(String... msgs);

}
