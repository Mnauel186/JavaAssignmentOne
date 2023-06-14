package manu;
import java.util.Scanner;

public class average {
//a program to calculate average of 5 units
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	    double sum = 0;
	    
	    //user marks input

	    for (int i = 1; i <= 5; i++) {
	      System.out.print("Enter the marks of unit " + i + ": ");
	      double marks = sc.nextDouble();
	      sum += marks;
	    }
	    
	    //calculation and display in the output

	    double average = sum / 5;
	    System.out.printf("The average marks is: %.2f", average);
	  }	

	}


