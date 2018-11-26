package by.itacademy.library.controller.console.view;

import java.util.HashMap;
import java.util.Map;

public class SimpleConsoleView {

	private static Map<String, Object> userInput = new HashMap<>();

	public static void showBasicMenu() {

		System.out.println("1- view books catalog");
		System.out.println("2- view single catalog row");
		System.out.println("3- find book by title");
		System.out.println("4- add new book");
	}

	// simulate user input
	/*
	 * private static int readMenuItem(int value) { //read menu item from console
	 * return 1; //return value; }
	 */

	public static Map<String, Object> readUserInput() {
		int item = readMenuItem();
		getInputData(item);

		return userInput;
	}

	private static void getInputData(int menuItem) {

		switch (menuItem) {
		 case 1:
			 userInput.put("user_action", "view_catalog");
		 break;
		case 2:
			// Scanner sc = new Scanner(System.in);
			// get row number from console
			userInput.put("user_action", "single_row");
			userInput.put("row_number", 2);

			break;
		case 3:
			userInput.put("user_action", "find_book");
			userInput.put("book_title", "Book1");

			break;
		case 4:
			// implement later
			break;
		}

	}

	private static int readMenuItem() {
		// use Scanner to get menu item
		return 1;// 2 or 3 or 4 or else
	}
}
