package enshu15;

public class MyMain {
	
	public static void main(String[] args)
	{
	
		String[] names = {"A","B","C","D"};
		int[] moneys = {500,550,1000,1501};
		
		int myMoney;
		myMoney = 1000;
		

		System.out.println("元々の自分の所持金："+myMoney+"円");
		
		for(int i = 0;i < moneys.length;i++)	
		{
			if(myMoney < moneys[i])
			{
				moneys[i] -= 100;
				myMoney += 100;
				System.out.println(names[i]+"さんから100円貰いました");
				System.out.println("今の自分の所持金："+myMoney+"円");
				break;
			}
		}
		
		for(int i = 0;i < moneys.length;i++)
		{
			System.out.println(names[i]+"さんの所持金"+moneys[i]+"円");
		}
		
	}
}
