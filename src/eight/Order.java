package eight;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Order {

	private String name;
	private String address;
	private ArrayList<LineItem> items;
	
	public Order(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}

	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public double getCost() {
		
		if (getItems() == null) {
			return 0.0;
		}
		
		return getItems()
					.stream()
					.map(li -> li.getCost())
					.reduce(0.0, Double::sum);
		
	}
	
	public ArrayList<LineItem> getItems() {
		return items;
	}
	
	public void addItem(LineItem item) {
		
		if (items == null) {
			items = new ArrayList<>();
		}
		
		items.add(item);
	}
}
