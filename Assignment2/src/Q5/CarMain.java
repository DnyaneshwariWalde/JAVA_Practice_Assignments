package Q5;
/*
  	5.Create a class Car which contains members speed, 
  	noOfGear. The class has a method drive() which is responsible to provide starting 
  	speed and noOfGears to a Car.  Implement display() method which will 
  	display all attributes of Car class.
	The class SportCar is derived from the class Car which adds new features 
	AirBallonType. When this method is invoked, initial speed and gear status must be displayed on console.  
	Override the display method which display all attribute of the SportCar. 
	Make use of super class display() method.
 */
import java.util.Scanner;

public class CarMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial speed: ");
        int initialSpeed = sc.nextInt();

        System.out.print("Enter initial number of gears: ");
        int initialNoOfGears = sc.nextInt();

        System.out.print("Enter air balloon type: ");
        String airBalloonType = sc.next();

        SportsCar sportsCar = new SportsCar();
        sportsCar.drive(initialSpeed, initialNoOfGears);
        sportsCar.airBalloonType = airBalloonType;

        sportsCar.display();
    }

}
