/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/15.
 */
package com.oukyou.pattern.delegate;

/**
 * 委派对象
 */
public final class DelegatePerson {

	/**
	 * 公证类型
	 */
	private String notrayType;

	/**
	 * 构造方法
	 * 
	 * @param notrayType 公证类型
	 */
	public DelegatePerson(String notrayType) {
		this.notrayType = notrayType;
	}

	/**
	 * 办理公证
	 */
	public void notarization() {
		NotaryStaff notaryOffice = NotrayType.getNotaryStaff(notrayType);
		if (notaryOffice != null) {
			notaryOffice.notarization();
		}
	}
}
