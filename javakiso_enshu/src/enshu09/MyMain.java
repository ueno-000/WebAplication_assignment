package enshu09;

public class MyMain {
	
	public static void main(String[] args)
	{
	
		
		int month;
		month = 20;
		
		if(month < 0 || month > 12)
		{
			System.out.println(month +"月は不正です");
		}
		else if(month == 4 ||month == 6||month == 9||month == 11)
		{
			System.out.println(month +"月は30日まであります");
		}
		else if(month == 2)
		{
			System.out.println(month +"月は28日まであります");
		}
		else
		{
			System.out.println(month +"月は31日まであります");
		}
		
	}
}
