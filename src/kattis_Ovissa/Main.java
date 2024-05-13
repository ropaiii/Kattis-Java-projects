package kattis_Ovissa;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String struncertain = scan.next();
		scan.close();
		int uncertain = 0;
		for(int i = 0; i < struncertain.length(); i++) {
			++uncertain;
		}
		
		System.out.println(uncertain);
	}
}
