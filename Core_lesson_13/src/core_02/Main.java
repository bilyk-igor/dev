package core_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

import core_02.UserValidator;



public class Main {
	public static void main(String[] args) throws Exception {

//		int[] mass = new int[5];
//
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("enter some index");
//
//		try {
//
//			mass[scanner.nextInt()] = 10;
//
//			System.out.println("some");
//		} catch (ArrayIndexOutOfBoundsException e) {
//
//			System.out.println("array exception");
//
//		} catch (Throwable e) {
//
//		} finally {
//
//			System.out.println("finally");
//			scanner.close();
//		}
//
//		System.out.println("after exeption");
		
//		try {
//			FileInputStream fileInputStream = new FileInputStream("text.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		MyException myException = new MyException();
//		myException.three();
		
		User user = new User("con", "some");
		
		UserValidator userValidator = new UserValidator();
		userValidator.validate(user);
		
		
		
		
		
		
		
		
		
	}
}
