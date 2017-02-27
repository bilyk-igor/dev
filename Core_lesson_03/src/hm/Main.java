package hm;

public class Main {
	public static void main(String[] args) {

		Dish [] dishs = {new Dish("chicken"),
				new Dish("salat"),
				new Dish("pig")};
		
		
		Menu menu = new Menu(dishs);
		
		Human human = new Human("anton", "hunter");
		
		PlayGame game = new PlayGame();
		
		game.start(human, menu);
		
		
		
	}
}
