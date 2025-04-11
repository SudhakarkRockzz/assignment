public class Clock {
public static void main (String[]args) {
int At = 11;
int H = 10;
int M = 55;
while(At<=18){
	if( H>12)
		
At = At+1;
H = H+1;
M = M-5;
System.out.println(At +"="+(H-12)+"=>"+M);
}
}
}