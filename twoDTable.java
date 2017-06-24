// Submitted by Venkata Krishna Kanth Musunuru

/** 1) Write a program to display <b> 2 dimensional multiplication table</b> based on user input? for example, if user enters 2 then the output should display 
2*1=2
.
.
.
2*10=20

*/

import java.util.Scanner;

public class twoDTable {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter which number table you want to display");
		int num = s.nextInt();
		
		System.out.println(num+" multiplication table is:");
		for(int i=1;i<11;i++){
			
			System.out.println(num+"*"+i+" = "+Integer.toString(num*i));
		}

	}

}
