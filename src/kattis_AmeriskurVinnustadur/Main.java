package kattis_AmeriskurVinnustadur;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int footballfields = scan.nextInt();
		scan.close();
		double result = 0.0;
		for(int i = 0; i < footballfields; i++) {
			result += 0.09144;
		}
		System.out.println(result);
	}
}
