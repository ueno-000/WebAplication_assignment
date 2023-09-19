package enshu04;

public class Store 
{
    String storeName;
    int sales;
    static int totalSales;

    // コンストラクタ
    public Store(String storeName, int sales) 
    {
        this.storeName = storeName;
        this.sales = sales;
        totalSales += sales; 
    }
	
}
