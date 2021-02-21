package Assignment2;

import java.util.Scanner;

public class PosOrNeg {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter any number: ");
        int num1 = scan.nextInt();
        
        scan.close();
        
        System.out.println(check(num1));
        
    }
	public static String check(int num) {
		String neg = "Negative.";
		String pos = "Positive.";
		if(num < 0 ) return neg;
		else return pos;
	}
}
