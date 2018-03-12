/*
 * Copyright by Oukyou.
 * 
 * @author Oukyou
 * @version New 2018年3月12日
 */
package com.oukyou.pattern.template;

import java.io.FileInputStream;
import java.io.InputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;

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
		InputStream detailStream = new FileInputStream("detail.xlsx");
		POIFSFileSystem detailFs = new POIFSFileSystem(detailStream);
		HSSFWorkbook detailWb = new HSSFWorkbook(detailFs);

		DetailWorkbook detail = new DetailWorkbook(detailWb);
		detail.write();
		detailStream.close();

		// 读取详细excel表的内容
		InputStream totlaStream = new FileInputStream("total.xlsx");
		POIFSFileSystem totalFs = new POIFSFileSystem(totlaStream);
		HSSFWorkbook totalWb = new HSSFWorkbook(totalFs);

		TotalWorkbook total = new TotalWorkbook(totalWb);
		total.write();
		totlaStream.close();
	}
}
