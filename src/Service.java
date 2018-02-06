import java.util.HashMap;

public class Service {
	
	HashMap<Integer, Movie> movieMap = new HashMap<Integer, Movie>();

	public void addToMap(int id, Movie movie) {
		movieMap.put(id, movie);
	}
	
	public void printMap() {
		System.out.println(movieMap.toString());		
	}
}
