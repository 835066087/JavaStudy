package myday17_DateTest;

import java.util.Calendar;
import java.util.Date;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.junit.Test;

public class DateTest {

	@Test
	public void test6() {
		LocalDate date = LocalDate.now();
		int year = date.getYear();
		int month = date.getMonthValue();
		int day = date.getDayOfMonth();

		System.out.println(year + "," + month + "," + day);

		LocalDate date2 = date.withYear(2008).withMonth(8).withDayOfMonth(10);
		System.out.println(date2);
	}

	@Test
	public void test5() {
		LocalDate date = LocalDate.now();
		System.out.println(date);

		LocalTime time = LocalTime.now();
		System.out.println(time);
	}

	@Test
	public void test7() {
		//更改格式准备
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
		DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		//现在的时分秒
		LocalDateTime date = LocalDateTime.now();
		String format = formatter.format(date);
		System.out.println(format);
		
		//生日
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = date1.withYear(1996).withMonth(5).withDayOfMonth(18);
		String format1 = formatter1.format(date2);
		System.out.println(format1);

	}

	@Test
	public void test4() {
		// 获取当前日历并打印输出，再设置成你的生日，再打出百岁
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = sdf.format(calendar.getTime());
		System.out.println(string);

		calendar.set(Calendar.YEAR, 1996);
		calendar.set(Calendar.MONTH, 4);
		calendar.set(Calendar.DAY_OF_MONTH, 18);

		String string1 = sdf.format(calendar.getTime());
		System.out.println(string1);

		calendar.set(Calendar.YEAR, 2096);
		String string2 = sdf.format(calendar.getTime());
		System.out.println(string2);

		calendar.add(Calendar.DAY_OF_MONTH, 100);
		String string3 = sdf.format(calendar.getTime());
		System.out.println(string3);

	}
	
	// 增加线程沉睡，得以拯救
	// 别搞自己
	@Test
	public void test2() throws InterruptedException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		do {
		Thread.sleep(1000);
		Date date = new Date();
		System.out.println(date);
		String string = sdf.format(System.currentTimeMillis());
		System.out.println("" + string);
		
		}while(true);
	}
	// 真的别搞自己

	@Test
	public void test1() {
		long millis = System.currentTimeMillis();
		System.out.println(millis);
	}

}
