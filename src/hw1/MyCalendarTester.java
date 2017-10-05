package hw1;

import java.util.*;

public class MyCalendarTester {
	public static void main(String[] args) {
		/*
		 * should create new myCalendar object
		 */
		MyCalendar myCal = new MyCalendar();
		GregorianCalendar cal = new GregorianCalendar();
		myCal.displayMainMenu(cal);
		displayOptions();
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine().toLowerCase();
		while (true) {
			if (input.equals("l")) {
				myCal.load();
				myCal.displayMainMenu(cal);
				displayOptions();
				input = sc.nextLine().toLowerCase();
				// need to display calendar WITH EVENTS

			} else if (input.equals("v")) {
				myCal.viewBy();
				myCal.displayMainMenu(cal);
				displayOptions();
				input = sc.nextLine().toLowerCase();
			} else if (input.equals("c")) {
				myCal.create();
				myCal.displayMainMenu(cal);
				displayOptions();
				input = sc.nextLine().toLowerCase();
			} else if (input.equals("g")) {
				myCal.goTo();
				displayOptions();
				input = sc.nextLine().toLowerCase();
			} else if (input.equals("e")) {
				myCal.eventList();
				myCal.displayMainMenu(cal);
				displayOptions();
				input = sc.nextLine().toLowerCase();
			} else if (input.equals("d")) {
				myCal.delete();
				myCal.displayMainMenu(cal);
				displayOptions();
				input = sc.nextLine().toLowerCase();
			} else /* if (input.equals("q")) */ {
				myCal.quit();
				break;
			}

		}
	}
	
	/**
	 * method to prompt for user input for the next step 
	 */
	public static void displayOptions() {
		System.out.println("\nSelect one of the following options: \n"
				+ "[L]oad   [V]iew by  [C]reate, [G]o to [E]vent list [D]elete  [Q]uit\n");
	}
}
