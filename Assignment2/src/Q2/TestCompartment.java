package Q2;

import java.util.Scanner;

/*
 * Create an abstract class Compartment to represent a rail coach. Provide a abstract function notice in this class. Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the notice function in each of them to print notice suitable to the type of the compartment.

	Create a class TestCompartment . Write main function to do the following:

	Declare an array of Compartment pointers of size 10.

	Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.

	Check the polymorphic behavior of the notice method.

 */
public class TestCompartment {

	public static void main(String[] args) {
		
		Compartment cobj[] = new Compartment[10];
		//Scanner sc = new Scanner(System.in);
		double i = Math.random()*5;
		int ch = (int)i;
		System.out.println(ch);
		
		switch (ch) 
		{
			case 1: 
				cobj[0] = new FirstClass();
				cobj[0].notice();
				break;
			case 2:
				cobj[1] = new General();
				cobj[1].notice();
				break;
			case 3:
				cobj[2] = new Ladies();
				cobj[2].notice();
				break;
			case 4:
				cobj[3] = new Luggage();
				cobj[3].notice();
				break;
			default:
				System.out.println("Choice Unavailable...");
			}

	}

}
