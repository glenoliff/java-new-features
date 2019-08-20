package nine.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StreamImprovments {

	@BeforeEach
	public void setUp() {		

	}
	
	@Test
	public void takeWhile() {
		List<Integer> takenInts =  Stream.of(2, 4, 6, 8, 9, 10)
										 .takeWhile(n -> n % 2 == 0)
										 .collect(Collectors.toList());		
		
		assertEquals(4, takenInts.size());
	}
	@Test
	public void dropWhile() {
		List<Integer> droppedInts = Stream.of(2, 4, 6, 8, 9, 10)
  										  .dropWhile(n -> n % 2 == 0)
										  .collect(Collectors.toList());
		
		assertEquals(2, droppedInts.size());
	}
	
	@Test
	public void ofNullable() {
		
		HashMap<Integer, Integer> map = new HashMap();

		map.put(1, 1);
		map.put(2, 4);
		map.put(3, null);
		map.put(4, 16);
		
		List<Integer> values = map.keySet().stream().flatMap(i -> Stream.ofNullable(map.get(i))).collect(Collectors.toList());

		assertEquals(3, values.size());
	}
	
	@Test
	public void iterate() {
		
		List<Integer> ints = IntStream.iterate(1, i -> i < 5, i -> i + 1).boxed().collect(Collectors.toList());
		
		assertEquals(4, ints.size());
		
	}
}
