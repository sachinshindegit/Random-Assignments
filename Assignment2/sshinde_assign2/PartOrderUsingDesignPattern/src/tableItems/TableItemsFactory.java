package tableItems;

/**
 * 
 * @author Sachin Shinde
 *
 */

// This class is the table items Factory
public class TableItemsFactory {
	String itemName = null;
	
	// Constructor to set the item name
	public TableItemsFactory(String itemName){
		this.itemName = itemName.toLowerCase();
		//System.out.println("Inside Table Items Factory. Building a "+itemName);
	}
	
	// This method returns an object of the item requested
	public ITableItems getTableItem(){
		switch(this.itemName){
			case "chair":
				return new Chair();

			case "place setting":
				return new PlaceSetting();
				
			case "center piece":
				return new CenterPiece();
			
			default:
				return null;
		}
	}
}

