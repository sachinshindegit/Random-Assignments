package Styles;

import PartySetting.TableSetting;

/**
 * 
 * @author Sachin Shinde
 * This class defines Vintage style
 */
public class Vintage extends TableSetting{
	
	// Defining prices of vitage items
	
	int chairPrice = chairBasePrice + 50;
	int placeSettingPrice = placeSettingBasePrice + 40;
	int centerPiecePrice = centerPieceBasePrice + 35;
	
	public Vintage(){
		style = "Vintage";
	}
	
	
	/**
	 * Method calculates a cost of 1 table setting. This method is abstract in the parent class TableSetting
	 * @return int
	 */
	public int cost(){
		int cost = 0;
		cost = noOfChairs*chairPrice + 
				noOfCenterPieces*centerPiecePrice + 
				noOfplaceSettings*placeSettingPrice;
		return cost;
		
	}
}
