package com.util.hsu;

import java.util.Locale;

public class Sim {
	/**
	 * 
	 * @param l 國別
	 * @param format 格式的字串
	 * @param args 值
	 * @return
	 */
	public static String format(Locale l, String format, Object... args) {
		// TODO Auto-generated method stub
		return java.lang.String.format(l, format, args);
	}

	public static String format(String format, Object... args) {
		// TODO Auto-generated method stub
		return String.format(format, args);
	}
}
