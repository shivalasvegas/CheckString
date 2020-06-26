package com.qa.checkstring;

public class CheckString {

	public static void main(String[] args) {
		checkString("Yours");

		checkTwoStrings("mine", "yours");
	}
	
	static void checkString(String myString) {
		
		String yourString = "Mine";
		if (myString == yourString) {
			System.out.println("Our strings match!");
		}else {
			System.out.println("Our strings don't match!");
		}
		
	}
	
static void checkTwoStrings(String myString1, String myString2) {
		
		
		if (myString1 == myString2) {
			System.out.println("Your strings match!");
		}else {
			System.out.println("Your strings don't match!");
		}
		
	}
	

}
