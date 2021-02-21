package Assignment2;

import java.util.Scanner;

public class GreaterOfThree {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter any number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter any number: ");
        int num2 = scan.nextInt();
        System.out.print("Enter any number: ");
        int num3 = scan.nextInt();
        scan.close();
        
        System.out.println(check(num1, num2, num3));
        
    }
	public static int check(int num1, int num2, int num3) {
		if(num1 > num2 && num1 > num3) return num1;
		else if(num2 > num1 && num2 > num3) return num2;
		else return num3;
	}
}
