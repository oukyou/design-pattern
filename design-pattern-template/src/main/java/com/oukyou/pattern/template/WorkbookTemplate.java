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
	 * 出力流
	 */
	OutputStream ops;

	/**
	 * 构造函数
	 * 
	 * @param workbook 工作薄
	 * @param ops 出力流
	 */
	public WorkbookTemplate(XSSFWorkbook workbook, OutputStream ops) {
		this.workbook = workbook;
		this.ops = ops;
	}

	/**
	 * 出力工作薄
	 * 
	 * @param ops 出力流
	 * @throws IOException IO例外
	 */
	public void write() throws IOException {
		// sheet内容出力
		writeSheet();
		closeOps();
	}

	/**
	 * 关闭出力流
	 * 
	 * @throws IOException IO例外
	 */
	private void closeOps() throws IOException {
		if (ops != null) {
			ops.close();
		}
	}

	/**
	 * 表格内容出力
	 * 
	 * @throws IOException IO例外
	 */
	abstract void writeSheet() throws IOException;
}
