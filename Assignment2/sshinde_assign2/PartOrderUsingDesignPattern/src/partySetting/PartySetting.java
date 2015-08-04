package partySetting;

import java.util.ArrayList;

import tableSetting.ITableSetting;


/**
 * 
 * @author Sachin Shinde
 *
 */

// This class prepares a party setting

public class PartySetting {
	int numberOfTables = 0;
	ArrayList<ITableSetting> tableSettings = new ArrayList<ITableSetting>();
	String style="";
	
	public PartySetting(int numberOfTables,String style){
		System.out.println("Inside Party Setting Constructor");
		System.out.println();
		this.numberOfTables = numberOfTables;
		this.style = style;
		PartySettingBuilder partySettingBuilder = new PartySettingBuilder(numberOfTables, style);
		tableSettings = partySettingBuilder.preparePartySettings();
	}
	
	// Calculates and returns cost
		public int calculateCost(){
			int cost = 0;
			ITableSetting tableSetting = null;
			for(int i=0;i<tableSettings.size();i++){
				tableSetting = tableSettings.get(i);
				cost = cost + tableSetting.getTableSettingPrice();
			}
				
			return cost;
		}
		
		public void displayPartySetting(){
			int chairs=0;
			int centerPiece=0;
			int placeSetting=0;
			
			System.out.println("Party Setting is as follows:");
			System.out.println("Number of tables: "+ this.numberOfTables);
			System.out.println("Style: "+this.style);
			System.out.println("Every Party Setting has "
					+tableSettings.get(0).getNumberOfChairs()+" chairs "+
					+tableSettings.get(0).getNumberOfCenterPieces()+" center pieces "+
					+tableSettings.get(0).getNumberOfplaceSettings()+" place settings "
					);
			ITableSetting tableSetting = null;
			
			for(int i=0;i<tableSettings.size();i++){
				tableSetting = tableSettings.get(i);
				chairs = chairs+tableSetting.getNumberOfChairs();
				centerPiece = centerPiece+tableSetting.getNumberOfCenterPieces();
				placeSetting = placeSetting+tableSetting.getNumberOfplaceSettings();
			}
			
			System.out.println("total number of center pieces: "+centerPiece);
			System.out.println("total number of chairs: "+chairs);
			System.out.println("total number of place settings: "+placeSetting);
			System.out.println("Total party Cost: "+calculateCost());
		}
}
