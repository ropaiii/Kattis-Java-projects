package firstproject;

public class ReverseString {
	public String reverse(String str) {
		String temp = "";
		for(int i = str.length()-1; i>=0; i--) {
			temp += str.charAt(i);
		}
		return temp;
	}
}
