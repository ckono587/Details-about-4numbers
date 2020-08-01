import java.util.InputMismatchException;
import java.util.Scanner;
public class LAB3
{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		int num1, num2, num3, num4, i, z, sum1, sum2, sum3, sum4;
	
		do
		{
		System.out.print("Enter 1st integer: ");
		num1 = AcceptInput();
		}while(num1 != (int)num1);
		
		System.out.print("Enter 2nd integer: ");
		num2 = AcceptInput();
		
		System.out.print("Enter 3rd integer: ");
		num3 = AcceptInput();
		
		System.out.print("Enter 4th integer: ");
		num4 = AcceptInput();
		
		// To Print out the Largest Number.
		if (num1 > num2 && num1 > num3 && num1 > num4) {
			System.out.println("The Largest Number is: " + num1);
		}
		else if (num2 > num1 && num2 > num3 && num2 > num4) {
			System.out.println("The Largest Number is: " + num2);
		}
		else if (num3 > num1 && num3 > num2 && num3 > num4) {
			System.out.println("The Largest Number is: " + num3);
		}
		else if (num4 > num1 && num4 > num2 && num4 > num3) {
			System.out.println("The Largest Number is: " + num4);
		}
	
		
		// To Print out the smallest Number.
		if (num1 < num2 && num1 < num3 && num1 < num4) {
			System.out.println("The Smallest Number is: " + num1);
		}
		else if (num2 < num1 && num2 < num3 && num2 < num4) {
			System.out.println("The Smallest Number is: " + num2);
		}
		else if (num3 < num1 && num3 < num2 && num3 < num4) {
			System.out.println("The Smallest Number is: " + num3);
		}
		else if (num4 < num1 && num4 < num2 && num4 < num3) {
			System.out.println("The Smallest Number is: " + num4);
		}
		System.out.println();
		
		// Amount of Even Numbers Entered.
		i = 0;
		if (num1%2 == 0) {
			System.out.println(num1 + " is an even #" );
			i++;
		}
		 if (num2%2 == 0) {
			System.out.println(num2 + " is an even #" );
			i++;
		}
		 if (num3%2 == 0) {
			System.out.println(num3 + " is an even #" );
			i++;
		}
		 if (num4%2 == 0) {
			System.out.println(num4 + " is an even #" );
			i++;
		}
		 
		 System.out.println("The amount of even numbers :" + i);
		 System.out.println();
		 
		
		 // The amount of Odd Numbers Entered.
		z = 0;
		if (num1%2 == 1) {
			System.out.println(num1 + " is an odd #" );
			z++;
		}
		 if (num2%2 == 1) {
			System.out.println(num2 + " is an odd #" );
			z++;
		}
		 if (num3%2 == 1) {
			System.out.println(num3 + " is an odd #" );
			z++;
		}
		 if (num4%2 == 1) {
			System.out.println(num4 + " is an odd #" );
			z++;
		}
		 System.out.println("The amount of odd numbers :" + z);
		 System.out.println();
		 
		
		 // Sum of Even Numbers 
		sum1 = 0;
		 if (num1%2 == 0) {
				System.out.println(num1 + " is an even #" );
				sum1 = sum1 + num1;
			}
			 if (num2%2 == 0) {
				System.out.println(num2 + " is an even #" );
				sum1 = sum1 + num2;
			}
			 if (num3%2 == 0) {
				System.out.println(num3 + " is an even #" );
				sum1 = sum1 + num3;
			}
			 if (num4%2 == 0) {
				System.out.println(num4 + " is an even #" );
				sum1 = sum1 + num4;
			}
			 
			 System.out.println("The sum of the even numbers :" + sum1);
			 System.out.println();
	
				
			 // Sum of Odd Numbers.
			 sum2 = 0;
				 if (num1%2 == 1) {
						System.out.println(num1 + " is an odd #" );
						sum2 = sum2 + num1;
					}
					 if (num2%2 == 1) {
						System.out.println(num2 + " is an odd #" );
						sum2 = sum2 + num2;
					}
					 if (num3%2 == 1) {
						System.out.println(num3 + " is an odd #" );
						sum2 = sum2 + num3;
					}
					 if (num4%2 == 1) {
						System.out.println(num4 + " is an odd #" );
						sum2 = sum2 + num4;
					}
					 
					 System.out.println("The sum of the Odd numbers :" + sum2);
					 System.out.println();
					 
			// Sum of One Digit Numbers.
				sum3 = 0;
					if (num1 <= 9) {
						System.out.println(num1 + " is a one digit #" );
						sum3 = sum3 + num1;
					}
					 if (num2 <= 9) {
						System.out.println(num2 + " is a one digit #" );
						sum3 = sum3 + num2;
					}
					 if (num3 <= 9) {
						System.out.println(num3 + " is a one digit #" );
						sum3 = sum3 + num3;
					}
					 if (num4 <= 9) {
						System.out.println(num4 + " is a one digit #" );
						sum3 = sum3 + num4;
					}
							 
						System.out.println("The sum of the one digit numbers :" + sum3);
						System.out.println();
				
			// Sum of Two Digit Numbers.
				sum4 = 0;
					if (num1 >= 10) {
						System.out.println(num1 + " is a one digit #" );
						sum4 = sum4 + num1;
					}
					if (num2 >= 10) {
						System.out.println(num2 + " is a one digit #" );
						sum4 = sum4 + num2;
					}
					if (num3 >= 10) {
						System.out.println(num3 + " is a one digit #" );
						sum4 = sum4 + num3;
							}
					if (num4 >= 10) {
						System.out.println(num4 + " is a one digit #" );
						sum4 = sum4 + num4;
					}
									 
						System.out.println("The sum of the two digit numbers :" + sum4);
						System.out.println();
		}
	
	


	public static int AcceptInput()
	{
		
		Scanner input = new Scanner(System.in);
		int num = 0;
		//boolean statement = false;
		//System.out.println("Input Integer: ");
		
		do
		{
			try
			{
				
				num = input.nextInt();
			
			}
			catch(InputMismatchException e)
			{
				System.out.print("Error: What you entered was not an Integer."+"\n");
				//System.out.print("Error :" + e.getMessage());
			}
			//statement = true;
		}
		while (num != (int)num);
		return num;

	}

}
