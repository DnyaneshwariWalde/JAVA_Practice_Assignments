package Q3;
/*
 * Create a class Medicine to represent a drug manufactured by a pharmaceutical company. Provide a function displayLabel() in this class to print Name and address of the company. 

	Derive Tablet, Syrup and Ointment classes from the Medicine class. Override the displayLabel() function in each of these classes to print additional information suitable to the type of medicine. For example, in case of tablets, it could be “store in a cool dry place”, in case of ointments it could be “for external use only” etc.

	Create a class TestMedicine . Write main function to do the following:
	Declare an array of Medicine references of size 10
	Create a medicine object of the type as decided by a randomly generated integer in the range 1 to 3. 
	
	Refer Java API Documentation to find out random generation feature. 
	
	Check the polymorphic behavior of the displayLabel() method.
 */
public class TestMedicine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Medicine med[] = new Medicine[10];
		double i = Math.random()*4;
		int x = (int)i;
		System.out.println(x);
		
		switch (x) 
		{
			case 1: 
				med[0] = new Medicine();
				med[1] = new Ointment();
				med[0].displayLabel();
				med[1].displayLabel();
				break;
			case 2:
				med[2] = new Medicine();
				med[3] = new Syrup();
				med[2].displayLabel();
				med[3].displayLabel();
				break;
			case 3:
				med[4] = new Medicine();
				med[5] = new Tablet();
				med[4].displayLabel();
				med[5].displayLabel();
				break;
			default:
				System.out.println("Choice Unavailable...");
			}

	}

}
