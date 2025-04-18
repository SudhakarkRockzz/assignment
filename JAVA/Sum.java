public class Sum {
public static void main (String[]args){
 
 Sum s = new Sum();
 int result= s.sum_of_digit(7889);
if(result > 9){
s.sum_of_digit(result);

}
 System.out.println("final result"+result);
}
public int sum_of_digit(int no){
int sum=0;
while(no>0){
sum = sum +(no%10);
 no/=10;
}
     return sum;
}

}
