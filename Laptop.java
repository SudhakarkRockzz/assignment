public class Laptop {
public static void main(String[]args) {
Laptop acer = new Laptop();
acer.feature(8,"1TB",100000);

Laptop hp = new Laptop();
hp.feature(100,"1TB",100000,10);
}

public void feature(int ram, String Size,int price)
{
 System.out.println("hi");
}
public void feature(int ram, String Size,int price,int discount)
{
 System.out.println("hp");
}
}        


