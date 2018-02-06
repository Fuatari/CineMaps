import java.util.HashMap;

public class Service {

	Converter convert = new Converter();

	HashMap<Integer, Movie> movieMap = new HashMap<Integer, Movie>();

	public Movie createMovie(String title, String genre, String ageRating) {
		Movie movie = new Movie(title, genre, ageRating);
		return movie;
	}

	public void generateTestMap() {
		addToMap(1, createMovie("Mayhem", "Action", "18"));
		addToMap(2, createMovie("A Silent Voice", "Anime", "3"));
		addToMap(3, createMovie("Alien", "Horror", "12"));
	}

	public void addToMap(int id, Movie movie) {
		movieMap.put(id, movie);
	}

	public void printMap() {
		System.out.println(movieMap.toString());
	}

	public void convertToJSON() {
		convert.javaToJSON(movieMap);
	}

}
