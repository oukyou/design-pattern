/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月12日
 */
package com.oukyou.pattern.template;

import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 工作薄模板
 */
public abstract class WorkbookTemplate {

	/**
	 * 工作薄
	 */
	XSSFWorkbook workbook;

	/**
	 * 构造函数
	 * 
	 * @param workbook 工作薄
	 */
	public WorkbookTemplate(XSSFWorkbook workbook) {
		this.workbook = workbook;
	}

	/**
	 * 出力工作薄
	 * 
	 * @param ops 出力流
	 * @throws IOException IO例外
	 */
	public abstract void write(OutputStream ops) throws IOException;
}
