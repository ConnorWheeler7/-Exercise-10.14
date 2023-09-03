package assignment_ten__14;

//MyDate.java
import java.util.Calendar;
import java.util.GregorianCalendar;
public class MyDate
{
//private instance variables
private int year;
private int month;
private int day;
/*MyDate class with milliseconds*/
public MyDate(long milliseconds)
{
//Create an instance of GregorianCalendar class
GregorianCalendar cal = new GregorianCalendar();
//set milliseconds
cal.setTimeInMillis(milliseconds);
year = cal.get(Calendar.YEAR);
month = cal.get(Calendar.MONTH);
day = cal.get(Calendar.DATE);
}
/*Default constructor */
public MyDate()
{
this.year = 0;
this.month = 0;
this.day = 0;
}
/*Constructor with year, month and day*/
public MyDate(int year, int month, int day)
{
//Call setDate method
setDate(year, month, day);
}
/*setDate method to set year, month and day values*/
public void setDate(int year, int month, int day)
{
setYear(year);
setMonth(month);
setDay(day);
}
//Getter and setter methods of instance variables
public int getYear()
{
return year;
}
public void setYear(int year)
{
this.year = year;
}
public int getMonth()
{
return month;
}
public void setMonth(int month)
{
this.month = month;
}
public int getDay()
{
return day;
}
public void setDay(int day)
{
this.day = day;
}
} 