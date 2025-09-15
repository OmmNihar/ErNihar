package JavaUtility;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class JavaUtility 
{	
 public int getRandomNumber()
 {
	 Random random = new Random();
	 int randomcount = random.nextInt(1000);
	 return randomcount;
 }
 public String getCurrentDate()
 {
	 Date date = new Date();
	 SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
	 String currentDate = sim.format(date);
	 return currentDate;
 }
 public String toigetRequiredDate(int day) 
 {
	 Date date = new Date();
	 SimpleDateFormat sim = new SimpleDateFormat("dd-MM-yyyy");
	 sim.format(date);
	 Calendar cal = sim.getCalendar();
	 cal.add(Calendar.DAY_OF_MONTH, day);
	 String requiredDate = sim.format(cal.getTime());
	  return requiredDate;
 }
 
 }
