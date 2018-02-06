
public class Main {

	public static void main(String[] args) {
		
		Service service = new Service();
		
		Movie m1 = new Movie("Mayhem", "Action", "18");
		Movie m2 = new Movie("A Silent Voice", "Anime", "3");
		Movie m3 = new Movie("Alien", "Horror", "12");
		
		service.addToMap(1, m1);
		service.addToMap(2, m2);
		service.addToMap(3, m3);
		
		service.printMap();
		
	}

}
