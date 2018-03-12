/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月12日
 */
package com.oukyou.pattern.template;

import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * 详细表
 */
public final class DetailWorkbook extends WorkbookTemplate {

	/**
	 * 构造方法
	 * 
	 * @param workbook 工作薄
	 */
	public DetailWorkbook(HSSFWorkbook workbook) {
		super(workbook);
	}

	/**
	 * @throws IOException 
	 * @see WorkbookTemplate#write()
	 */
	@Override
	public void write() throws IOException {
		// 获取第一个sheet
		HSSFSheet sheet = workbook.getSheetAt(0);
		HSSFRow row = sheet.getRow(0);
		HSSFCell cell = row.getCell(0);
		cell.setCellValue("我是详细表头。");

		workbook.write();
		System.out.println("详细表出力完成。");
	}

}
