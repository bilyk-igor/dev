package core_02;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class Main {
	public static void main(String[] args) throws IOException {

//		File file = new File("C:\\dev\\Core_lesson_14\\test.txt");
		
//		file.createNewFile();
		
//		System.out.println(file.getAbsolutePath());
		 
//		FileOutputStream fos = new FileOutputStream(file,true);
		
//		for (int i = 0; i < 1000; i++) {
//			fos.write(i);
//		}
		
//		fos.write("sdfrgtdfy\n".getBytes());
		
//		FileInputStream fis = new FileInputStream(file);
//		
//		int tmp;
//		
//		while((tmp = fis.read()) != -1){
//			System.out.print(Character.toChars(tmp));
//		}
		 
//		File fromFile = new File("from.txt");
//		File toFile = new File("to.txt");
//		
//		fromFile.createNewFile();
//		toFile.createNewFile();
//		
//		FileOutputStream fileOutputStream = new FileOutputStream(toFile);
//		
//		FileInputStream fileInputStream = new FileInputStream(fromFile);
//		
//		int tmp;
//		
//		while((tmp = fileInputStream.read()) != -1){
//			fileOutputStream.write(tmp);
//		}
//		
//		fileInputStream.close();
//		fileOutputStream.close();
		
		
//		FileWriter fileWriter = new FileWriter("test.txt");
//		
//		fileWriter.write("some text1");
//		
//		fileWriter.flush();
		
//		fileWriter.close();
		
//		FileReader fileReader = new FileReader("test.txt");
//		
//		BufferedReader bufferedReader = new BufferedReader(fileReader);
//		
//		 
//		String tmp;
//		
//		while((tmp = bufferedReader.readLine()) != null){
//			System.out.println(tmp);
//		}
		
		String url = "https://habrastorage.org/getpro/habr/post_images/3cd/1ba/067/3cd1ba06778094167a5ee38db68db656.jpg";
		
		String fileName = "picture.png";
		
		BufferedImage img = ImageIO.read(new URL(url));
		
		File file = new File(fileName);
		
		file.createNewFile();
		
		ImageIO.write(img, "png", file);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
