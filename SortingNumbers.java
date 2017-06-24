// Submitted by Venkata Krishna Kanth Musunuru.

/** Write a program to sort the given numbers. If user enters,
   1,9,4,11,2  then the ouput should be
   1,2,4,9,11*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
public class SortingNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("How many numbers do you want to sort: ");
		int num = s.nextInt();
		System.out.println("Enter the numbers that you want to sort:");
		int[] numbersArray = new int[num];
		for(int i=0;i<num;i++){
			numbersArray[i]=s.nextInt();
		}
		Arrays.sort(numbersArray);
		System.out.println("Sorted numbers are \n");
		for(int i=0;i<num;i++)
			System.out.print(numbersArray[i]+",  ");
		
		
		// Using Arraylist.
		
		System.out.println("we can also sort numbers with ArrayList\n");
		ArrayList<Integer> l = new ArrayList<Integer>();
		System.out.println("\nEnter the numbers that you want to sort and enter any character to get the sorted numbers:");
		while(s.hasNextInt()){
		l.add(s.nextInt());}
		l.sort(null);
		System.out.println("Sorted Numbers are: ");
		for(int i=0;i<l.size();i++)
			System.out.print(l.get(i)+", ");

	}

}
