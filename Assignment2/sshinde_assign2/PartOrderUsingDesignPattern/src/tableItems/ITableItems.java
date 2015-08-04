package tableItems;

/**
 * 
 * @author Sachin Shinde
 *
 */

// This interface is for a table item eg: chair, place setting and center piece
public interface ITableItems {
	// Method to get base price of the item
	public int getBasePrice();
	
	// Method to get base price of the item
	public void setBasePrice(int basePrice);
		
	// method to set price of the item as per the style
	public void setStylePrice(int stylePrice);
	
	// method to get price of the item as per the style
	public int getStylePrice();
		
	// method to get the total price of the item
	public int getTotalPrice();
	
}
