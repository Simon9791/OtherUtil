package com.util.hsu;

import java.util.Locale;

public class Sim {
	/**
	 * 
	 * @param _local_value      國別
	 * @param format 格式的字串
	 * @param args   值
	 * @return
	 */
	public static String format(Locale _local_value, String format, Object... args) {
		// TODO Auto-generated method stub
		return java.lang.String.format(_local_value, format, args);
	}

	/**
	 * 
	 * @param format
	 * @param args
	 * @return
	 */
	public static String format(String format, Object... args) {
		// TODO Auto-generated method stub
		return String.format(format, args);
	}
}
