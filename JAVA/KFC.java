public class KFC
{

  String quantity = "large";
  int price = 390;

public static void main(String[]args)
{
  KFC popcorn = new KFC();
  popcorn.buy();
  popcorn.quantity();
}

 void buy()

  {
     System.out.println("buy.method");
     quantity();
}
 void quantity()
{
  System.out.println("50");

}

}
