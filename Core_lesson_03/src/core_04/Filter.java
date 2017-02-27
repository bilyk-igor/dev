package core_04;

public class Filter {

	public static int filter(String text){
		
		String filterString = text.replaceAll("[^0-9]", "");
		
		return Integer.parseInt(filterString); 
	}
	
	
}
