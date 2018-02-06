
public class Movie {
	
	String title;
	String genre;
	String ageRating;
	
	public Movie(String title, String genre, String ageRating) {
		this.title = title;
		this.genre = genre;
		this.ageRating = ageRating;
	}

	@Override
	public String toString() {
		return "[" + title + ", " + genre + ", " + ageRating + "]";
	}

}