package kattis_aleidbio;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int minutes_to_friend;
		int minutes_to_cinema;
		int minute_of_day;
		
		Scanner input = new Scanner(System.in);
		minutes_to_friend = input.nextInt();
		minutes_to_cinema = input.nextInt();
		minute_of_day = input.nextInt();
		input.close();
		
		int result = minute_of_day-(minutes_to_friend+minutes_to_cinema);
		System.out.println(result);
	}
}
