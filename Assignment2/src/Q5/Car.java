package Q5;

public class Car {
	private int speed;
	private int noOfGears;
	
	public void drive(int initialSpeed, int initialNoOfGears) {
        speed = initialSpeed;
        noOfGears = initialNoOfGears;
    }

    public void display() {
        System.out.println("Speed: " + speed);
        System.out.println("Number of gears: " + noOfGears);
    }
	

}
