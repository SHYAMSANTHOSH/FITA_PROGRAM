package com.loop;

public class SwitchWeekdays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String day = "Friday";
		switch(day) {
		case "Monday":
			System.out.println("Monday is Day 1");
			break;
		case "Tuesday":
			System.out.println("Tuesday is Day 2");
			break;
		case "Wednesday":
			System.out.println("Wednesday is Day 3");
			break;
		case "Thursday":
			System.out.println("Thursday is Day 4");
			break;
			default:
				System.out.println("Other Day");
		}
	}

}
