//Submitted by Venkata Krishna Kanth Musunuru

/** 2) Write a program to display <b>3 dimensional multiplication table</b> based on user input? for example, if user enters 1 then the output should display 
1*1*1=1
1*1*2=2
.
.
*/

import java.util.Scanner;

public class threeDTable {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter which number table you want to display");
		int num = s.nextInt();
		
		System.out.println(num+" multiplication table is:");
		
		for(int i=1;i<11;i++){
			
			for(int j=i; j<11;j++){
				System.out.println(num+"*"+i+"*"+j+" = "+Integer.toString(num*i*j));
			}
		}

	}

}
