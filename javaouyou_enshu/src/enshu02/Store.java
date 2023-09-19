package enshu02;

public class Store 
{
    String storeName;
    int sales;

    // コンストラクタ
    public Store(String storeName, int sales) 
    {
        this.storeName = storeName;
        this.sales = sales;
    }
    
    public void explain()
    {
        System.out.println(storeName + "の売上：" + sales + "円");
    }

}
