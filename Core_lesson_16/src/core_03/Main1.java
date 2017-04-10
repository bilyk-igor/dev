package core_03;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Main1 {

	public static void main(String[] args) throws IOException {
		
		
//		FileOutputStream fileOutputStream = new FileOutputStream("text.txt");
//		
//		fileOutputStream.write("some1\n".getBytes());
//		fileOutputStream.write("some2\n".getBytes());
//		fileOutputStream.write("some3\n".getBytes());
//		fileOutputStream.write("some4\n".getBytes());
//		
//		
//		fileOutputStream.flush();
//		fileOutputStream.close();
		
		String newText = "some1000\n";
		
		BufferedReader bufferedReader = 
				new BufferedReader(new FileReader("text.txt"));
		
		
		String all = "";
		
		String idx;
		
		while((idx = bufferedReader.readLine()) != null){
			all = all + idx+"\n";
//			System.out.println(all);
		}
		System.out.println(all);

		
		
		all = all + newText;
		FileOutputStream fileOutputStream = new FileOutputStream("text.txt");
		
		
		fileOutputStream.write(all.getBytes());
		fileOutputStream.flush();
		
		
		
		
		
		
		
		
		
	}
	
}
