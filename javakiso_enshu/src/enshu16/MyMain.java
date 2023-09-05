package enshu16;

public class MyMain {
	
	public static void main(String[] args)
	{
	
		String[] names = {"A","B","C","D"};
		int[] moneys = {1003,550,500,1501};
		
		int myMoney;
		myMoney = 1000;
		

		System.out.println("元々の自分の所持金："+myMoney+"円\n");
		
		for(int i = 0;i < moneys.length;i++)	
		{
			if(myMoney < moneys[i])
			{
				moneys[i] -= 100;
				myMoney += 100;
				System.out.println(names[i]+"さんから100円貰いました");
				continue;
			}
		}
		System.out.println("私の所持金："+myMoney+"円\n");
		
		for(int i = 0;i < moneys.length;i++)
		{
			System.out.println(names[i]+"さんの所持金"+moneys[i]+"円");
		}
		
	}
}
