import java.util.Scanner;
public class LinearSearch {
public static void main(String[]args) {
	int[] Ar = {100,52,45,};
	 Scanner sc = new Scanner(System.in);
    System.out.println("Array");
    int no = sc.nextInt();
    for(int i=0;i<Ar.length;i++) {
    	if(Ar[i]==no) {
    		System.out.println("occur");
    		
    		break;
    	} else {
    		System.out.println("Not occur");
    	}
    	
    }
    sc.close();
}
}

