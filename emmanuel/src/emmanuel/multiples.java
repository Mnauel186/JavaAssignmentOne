package emmanuel;
import java.util.Scanner;
public class multiples {
//program to display multiples of 2,3,7 within range of 71 to 150
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
//prompts user to enter a number
	        System.out.print("Enter a number: ");
	        int num = sc.nextInt();

	        if (num <= 70) {
	            System.out.print(num + " is a multiple of 3 and 7.\n");
	        } else if (num >= 71 && num <= 149) {
	            System.out.print(num - 70 + " is a multiple of 3.\n");
	        } else if (num >= 71 && num <= 149) {
	            System.out.print(num - 70 + " is a multiple of 7.\n");
	        } else {
	        	//output 
	            System.out.println("Number is not in the range 71 to 150.");
	        }

	        sc.close();
	}

}
