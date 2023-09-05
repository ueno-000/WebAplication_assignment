package enshu12;

public class MyMain {
	
	public static void main(String[] args)
	{
	
		String[] names = {"A","B","C","D"};
		int[] moneys = {500,550,1000,1501};
		int sumMoney;
		sumMoney = 0;
		
		
		for(int i = 0;i < moneys.length;i++)
		{
			System.out.println(names[i]+"さんの所持金"+moneys[i]+"円");
			sumMoney += moneys[i];
		}
		
		float fsumMoney = sumMoney;
		float averageMoney;
		averageMoney = fsumMoney / moneys.length;
		
		
		System.out.println("合計金額："+sumMoney+"円\n"+ "平均金額："+averageMoney+"円\n");
	
	}
}
