package javaallpgmspackage;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class JavaDateGenereation {

	public static void main(String[] args) {
		

		Date dateobj = new Date();
		
		SimpleDateFormat dateformatobj = new SimpleDateFormat();
		
		//This will give current system date and time without seconds
		
		System.out.println("System date & Time" +dateformatobj.format(dateobj));
		
		
		
		//Gives current system date and time based on the format we give 
		
		
		SimpleDateFormat dateformatobj1 = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");

		System.out.println("Format date & Time " +dateformatobj1.format(dateobj));

		
		// Using Calender Instance :
		
		SimpleDateFormat dateformatobj2 = new SimpleDateFormat("yyyy/mm/dd hh:mm:ss");
		
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
		
	//	System.out.println(dateformatobj2.format(cal));
		
		
		
		

	}

}
