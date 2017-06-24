// submitted by Venkata krishna kanth Musunuru.

/** Write a program to identify second highest of the given numbers, if user enters 1,32,545,0,-3,24 then the output should be 
   32 
   */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.standard.NumberUpSupported;
public class SecondHighest {

	public static void main(String[] args) {
		
		System.out.println("Enter the list of numbers from which you want to get second highest");
		System.out.println("After entering the numbers, enter any escape character to get the result");
		
		Scanner s= new Scanner(System.in);
		ArrayList<Integer> l = new ArrayList<Integer>();
		while(s.hasNextInt()){
			l.add(s.nextInt());}
			l.sort(null);
			
			System.out.println("The second highest number is: ");
			System.out.println(l.get(l.size()-2));
			
			
			// using arrays
			System.out.println("We can also do this using arrays:");
			System.out.println("Enter from how many number do you want to get the second Highest");
			Scanner g = new Scanner(System.in);
			int num = g.nextInt();
			
			int[] numbersArray = new int[num];
			System.out.println("Enter the numbers that you want to get the second highest from");
			for(int i=0; i<num;i++){
				
			numbersArray[i]=g.nextInt();
			}
			
			Arrays.sort(numbersArray);
			System.out.println("The second highest number is: "+ numbersArray[numbersArray.length-2]);
	}

}
