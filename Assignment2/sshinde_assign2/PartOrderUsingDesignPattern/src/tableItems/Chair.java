package tableItems;

/**
 * 
 * @author Sachin Shinde
 *
 */

// Define a Chair
public class Chair implements ITableItems{
	private int basePrice = 50;
	private int stylePrice = 0;
	private int totalPrice = 0;
	
	// to get Base price
	@Override
	public int getBasePrice() {
		return this.basePrice;
	}

	// to set Base price
	@Override
	public void setBasePrice(int basePrice) {
		this.basePrice=basePrice;
	}
		
	// to set price as per style
	@Override
	public void setStylePrice(int stylePrice) {
		this.stylePrice = stylePrice;
	}
	
	// to get price for the style
	@Override
	public int getStylePrice() {
		return this.stylePrice;
	}
	
	
	// to get the total price
	@Override
	public int getTotalPrice() {
		this.totalPrice = getBasePrice() + getStylePrice();
		return this.totalPrice;
	}

	

}
