package enshu08;

public class MyMain {
	
	public static void main(String[] args)
	{
	
		int point;
		point = 900;
		
		if(point < 0 || point > 100)
		{
			System.out.println(point +"点は不正な点数です");
		}
		else if(point >= 70)
		{
			System.out.println(point +"点は合格です");
		}
		else if(point < 70)
		{
			System.out.println(point +"点は不合格です");
		}
		
		
	}
}
