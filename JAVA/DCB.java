package com.Example;

public class DCB {
	public static void main(String[]args) {
		int no = 8;
		String bin = " ";
		while(no > 0) {
			bin = (no % 2) + bin;
					no = no/2;
					System.out.println(bin);
		}
	}

}
