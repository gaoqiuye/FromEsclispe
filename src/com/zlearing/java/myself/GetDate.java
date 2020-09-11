package com.zlearing.java.myself;


import java.util.Date;
import java.text.*;

public class GetDate {
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		SimpleDateFormat ft =new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println("当前时间为:"+ft.format(date));
		
	}

}


