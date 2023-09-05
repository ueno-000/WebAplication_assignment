package enshu14;

public class MyMain {
	
	public static void main(String[] args)
	{
		
		for(int i = 1;i <= 9;i++)
		{
			System.out.print("\n"+i+"の段：");
			
			for(int k = 1;k <= 9;k++)
			{
				if(k == 9)
				System.out.println(i*k);
				
				else
				System.out.print(i*k +",");	
			}
			
		}
	}
}
