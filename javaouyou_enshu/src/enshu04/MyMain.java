package enshu04;


public class MyMain 
{
    public static void main(String[] args) 
    {
        Store store1 = new Store("東京店", 50);
        
        Store store2 = new Store("渋谷店", 1000000);

        System.out.println(store1.storeName + "の売上：" + store1.sales + "円");
        System.out.println(store2.storeName + "の売上：" + store2.sales + "円");
        System.out.println("全店舗の売上：" + Store.totalSales + "円");
    }
}

