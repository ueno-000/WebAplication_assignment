package enshu20;

public class MyMain {
	
	public static void main(String[] args)
	{
	
		String[] names = {"A","B","C","D"};
		int[] moneys = {500,550,1000,1500};
		
		
		
		for(int i = 0;i < moneys.length;i++)
		{
			System.out.println(names[i]+"さんの所持金"+moneys[i]+"円");
		}
		
		System.out.println("合計金額:"+sumMoney(moneys)+"円\r\n"+"平均金額:"+aveMoney(moneys)+"円\r\n");

		
	}
	
    /**
     *合計金額を求める
     * @param studentMoney[] 所持金配列 
     * @return 合計金額
     */
	private static int sumMoney(int[] studentsMoney) 
	{
		int result = 0;
		for(int i = 0;i < studentsMoney.length;i++)
		{
			result += studentsMoney[i];		
		}
		return result;
	}
    /**
     *平均金額を求める
     * @param studentMoney[] 所持金配列 
     * @return 合計金額
     */
	private static double aveMoney(int[] studentsMoney) 
	{
		int result = 0;
		for(int i = 0;i < studentsMoney.length;i++)
		{
			result += studentsMoney[i];		
		}
		return result/4.0;
	}
}
