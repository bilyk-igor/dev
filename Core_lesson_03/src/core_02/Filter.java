package core_02;

public class Filter {

	
	public static int filter(String text){
		return Integer.parseInt(text.replaceAll("[^0-9]", ""));
	}
	
}
