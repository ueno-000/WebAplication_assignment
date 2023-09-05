package enshu19;

public class MyMain {
	
	public static void main(String[] args)
	{
	
		int moneyA;
		moneyA = 504;
		
		int moneyB;
		moneyB = 557;
		
		int moneyC;
		moneyC = 1000;
		
		int moneyD;
		moneyD = 1500;
		
		
		float sumMoney;
		
		System.out.println(sumMoney(moneyA, moneyB, moneyC, moneyD));

		
	}
	
    /**
     *合計金額を求める
     * @param studentAMoney Aさんの所持金
     * @param studentBMoney Bさんの所持金
     * @param studentCMoney Cさんの所持金
     * @param studentDMoney Dさんの所持金   
     * @return 合計金額
     */
	private static int sumMoney(int studentAMoney , int studentBMoney , int studentCMoney, int studentDMoney) {
		return studentAMoney +studentBMoney +studentCMoney+studentDMoney;
	}
}
