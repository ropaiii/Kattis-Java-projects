package firstproject;

import java.util.Scanner;

public class FirstProject {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();
		scanner.close();
		ReverseString reverseString = new ReverseString();
		String reversed = reverseString.reverse(text);
		
		System.out.println(reversed);
		
	}
}
