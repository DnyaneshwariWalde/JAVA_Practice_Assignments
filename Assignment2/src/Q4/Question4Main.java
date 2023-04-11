package Q4;

public class Question4Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 if(args.length != 3) {
	            System.out.println("Invalid number of arguments.");
	            System.exit(0);
	        }
	        
	        double num1 = Double.parseDouble(args[0]);
	        double num2 = Double.parseDouble(args[1]);
	        String operator = args[2];
	        
	        switch(operator) {
	            case "+":
	                System.out.println("Result: " + (num1 + num2));
	                break;
	            case "-":
	                System.out.println("Result: " + (num1 - num2));
	                break;
	            case "*":
	                System.out.println("Result: " + (num1 * num2));
	                break;
	            case "/":
	                if(num2 == 0) {
	                    System.out.println("Cannot divide by zero.");
	                    System.exit(0);
	                }
	                System.out.println("Result: " + (num1 / num2));
	                break;
	            default:
	                System.out.println("Invalid operator.");
	        }
	}

}
