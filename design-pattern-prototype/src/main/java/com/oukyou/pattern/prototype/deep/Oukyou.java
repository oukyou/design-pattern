/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/09.
 */
package com.oukyou.pattern.prototype.deep;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Oukyou
 */
public final class Oukyou extends Person implements Serializable, Cloneable {

	/**
	 * 序列化UID
	 */
	private static final long serialVersionUID = 4805101209412059846L;

	/**
	 * 电脑List
	 */
	private List<Computer> computerList;

	/**
	 * 构造方法
	 */
	public Oukyou() {
		computerList = new ArrayList<Computer>();
		Computer note = new Computer();
		note.setType("Note");
		computerList.add(note);

		Computer desk = new Computer();
		note.setType("Desk");
		computerList.add(desk);

		this.setName("Oukyou");
		this.setAge(32);
	}

	/**
	 * 重写克隆
	 */
	@Override
	public Object clone() throws CloneNotSupportedException {
		return this.deepClone();
	}

	/**
	 * 深度克隆
	 * 
	 * @return 克隆后对象
	 */
	public Object deepClone() {
		Oukyou oukyouCopy = null;
		try {
			// 通过序列化和反序列化深度克隆
			ByteArrayOutputStream bos = new ByteArrayOutputStream();
			ObjectOutputStream oos = new ObjectOutputStream(bos);
			oos.writeObject(this);

			ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
			ObjectInputStream ois = new ObjectInputStream(bis);

			oukyouCopy = (Oukyou) ois.readObject();
			Computer mac = new Computer();
			mac.setType("Mac");
			oukyouCopy.getComputerList().add(mac);
		} catch (Exception e) {
			System.err.println("克隆失败");
			e.printStackTrace();
		}

		return oukyouCopy;
	}
	
	/**
	 * 获取电脑List
	 * @return 电脑List
	 */
	public List<Computer> getComputerList(){
		return  computerList;
	}

}
