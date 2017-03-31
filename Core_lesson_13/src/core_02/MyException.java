package core_02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyException {

	
	public void one() throws FileNotFoundException{
//		FileInputStream fileInputStream = new FileInputStream("text.txt");
		throw new ArrayIndexOutOfBoundsException();
	}
	
	public void two() throws FileNotFoundException{
		one();
	}
	
	public void three() throws FileNotFoundException{
		two();
	}
	
}
