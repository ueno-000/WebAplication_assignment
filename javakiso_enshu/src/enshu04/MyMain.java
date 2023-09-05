package enshu04;

public class MyMain {
	public static void main(String[] args) {
		
		int moneyA;
		moneyA = 504;
		float fmoneyA = moneyA;
		
		int moneyB;
		moneyB = 557;
		float fmoneyB = moneyB;
		
		int moneyC;
		moneyC = 1000;
		float fmoneyC = moneyC;
		
		int moneyD;
		moneyD = 1500;
		float fmoneyD = moneyD;
		
		
		float averageMoney;
		averageMoney = (fmoneyA+fmoneyB+fmoneyC+fmoneyD) / 4;
		
		String resultA = fmoneyA > averageMoney ? "true" : "false";
		String resultB = fmoneyB > averageMoney ? "true" : "false";
		String resultC = fmoneyC > averageMoney ? "true" : "false";
		String resultD = fmoneyD > averageMoney ? "true" : "false";
		
		System.out.println("Aさんの所持金："+moneyA+"円\r\n"+"Bさんの所持金："+moneyB+"円\r\n"
				+"Cさんの所持金："+moneyC+"円\r\n"+"Dさんの所持金："+moneyD+"円\r\n"+"平均金額："+averageMoney+"円\n");
		
		System.out.println("\n平均より多い場合はtrue、 平均以下の場合はfalseを表示\n");
		
		System.out.println("Aさんの所持金 > 平均"+resultA+"\n"+"Bさんの所持金 > 平均"+resultB+"\n"
				+"Cさんの所持金 > 平均"+resultC+"\n"+"Dさんの所持金 > 平均"+resultD);
		
	}

}
