import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MainTest {

	Service service = new Service();

	@Test
	void verifyGenreCount() {
		service.generateTestMap();
		int expectedCount = 1;
		int actualCount = service.countGenre("Anime");
		assertEquals(actualCount, expectedCount);
	}

}
