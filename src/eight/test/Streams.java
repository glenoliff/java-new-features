package eight.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import eight.Item;
import eight.LineItem;
import eight.Order;

class Streams {

	private static final double TIRE_COST = 57.50;
	private static final double VALVE_STEM_COST = 1.25;
	
	private Order order;
	
	private Item tire = new Item("Tire", TIRE_COST);
	private Item valveStem = new Item("Valve Stem", VALVE_STEM_COST);
	
	@BeforeEach
	public void setUp() {		
		order = new Order("Order 1", "123 Elm St.");
	}
	
	@Test
	void noItemsZeroCost() {
		assertEquals(0.0, order.getCost());
	}
	
	@Test
	void basicCostCorrect() {
		order.addItem(new LineItem(tire, 1));		
		assertEquals(TIRE_COST, order.getCost());
	}
	
	@Test
	void basicTwoItemCostCorrect() {
		order.addItem(new LineItem(tire, 1));		
		order.addItem(new LineItem(valveStem, 1));		
		assertEquals(TIRE_COST + VALVE_STEM_COST, order.getCost());		
	}

	@Test
	void basicTwoValveStemsCostCorrect() {
		order.addItem(new LineItem(tire, 1));		
		order.addItem(new LineItem(valveStem, 2));		
		assertEquals(TIRE_COST + (2 * VALVE_STEM_COST), order.getCost());		
	}
}
