import java.util.Scanner;

/* Calulator HW03
 * CSE1102/ HW03 
 * Object Oriented-Design and Programming
 * Create a calculator that displays output options and reads user input from the keyboard.
 * Joseph Wolanski
 * TA: Samir Elsayed
 * Help: Todd Slater
 */
public class Calculator 
{
	public static void main(String[]args)
	{
	
	Scanner sc = new Scanner(System.in);
	boolean contin = true;
	
	double accumulator = 0.0;
	//CANNOT STORE VALUE FOR MULTIPLE METHODS
	//MUST STORE ACCUMULATOR VALUE
	//initial Calculator number = 0.0
	
	double input;
	//Value used with the accumulator.
	
	
	while (contin)
	{
		int choice;
		
		System.out.println("Accumulator = " + accumulator);
		//Main Menu Display
		System.out.println("Please choose from the following options:");
		System.out.println("0) Exit");
		System.out.println("1) Addition");
		System.out.println("2) Subraction");
		System.out.println("3) Multiplication");
		System.out.println("4) Division");
		System.out.println("5) Square Root");
		System.out.println("6) Clear");
		System.out.print("What is your choice?  ");
		
		//not sure what to do here? 
		//Not recognizing choice for read
		choice = sc.nextInt();
		
		// if statement not recognized nor else
		if (choice == 0)
		{
			contin = false;
		}
		else if(choice == 1)
		{
			System.out.print("Enter a number:  ");	
			input = sc.nextFloat();
			//addition
			accumulator += input;
		}
		else if(choice == 2)
		{
			System.out.print("Enter a number:  ");
			input = sc.nextFloat();
			//subtraction
			accumulator -= input;
		}
		else if(choice == 3)
		{
			System.out.print("Enter a number:  ");
			input = sc.nextFloat();
			//multiplication
			accumulator *= input;
		}
		else if(choice == 4)
		{
			System.out.print("Enter a number:  ");
			input = sc.nextFloat();
			//division
			accumulator /= input;
		}
		else if(choice == 5)
		{
			//square root
			accumulator = Math.sqrt(accumulator);
			
		}
		else if(choice == 6)
		{
			accumulator = 0.0;
			//clear
		}
		else
		{
			System.out.println("Invalid Illegal Operation");
		}
		
	{			System.out.println("Illegal operation: "+ choice);
		}
	}
		}
		
			}
	

	
