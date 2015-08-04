package Styles;

import PartySetting.TableSetting;


/**
 * 
 * @author Sachin Shinde
 * This class defines Contemporary style
 */

public class Contemporary extends TableSetting{
	
	// Defining prices of Contemporary items
	int chairPrice = chairBasePrice + 20;
	int placeSettingPrice = placeSettingBasePrice + 20;
	int centerPiecePrice = centerPieceBasePrice + 25;
	
	public Contemporary(){
		style="Contemporary";
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
