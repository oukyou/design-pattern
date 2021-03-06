/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月12日
 */
package com.oukyou.pattern.template;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 * 模版类型测试
 */
public final class TemplatePatternTest {

	/**
	 * 执行方法
	 * 
	 * @param args 入力参数
	 * @throws Exception 例外
	 */
	public static void main(String[] args) throws Exception {
		// 读取详细excel表的内容
		InputStream detailStream = new FileInputStream("static/detail.xlsx");
		XSSFWorkbook detailWb = new XSSFWorkbook(detailStream);

		DetailWorkbook detail = new DetailWorkbook(detailWb, new FileOutputStream(new File("static/detail-output.xlsx")));
		detail.write();
		detailStream.close();

		// 读取详细excel表的内容
		InputStream totlaStream = new FileInputStream("static/total.xlsx");
		XSSFWorkbook totalWb = new XSSFWorkbook(totlaStream);

		TotalWorkbook total = new TotalWorkbook(totalWb, new FileOutputStream(new File("static/total-output.xlsx")));
		total.write();
		totlaStream.close();
	}
}
