package enshu03;

public class Item {
	
	String itemName;
	int price;
	
	public Item(String itemName, int price)
	{
		this.itemName = itemName;
		this.price = price;
	}
	
	public int discountPrice(double discountRate)
	{
		var result = price * discountRate;
		return (int)result; 
	}



}
