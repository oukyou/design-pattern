/*
 * Copyright(c) 2018 Oukyou.
 *
 * @author Oukyou
 * @version New 2018/03/08.
 */
package com.oukyou.pattern.singleton.enums;

/**
 * 枚举型单例
 */
public enum EnumInterfaceSigletonImpl implements EnumInterfaceSigleton {

	/**
	 * 实例
	 */
	INSTANCE {
		/**
		 * 调用次数
		 */
		private int count = 1;

		/**
		 * @see EnumInterfaceSigleton#realized()
		 */
		@Override
		public void realized() {
			System.out.println("枚举型单例方法调用第" + count++ + "次。");
		}
	};

	/**
	 * 获取实例
	 * 
	 * @return 实例
	 */
	public static EnumInterfaceSigleton getInstance() {
		return INSTANCE;
	}

}
