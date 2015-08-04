package tableSetting;

import java.util.ArrayList;

import tableItems.ITableItems;

/**
 * 
 * @author Sachin Shinde
 *
 */
// A Table Setting
public interface ITableSetting {
	
	public ArrayList <ITableItems> chairs();
	public ArrayList <ITableItems> placeSettings();
	public ArrayList <ITableItems> centerPieces();
	public void createTableSetting();
	
	public int getNumberOfChairs();
	public int getNumberOfCenterPieces();
	public int getNumberOfplaceSettings();
	public int getTableSettingPrice();
}
