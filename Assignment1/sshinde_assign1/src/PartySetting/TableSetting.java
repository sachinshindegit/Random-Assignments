package PartySetting;
/**
 * 
 * @author Sachin Shinde
 * This abstract class defines a Table Setting
 */
public abstract class TableSetting {
	
	// Defines the base prices of chair, center piece and a place Setting
	public int chairBasePrice = 50;
	public int placeSettingBasePrice = 20;
	public int centerPieceBasePrice = 30;
	
	
	// defines number of items in a place setting
	public int noOfCenterPieces = 1;
	public int noOfChairs = 4;
	public int noOfplaceSettings = 4;
	
	public String style="";
	
	// Abstract method
	public abstract int cost();
}
