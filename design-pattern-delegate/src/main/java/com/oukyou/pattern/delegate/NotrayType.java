/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/15.
 */
package com.oukyou.pattern.delegate;

/**
 * 公证类型
 */
public enum NotrayType {

	/**
	 * 亲属关系
	 */
	KINSHIP("亲属关系", new KinshipNotaryStaff()),

	/**
	 * 学历
	 */
	EDUCATION("学历", new EducationNotaryStaff());

	/**
	 * 公证类型
	 */
	private String typeCode;

	/**
	 * 公证员
	 */
	private NotaryStaff notaryStaff;

	/**
	 * 私有构造方法
	 * 
	 * @param typeCode 公证类型
	 * @param notaryStaff 公证员
	 */
	private NotrayType(String typeCode, NotaryStaff notaryStaff) {
		this.typeCode = typeCode;
		this.notaryStaff = notaryStaff;
	}

	/**
	 * 获取指定类型的公证员
	 * 
	 * @param typeCode 公证类型
	 * @return 公证员
	 */
	public static NotaryStaff getNotaryStaff(String typeCode) {
		NotaryStaff result = null;
		for (NotrayType notrayType : NotrayType.values()) {
			if (typeCode.equals(notrayType.getTypeCode())) {
				result = notrayType.getNotaryStaff();
				break;
			}
		}

		if (result == null) {
			System.err.println("目前沒有办理" + typeCode + "这个公证业务。");
		}

		return result;
	}

	/**
	 * 获取公证类型
	 * 
	 * @return 公证类型
	 */
	public String getTypeCode() {
		return typeCode;
	}

	/**
	 * 获取公证员
	 * 
	 * @return 公证员
	 */
	public NotaryStaff getNotaryStaff() {
		return notaryStaff;
	}
}
