package calendar;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Month [] months = Month.values();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("enter some name");
		
		String userMonth = scanner.next();
		
		boolean exists = false;
		
		Month indexMonth = null;
		
		for (int i = 0; i < months.length; i++) {
			
			if(userMonth.equalsIgnoreCase(months[i].name())){
				exists = true;
				indexMonth = months[i];
			}
		
		}
		
		
		if(exists == false){
			System.out.println(userMonth+ " doesn't exist");
		}
		
		
		for (int i = 0; i < months.length; i++) {
			if(months[i].getSeason() == indexMonth.getSeason()){
				System.out.println(months[i]);
			}
		}
		

	}
}
