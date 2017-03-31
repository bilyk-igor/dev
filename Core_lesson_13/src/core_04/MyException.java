package core_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.rmi.activation.ActivateFailedException;

public class MyException {

	public void one() throws FileNotFoundException{
		
//		FileInputStream fileInputStream  = new FileInputStream("text.txt");
		
//		throw new ActivateFailedException("ASD");		
	}
	
	public void two() throws FileNotFoundException{
		one();
	}
	
	public void three() throws FileNotFoundException{
		two();
	}
	
}
