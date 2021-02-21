package Assignment2;

import java.util.Scanner;

public class Weekday {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter any number 1-7: ");
        int num1 = scan.nextInt();
        
        scan.close();
        
        System.out.println(checkWeekday(num1));
        
    }
	public static String checkWeekday(int num) {
		switch(num) {
			case 1: return "Monday.";
			case 2: return "Tuesday.";
			case 3: return "Wedensday.";
			case 4: return "Thursday.";
			case 5: return "Friday.";
			case 6: return "Saturday.";
			case 7: return "Sunday.";
		}
		return "Invalid Number.";
	}
}
