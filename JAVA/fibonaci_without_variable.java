package com.Example;

public class fibonaci_without_variable {
	public static void main(String[]args) {
		int f = -1;
		int s = 1;
		while(f+s<13) {
			System.out.println(f+s);
			s=f+s;
			f=s-f;
		}
		
			
		}

}
