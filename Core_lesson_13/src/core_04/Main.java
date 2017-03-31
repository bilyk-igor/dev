package core_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
//
//		int[] mass = new int[5];
//
//		System.out.println("enter some array index");
//
//		try {
//			mass[scanner.nextInt()] = 100;
//
//			Integer i = null;
//			int a = i;
//
//			System.out.println("in try block");
//
//		} catch (ArrayIndexOutOfBoundsException e) {
//
//			System.out.println("array exception");
//
//		} catch (InputMismatchException e) {
//
//			System.out.println("input mithmatch");
//
//		} catch (Exception e) {
//
//			e.printStackTrace();
////			System.exit(0);
//			
//		}finally {
//			
//			System.out.println("finally");
//			scanner.close();
//		}
//
//		System.out.println("after exceptioin");

		
//		try {
//			FileInputStream fileInputStream  = new FileInputStream("text.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
//		MyException myException = new MyException();
//		
//		myException.three();
		
		System.out.println("enter login");
		String login = scanner.next();
		System.out.println("enter email");
		String email = scanner.next();
		
		User user = new User(login, email);
		
		
		UserValidator userValidator = new UserValidator();
		
		userValidator.validate(user);
		
		
		
		
		
		
	}

}
