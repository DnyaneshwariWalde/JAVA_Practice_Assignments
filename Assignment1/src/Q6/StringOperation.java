package Q6;
public class StringOperation {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a String as a command line argument.");
            return;
        }

        String str = args[0];
        int length = str.length();
        System.out.println("Length of the String: " + length);

        String uppercase = str.toUpperCase();
        System.out.println("Uppercase String: " + uppercase);

        String reverse = new StringBuilder(str).reverse().toString();
        boolean isPalindrome = str.equalsIgnoreCase(reverse);
        System.out.println("Is the String a Palindrome?");
        System.out.println("Ans:" + isPalindrome);
    }
}

