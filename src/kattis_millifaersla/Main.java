package kattis_millifaersla;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String monnei = "Monnei";
		String fjee = "Fjee";
		String dollabilljoll = "Dolladollabilljoll";
		
		int monneiFee;
		int fjeeFee;
		int dollabilljollFee;
		
		Scanner scan = new Scanner(System.in);
		monneiFee = scan.nextInt();
		fjeeFee = scan.nextInt();
		dollabilljollFee = scan.nextInt();
		scan.close();
		
		if(monneiFee < fjeeFee && monneiFee < dollabilljollFee) {
			System.out.println(monnei);
		} else if(fjeeFee < monneiFee && fjeeFee < dollabilljollFee) {
			System.out.println(fjee);
		} else {
			System.out.println(dollabilljoll);
		}
	}
}
