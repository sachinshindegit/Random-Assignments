package tableSetting;

import java.util.ArrayList;

import tableItems.CenterPiece;
import tableItems.Chair;
import tableItems.ITableItems;
import tableItems.PlaceSetting;
import tableItems.TableItemsFactory;


/**
 * 
 * @author Sachin Shinde
 *
 */

// Defines a Contemporary table setting

public class Contemporary implements ITableSetting{
	public int noOfChairs = 4;
	public int noOfPlaceSetting = 4;
	public int noOfCenterPiece = 1;
	
	private ArrayList <ITableItems> chairs = new ArrayList();
	private ArrayList <ITableItems> placeSettings = new ArrayList();
	private ArrayList <ITableItems> centerPieces = new ArrayList();
	private ArrayList <ITableItems> tableSettingItems = new ArrayList();
	
	public Contemporary() {
		System.out.println("Inside Contemporary Constructor creating a Contemporary table setting");
		createTableSetting();
	}
		
	// creates array of chairs
	@Override
	public ArrayList <ITableItems> chairs() {
		// Asking factory to create a Chair
		TableItemsFactory chairFactory = new TableItemsFactory("chair");
		for(int i=0;i<noOfChairs;i++){
			ITableItems chair = chairFactory.getTableItem();
			chair.setStylePrice(20);
			chairs.add(chair);
		}
		return chairs;
	}
	
	// creates array of place settings
	@Override
	public ArrayList <ITableItems> placeSettings() {
		// Asking factory to create a place setting
		TableItemsFactory placeSettingFactory = new TableItemsFactory("place setting");
		for(int i=0;i<noOfPlaceSetting;i++){
			ITableItems placeSetting = placeSettingFactory.getTableItem();
			placeSetting.setStylePrice(20);
			placeSettings.add(placeSetting);
		}
		return placeSettings;
	}

	// creates array of center pieces	
	@Override
	public ArrayList <ITableItems> centerPieces() {
		// Asking factory to create a center piece
		TableItemsFactory placeSettingFactory = new TableItemsFactory("center piece");
		for(int i=0;i<noOfCenterPiece;i++){
			ITableItems centerPiece = placeSettingFactory.getTableItem();
			centerPiece.setStylePrice(25);
			centerPieces.add(centerPiece);
		}
		return centerPieces;
	}

	// creates a table setting
	@Override
	public void createTableSetting() {
		tableSettingItems.addAll(chairs());
		tableSettingItems.addAll(centerPieces());
		tableSettingItems.addAll(placeSettings());
	}

	// returns total price of a table setting
	@Override
	public int getTableSettingPrice() {
		int cost = 0;
		ITableItems item = null;
		for(int i=0;i<tableSettingItems.size();i++){
			item = tableSettingItems.get(i);
			cost = cost + item.getTotalPrice();
		}
		return cost;
	}
	@Override
	public int getNumberOfChairs() {
		return noOfChairs;
	}

	@Override
	public int getNumberOfCenterPieces() {
		return noOfCenterPiece;
	}

	@Override
	public int getNumberOfplaceSettings() {
		return noOfPlaceSetting;
	}

}
