package core_01;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class MyException {

	public void one() throws FileNotFoundException{
		throw new FileNotFoundException();
	}
	
	public void two() throws FileNotFoundException{
		one();
	}
	public void three() throws FileNotFoundException{
		two();
	}
	
}
