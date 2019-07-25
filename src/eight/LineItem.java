package eight;

public class LineItem {

	private Item item;
	
	private int numItems;

	public LineItem(Item item, int numItems) {
		super();
		this.item = item;
		this.numItems = numItems;
	}

	public double getCost() {
		return (item.getCost() * numItems);
	}

	public int getNumItems() {
		return numItems;
	}
	
	public String getItemName() {
		return item.getName();
	}

	public Item getItem() {
		return item;
	}

	public boolean nameEquals(String typeName) {
		return item == null ? false : item.getName().equalsIgnoreCase(typeName);
	}
}
