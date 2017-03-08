package calendar_01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Month[] months = Month.values();

		Month month = months[0];
		boolean exist = false;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter some month");
		
		String userMonth = scanner.next();
		
		for (int i = 0; i < months.length; i++) {
			
			if(userMonth.equalsIgnoreCase(months[i].name())){
				
				month = months[i];
				System.out.println("exists");
				break;
			}
			
		}
	
		if(exist == false){
			System.out.println(userMonth+ " doesn't exist");
		}
		
	
	}

}
