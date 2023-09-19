package enshu01;

public class MyMain 
{
    public static void main(String[] args) 
    {
        Store store1 = new Store("東京店", 500000);
        Store store2 = new Store("渋谷店", 1000000);

        System.out.println(store1.storeName + "の売上：" + store1.sales + "円");
        System.out.println(store2.storeName + "の売上：" + store2.sales + "円");
    }
}

