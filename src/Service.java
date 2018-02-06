import java.util.HashMap;

public class Service {

	HashMap<Integer, Movie> movieMap = new HashMap<Integer, Movie>();

	public void generateTestMap() {
		Movie m1 = new Movie("Mayhem", "Action", "18");
		Movie m2 = new Movie("A Silent Voice", "Anime", "3");
		Movie m3 = new Movie("Alien", "Horror", "12");

		addToMap(1, m1);
		addToMap(2, m2);
		addToMap(3, m3);
	}

	public void addToMap(int id, Movie movie) {
		movieMap.put(id, movie);
	}

	public void printMap() {
		System.out.println(movieMap.toString());
	}
}
