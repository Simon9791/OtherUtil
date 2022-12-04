package com.util.hsu;

import java.util.Date;
import java.util.Locale;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = Sim.format("%s", "Demo");
		System.out.println(Sim.format("This %s form Simon!!! ", str));
		// 創建日期對像
		Date date = new Date();
		// 格式化日期字符串
		str = Sim.format(Locale.US, "英文月份簡稱：%tb", date);
		// 輸出字符串內容
		System.out.print("01.");
		System.out.println(str);
		System.out.print("02.");
		System.out.printf("本地月份簡稱：%tb%n", date);
		System.out.print("03.");
		System.out.println(str = Sim.format(Locale.US, "英文月份全稱：%tB", date));
		System.out.print("04.");
		System.out.printf("本地月份全稱：%tB%n", date);
		System.out.print("05.");
		System.out.println(str = Sim.format(Locale.US, "英文星期的簡稱：%ta", date));
		System.out.print("06.");
		System.out.printf("本地星期的簡稱：%tA%n", date);
		System.out.print("07.");
		System.out.printf("年的前兩位數字（前補0至2位）：%tC%n", date);
		System.out.print("08.");
		System.out.printf("年的後兩位數字（前補0至2位）：%ty%n", date);
		System.out.print("09.");
		System.out.printf("一年中的天數（即年的第幾天）：%tj%n", date);
		System.out.print("10.");
		System.out.printf("兩位數字的月份（前補0至2位）：%tm%n", date);
		System.out.print("11.");
		System.out.printf("兩位數字的日（前補0至2位）：%td%n", date);
		System.out.print("12.");
		System.out.printf("日期：%tF%n", date);
		System.out.print("13.");
		System.out.printf(Sim.format(Locale.TAIWAN, "一年之中的第幾日：%tj%n", date));
		System.out.print("14.");
		System.out.printf(Sim.format(Locale.TAIWAN, "日期：%tm%n", date));
		System.out.print("15.");
		System.out.printf("月份的日：%te", date);
	}

}
