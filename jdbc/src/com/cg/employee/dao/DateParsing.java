package com.cg.employee.dao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParsing {
	public static java.sql.Date converDate(String strdate) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date utilDate;
		java.sql.Date sqlDate=null;
		try {
			   utilDate = sdf.parse(strdate);
			    sqlDate = new java.sql.Date(utilDate.getTime());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return sqlDate;
	}
}
