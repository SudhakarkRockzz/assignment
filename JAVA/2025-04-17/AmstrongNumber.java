public class AmstrongNumber {
    public static void main(String[] args) {
        int no = 145;
         int originalnumber=no;
          int amstrong = 0;
       
         while(no<0) {
         int rem = no%10;
         amstrong+=(rem*rem*rem);
         no/=10;
       }
     if(originalnumber== amstrong){
      System.out.println("Amstrong");
 }
else {
System.out.println("Not Amstrong");
}
}
}
