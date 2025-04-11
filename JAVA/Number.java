public class Number {
public static void main (String[]args) {
int Sum =0;
int no = 12356;

while(no>0) {
Sum = Sum +(no%=10);
 
 no/=10;
 }
 System.out.println(Sum);
 }
 }
 

