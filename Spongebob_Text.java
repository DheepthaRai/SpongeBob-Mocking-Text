package Basics;

import java.util.Random;
import java.util.Scanner;

public class Spongebob_Text {
	
	public static void main(String args[]) {
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		String str; //input string
		String output = ""; //output string
		
		//getting input
		System.out.println("Type text here: ");
		str = sc.nextLine();
		
		for(int i=0;i<str.length();i++) {
			
			char t; //a variable to assist in the conversion to the respective case
			
			//random number generation
			int n = r.nextInt(10);
			
			//conditional statements
			if(n<=5) {
				t = str.charAt(i);
				output += Character.toLowerCase(t);
			}
			else {
				t = str.charAt(i);
				output += Character.toUpperCase(t);
			}
		}
		
		//printing the result
		System.out.println(output);
	}

}
