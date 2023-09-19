package enshu03;

public class MyMain 
{
    public static void main(String[] args) 
    {
    	Item item1 = new Item("マウス",300);
    	System.out.println(item1.itemName+"の割引価格:"+item1.discountPrice(0.4)+"円");
    	Item item2 = new Item("キーボード",300000);
    	System.out.println(item2.itemName+"の割引価格:"+item2.discountPrice(0.4)+"円");
    	
    	
    }
}

