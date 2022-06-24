package LEARNPROJECT;
import java.util.Scanner;
import java.lang.Math;
public class ArithmeticCalculator {

	public static void main(String gg[])
	{
		int number1,number2,result;
		
		Scanner sc=new Scanner(System.in);
		while(true)

		{
			System.out.println("Enter the numbers: ");
			number1=sc.nextInt();
			number2=sc.nextInt();
			System.out.println("Enter the operation to perform: (+,-,*,/)");
			char operation=sc.next().charAt(0);
		if(operation=='+') {
			result=number1+number2;
			System.out.println(result);
			continue;
		}else if(operation=='-') {
			result=number1-number2;
			System.out.println(result);
			continue;
		}else if(operation=='*') {
			result=number1*number2;
			System.out.println(result);
			continue;
		}else if(operation=='/') {
			if(number2==0) {
				System.out.println("Cannot divide by zero");
				continue;
			}
			result=number1/number2;
			System.out.println(result);
			continue;
		}else {
			System.out.println("Invalid Operation");
			continue;
			}
		}
	}
}
