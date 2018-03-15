/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/15.
 */
package com.oukyou.pattern.delegate;

/**
 * 学历公证员
 */
public final class EducationNotaryStaff implements NotaryStaff {

	/**
	 * @see NotaryOffice#notarization()
	 */
	@Override
	public void notarization() {
		System.out.println("为您办理学历公证。");
	}

}
