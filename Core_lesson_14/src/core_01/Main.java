package core_01;

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

		// file.mkdirs();

		//
		// file.createNewFile();
		//
		// System.out.println(file.exists());

		// FileOutputStream fileOutputStream = new FileOutputStream(file, true);

		// for (int i = 0; i < 1000; i++) {
		//
		// fileOutputStream.write(i);
		// }

		// fileOutputStream.write("my name is\n".getBytes());

		// FileOutputStream fileOutputStream = new
		// FileOutputStream("test2.txt");
		//
		// FileInputStream fileInputStream = new FileInputStream("test.txt");
		//
		// int c;
		//
		// while ((c = fileInputStream.read()) != -1) {
		// // System.out.println(Character.toChars(c));
		// fileOutputStream.write(c);
		//
		// }
		//

		// try (FileWriter fileWriter = new FileWriter("test.txt")) {
		//
		// fileWriter.write("some text1");
		//
		//// fileWriter.flush();
		// }
		// fileWriter.close();

		// BufferedReader bufferedReader = new BufferedReader(new
		// FileReader("test.txt"));
		//
		// String c;
		//
		// while ((c = bufferedReader.readLine()) != null) {
		//
		// System.out.println(c);
		//
		// }
		// bufferedReader.close();

		String URL = "https://habrastorage.org/getpro/habr/post_images/c91/83c/3d6/c9183c3d6390a5e3d9a73058fb0d7355.jpg";

		String fileName = "pic.png";

		BufferedImage img = ImageIO.read(new URL(URL));
		
		File filePic = new File(fileName);

		filePic.createNewFile();

		ImageIO.write(img, "png", filePic);

	}

}
