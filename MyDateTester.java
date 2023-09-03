package assignment_ten__14;

public class MyDateTester
{
public static void main(String[] args)
{
//Set elapsed time in long variable
long elapsedTime=561555550000L;

//Create an instance of MyDate with elapsed time
MyDate date=new MyDate(elapsedTime);

//Print the results on the console window
System.out.println("The elapsed time "+elapsedTime
+" is "+date.getYear()+" year, month is "
+date.getMonth()
+" and day is "+date.getDay());
}//end of main method
} //end of the class