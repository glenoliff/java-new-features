package eight;

import java.util.ArrayList;

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
		
		Double total = 0.0;
		
		for (LineItem lineItem : getItems()) {
			total += lineItem.getCost();
		}
		
//		//TODO: adjust using streams!
//		final Double total[] = new Double[1];
//
//		getItems().forEach(i -> total[0] += i.getCost());
		
		return total;
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
