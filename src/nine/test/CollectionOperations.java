package nine.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CollectionOperations {

	@BeforeEach
	public void setUp() {		

	}
	
	@Test
	void listOfWithElements() {
		List<Integer> items = List.of(1, 2, 3); 		
		assertEquals(3, items.size());
	}
	
	@Test
	void listOfCantHaveNullElements() {

		assertThrows(NullPointerException.class, 
					 () -> { List.of("hello", null); });
	}
}
