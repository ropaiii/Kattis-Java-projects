package kattis_Hradgreining;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String result = scan.next();
		scan.close();
		if(result.contains("COV")) {
			System.out.println("Veikur!");
		} else {
			System.out.println("Ekki veikur!");
		}
	}
}
