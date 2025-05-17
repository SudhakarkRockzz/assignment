public class Samsung extends FactoryDemo {
static int price = 5000;
public void verifyFingerPrint()
{
System.out.println("Verifying fingerprint...");
}
public void providePattern()
{
System.out.println("Pattern");
}
public  void receiveCall(){
}
 public void sendMessage() {
        System.out.println("Message sent from Samsung.");
    }
public  int call(int seconds){
return(10);


}

public static void main(String[]args){
 Samsung sam = new Samsung();
 sam.browse();
System.out.println(sam.price);
 
     sam.verifyFingerPrint();
        sam.providePattern();
}

}

