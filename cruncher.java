import java.util.*;
public class cruncher {
	/********************************************/
	//Description:  This program calculates the sum, value, and Average of 2 numbers
	//Date:  9/28/16
	//Developer:  Mason W. Lapine
	//Class: Computer Science
	/********************************************/
	public static void main(String[] args){
		System.out.println("Welcome to number Cruncher!");
		System.out.println("This game computes the larger, difference and average of two numbers");
		Scanner numscanner = new Scanner(System.in);
		System.out.println("Please enter the first value: ");
		String numstring1 = numscanner.nextLine();
		System.out.println("Thanks!");
		System.out.println("Please enter the second value: ");
		String numstring2 = numscanner.nextLine();
		System.out.println("Thanks!");
		int num1int = Integer.parseInt(numstring1);
		int num2int = Integer.parseInt(numstring2);
		if(num1int >= num2int){
			System.out.println("Larger number: " + numstring1);
			int resultint = (num1int - num2int);
			System.out.println("Difference: " + resultint);
		}
		else{
			System.out.println("Larger number: " + numstring2);
			int resultint = num2int = num1int;
			System.out.println("Difference: " + resultint);
			
		}
		float resultint2 = (float) (num1int + num2int)/2;
		System.out.println("Average: " + resultint2);
		
	}
}

