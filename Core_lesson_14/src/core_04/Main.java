package core_04;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Main {

	public static void main(String[] args) throws IOException {

		File file = new File("test.txt");
		
//		file.mkdirs();
		
//		file.createNewFile();
//		
//		System.out.println(file.getAbsolutePath());
	
//		System.out.println(file.lastModified()/ 1000/ 60 / 60 / 60/ 7/ 51);
		
//		FileOutputStream fileOutputStream = new FileOutputStream(file/*, true*/);
		
		
//		for (int i = 0; i < 1000; i++) {
//			
//			fileOutputStream.write(i);
//		}
	
//		fileOutputStream.write("some text".getBytes());
	
//		fileOutputStream.close();
		
		
//		FileInputStream fileInputStream = new FileInputStream(file);
//		
//		int tmp;
//		
//		while((tmp = fileInputStream.read()) != -1){
//			System.out.print(Character.toChars(tmp));
//		}
		
//		File from = new File("from.txt");
//		File to = new File("to.txt");
//		
//		to.createNewFile();
//		from.createNewFile();
//		
//		FileOutputStream fileOutputStream = new FileOutputStream(to);
//		FileInputStream fileInputStream = new FileInputStream(from);
//		
//		int tmp;
//		
//		while((tmp = fileInputStream.read()) !=-1){
//			fileOutputStream.write(tmp);
//		}
//			
//		fileInputStream.close();
//		fileOutputStream.close();
		
		
//		FileWriter fileWriter = new FileWriter(file);
//		
//		fileWriter.write("some text1");
//		
//		fileWriter.flush();
		
//		fileWriter.close();
		
		
//		FileReader fileReader = new FileReader(file);
//		
//		BufferedReader bufferedReader = new BufferedReader(fileReader);
//		
//		String tmp;
//		
//		while((tmp = bufferedReader.readLine()) !=null){
//			System.out.println(tmp);
//		}
//		
//		bufferedReader.close();
		
		String url = "https://www.w3schools.com/css/paris.jpg";
		
		String fileName = "pic.png";
		
		BufferedImage img = ImageIO.read(new URL(url));
		
		File pic = new File(fileName);
		
		pic.createNewFile();
		
		ImageIO.write(img, "png", pic);
		
		
		
		
		
		
		
		
		
		
		
	}

}
