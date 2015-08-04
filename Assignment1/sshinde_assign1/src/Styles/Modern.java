package Styles;

import PartySetting.TableSetting;

/**
 * 
 * @author Sachin Shinde
 * This class defines Modern style
 */

public class Modern extends TableSetting{
	
	// Defining prices of Contemporary items
	int chairPrice = chairBasePrice + 100;
	int placeSettingPrice = placeSettingBasePrice + 30;
	int centerPiecePrice = centerPieceBasePrice + 40;
	
	public Modern(){
		style = "Modern";
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
