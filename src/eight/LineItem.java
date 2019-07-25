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

	public Item getItem() {
		return item;
	}
}
