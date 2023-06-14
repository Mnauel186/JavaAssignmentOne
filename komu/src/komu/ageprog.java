package komu;
import java.util.Scanner;
public class ageprog {

	public static void main(String[] args) {
		//program that ask the user to enter their surname and current age
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your surname: ");
	        String surname = scanner.nextLine();
	      System.out.print("Enter your age: ");
	      
	      
	        //calculating number of characters
	        int age = scanner.nextInt();

	        System.out.println("The number of characters in your surname is " + surname.length() + ".");
	        
	        //determination if even or odd
	        if (age % 2 == 0) {
	            System.out.println("Your current age is an even number.");
	        } else {
	            System.out.println("Your current age is an odd number.");
	        }

	}

}
