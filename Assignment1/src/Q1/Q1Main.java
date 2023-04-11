package Q1;
//Write a program to list all even numbers less than or equal to the number n.  Take the value of n as input from user.
import java.util.Scanner;

public class Q1Main {

	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("List of all even numbers less than or equal to "+ n + "is as given below:");
		for(int i=1;i<=n;i++)
		{
			if(i%2 ==0)
			{
				System.out.println(""+i);
			}
		}
		

	}

}
