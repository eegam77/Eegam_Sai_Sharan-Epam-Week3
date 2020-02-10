import java.util.*;
import java.lang.Exception;
public class Simplecalculator extends Calculator {

	public static void main(String[] args) {

		int n;
		double a,b;
		Scanner sc = new Scanner(System.in);
		Calculator cal=new Calculator();
		System.out.println("Enter any two numbers on which operations are to be performed: ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("Enter any option for which operation is to be performed:\n 1. Addition \n 2.Multiplication \n 3.Substraction \n 4.Division\n ");
		n=sc.nextInt();
		try {
		switch(n)
		{
		case 1: System.out.println("Addition of given two numbers is: "+cal.Add(a,b));break;
		case 2: System.out.println("Multiply of given two numbers is: "+cal.Multiply(a,b));break;
		case 3: System.out.println("Substraction of given two numbers is: "+cal.Substract(a,b));break;
		case 4: System.out.println("Division of given two numbers is: "+cal.Division(a,b));
		}
		}
		catch(Exception ex)
		{
			System.out.println("Please enter correct option");
		}
		sc.close();
	}
	

}
