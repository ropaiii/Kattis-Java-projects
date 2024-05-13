package kattis_bluetooth;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int problems = scan.nextInt();
		int teeth = 32;
		String issues_tooth = "";
		ArrayList<String[]> totalIssuesList = new ArrayList<>();
		for(int i = 0; i < problems; i++) {
			String[] temp = null;
			issues_tooth = scan.next();
			issues_tooth += scan.nextLine();
			temp = issues_tooth.split(" ", 2);
			totalIssuesList.add(temp);
		}
		scan.close();
		MouthSpecifications specs = new MouthSpecifications();
		int cannotEatLeft = 0;
		int cannotEatRight = 0;
		for(String[] tooth_and_issues : totalIssuesList) {
			if(specs.Specifications(tooth_and_issues[0], tooth_and_issues[1]) == 1) {
				cannotEatLeft++;
			} else if(specs.Specifications(tooth_and_issues[0], tooth_and_issues[1]) == 2) {
				cannotEatRight++;
			}
		}
		//System.out.println("Left" + cannotEatLeft);
		//System.out.println("Right " + cannotEatRight);
		if (cannotEatLeft > cannotEatRight) {
		    System.out.println("1"); // Patienten kan äta med vänster sida
		} else if (cannotEatRight > cannotEatLeft) {
		    System.out.println("0"); // Patienten kan äta med höger sida
		} else {
		    System.out.println("2"); // Patienten kan inte äta med någon sida
		}
	}
}
