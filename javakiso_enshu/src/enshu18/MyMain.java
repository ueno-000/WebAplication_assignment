package enshu18;

public class MyMain {
	
	public static void main(String[] args)
	{
	
		int time;
		time = 10;
		
		explainGreeting(time);
		
	}

    /**
     *引数の時間を以下の条件で判定し、挨拶を出力
     * @param time 挨拶する時間
     */
	private static void explainGreeting(int time) {
		if(time < 0 || time > 24)
		{
			System.out.println(time + "時は不正");
		}
		else if(time >= 0 && time < 6)
		{
			System.out.println(time + "時の挨拶：おやすみ");
		}
		else if(time >= 6 && time < 12)
		{
			System.out.println(time + "時の挨拶：おはよう");
		}
		else if(time >= 12 && time < 18)
		{
			System.out.println(time + "時の挨拶：こんにちは");
		}
		else if(time >= 18 && time < 24)
		{
			System.out.println(time + "時の挨拶：こんばんは");
		}
	}
}
