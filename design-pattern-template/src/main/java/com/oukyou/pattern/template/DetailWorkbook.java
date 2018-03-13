/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月12日
 */
package com.oukyou.pattern.template;

import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 详细表
 */
public final class DetailWorkbook extends WorkbookTemplate {

	/**
	 * 构造函数
	 * 
	 * @param workbook 工作薄
	 * @param ops 出力流
	 */
	public DetailWorkbook(XSSFWorkbook workbook, OutputStream ops) {
		super(workbook, ops);
	}

	/**
	 * @see WorkbookTemplate#writeSheet()
	 */
	@Override
	void writeSheet() throws IOException {
		// 获取第一个sheet
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		cell.setCellValue("我是详细表头。");

		workbook.write(ops);
		System.out.println("详细表出力完成。");
	}
}
