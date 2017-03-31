package core_01;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		
//		int [] mass = new int [5];
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("enter number");
//		
//		
//		try{
//			 
//				mass[scanner.nextInt()] = 10;
//			  
//			System.out.println("1111");
//		}catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("array exception");
////			e.printStackTrace();
//		} finally {
//			System.out.println("finally");
//			scanner.close();
//			
//		}
//		
//		
//		System.out.println("after exception");
//		
		
//		try {
//			FileInputStream fileInputStream = new FileInputStream("text.txt");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		MyException myException = new MyException();
//		myException.three();
//		
		UserValidator userValidator = new UserValidator();
		
		
		
		System.out.println("enter name");
		String name = scanner.next();
		System.out.println("enter email");
		String email = scanner.next();
		
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		
		userValidator.validate(user);
//		
//		try(Scanner scanner1 = new Scanner(System.in)){
//			
//			
//			
//		}
		
		
	}
	
}
