package enshu19;

public class MyMain {
	
	public static void main(String[] args)
	{
	
		int moneyA;
		moneyA = 500;
		
		int moneyB;
		moneyB = 550;
		
		int moneyC;
		moneyC = 150;
		
		int moneyD;
		moneyD = 150;
		
		
		
		System.out.println("Aさんの所持金:"+moneyA+"円\n"+"Bさんの所持金:"+moneyB+"円\n"+"Cさんの所持金:"+moneyC+"円\n"+"Dさんの所持金:"+moneyD+"円\n"+
		"合計金額:"+sumMoney(moneyA, moneyB, moneyC, moneyD)+"円\r\n"+"平均金額:"+aveMoney(moneyA, moneyB, moneyC, moneyD)+"円\r\n");

		
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
    /**
     *平均金額を求める
     * @param studentAMoney Aさんの所持金
     * @param studentBMoney Bさんの所持金
     * @param studentCMoney Cさんの所持金
     * @param studentDMoney Dさんの所持金   
     * @return 合計金額
     */
	private static double aveMoney(int studentAMoney , int studentBMoney , int studentCMoney, int studentDMoney) {
	    return (studentAMoney + studentBMoney + studentCMoney + studentDMoney) / 4.0; 
	}

}
