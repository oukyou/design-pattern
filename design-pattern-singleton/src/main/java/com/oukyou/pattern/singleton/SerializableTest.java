/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/09.
 */
package com.oukyou.pattern.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.oukyou.pattern.singleton.simple.HungrySingleton;

/**
 * 序列化单例测试
 */
public class SerializableTest {

	/**
	 * 执行方法
	 * 
	 * @param args 入力参数
	 */
	public static void main(String[] args) {
		HungrySingleton singleton = HungrySingleton.getInstance();
		singleton.setCount(100);

		// 序列化
		try {
			FileOutputStream fileOut = new FileOutputStream("SerializableTest");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(singleton);
			out.close();
			fileOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 修改计数器
		singleton.setCount(200);

		// 反序列化
		HungrySingleton singleton2 = null;
		try {
			FileInputStream fileIn = new FileInputStream("SerializableTest");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			singleton2 = (HungrySingleton) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
		} catch (ClassNotFoundException c) {
			System.out.println("找不到HungrySingleton类");
			c.printStackTrace();
		}

		if (singleton == singleton2) {
			System.out.println("同一个实例");
		} else {
			System.out.println("不同的实例");
		}

		System.out.println(singleton.getCount());
		System.out.println(singleton2.getCount());
	}

}
