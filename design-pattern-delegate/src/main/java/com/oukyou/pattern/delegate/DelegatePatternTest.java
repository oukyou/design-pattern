/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/15.
 */
package com.oukyou.pattern.delegate;

/**
 * 委托模式测试
 */
public final class DelegatePatternTest {

	/**
	 * Main执行方法
	 * 
	 * @param args 入力参数
	 */
	public static void main(String[] args) {
		// 亲属关系公证
		DelegatePerson kinshipPerson = new DelegatePerson("亲属关系");
		kinshipPerson.notarization();

		// 学历关系公证
		DelegatePerson eduPerson = new DelegatePerson("学历");
		eduPerson.notarization();

		// 财产公证
		DelegatePerson housePerson = new DelegatePerson("财产");
		housePerson.notarization();
	}
}
