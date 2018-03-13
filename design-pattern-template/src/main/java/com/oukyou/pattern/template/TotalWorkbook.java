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
public final class TotalWorkbook extends WorkbookTemplate {

	/**
	 * 构造方法
	 * 
	 * @param workbook 工作薄
	 */
	public TotalWorkbook(XSSFWorkbook workbook) {
		super(workbook);
	}

	/**
	 * @see WorkbookTemplate#write()
	 */
	@Override
	public void write(OutputStream ops) throws IOException {
		// 获取第一个sheet
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(0);
		XSSFCell cell = row.getCell(0);
		cell.setCellValue("我是汇总表头。");

		workbook.write(ops);
		System.out.println("汇总表出力完成。");
	}

}
