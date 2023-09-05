package enshu03;

public class MyMain {
	
	public static void main(String[] args) {
	
		int moneyA;
		moneyA = 504;
		int moneyB;
		moneyB = 557;
		int moneyC;
		moneyC = 1000;
		int moneyD;
		moneyD = 1500;
		
		int sumMoney;
		sumMoney = moneyA+moneyB+moneyC+moneyD;
		
		float fsumMoney = sumMoney;
		float averageMoney;
		averageMoney = fsumMoney / 4;
		
		System.out.println("Aさんの所持金："+moneyA+"円\r\n"+"Bさんの所持金："+moneyB+"円\r\n"
				+"Cさんの所持金："+moneyC+"円\r\n"+"Dさんの所持金："+moneyD+"円\r\n");
		
		System.out.println("合計金額："+sumMoney+"円\n"+ "平均金額："+averageMoney+"円\n");
	}
}
