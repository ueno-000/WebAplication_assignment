package enshu21;

public class MyMain {
	
	public static void main(String[] args)
	{
	
		lineCharacter();
        lineCharacter("★");
        lineCharacter("■□", 10);
    }


    private static void lineCharacter() {
        for (int i = 0; i < 12; i++) {
            System.out.print("〇");
        }
        System.out.println();
    }

    private static void lineCharacter(String str) {
        for (int i = 0; i < 12; i++) {
            System.out.print(str);
        }
        System.out.println();
    }

    private static void lineCharacter(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(str);
        }
        
        System.out.println();
    }
}
