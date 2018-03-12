/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月12日
 */
package com.oukyou.pattern.template;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * 工作薄模板
 */
public abstract class WorkbookTemplate {

	/**
	 * 工作薄
	 */
	HSSFWorkbook workbook;

	/**
	 * 构造函数
	 * 
	 * @param workbook 工作薄
	 */
	public WorkbookTemplate(HSSFWorkbook workbook) {
		this.workbook = workbook;
	}
	//
	// public void write() {
	// for (int index = 0; index < workbook.getNumberOfSheets(); index++) {
	// HSSFSheet sheet = workbook.getSheetAt(index);
	// fillSheet(sheet);
	// }
	// }

	/**
	 * 出力工作薄
	 * 
	 * @throws IOException IO例外
	 */
	public abstract void write() throws IOException;
}
