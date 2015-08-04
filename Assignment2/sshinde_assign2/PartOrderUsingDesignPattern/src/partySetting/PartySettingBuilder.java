package partySetting;

import java.util.ArrayList;

import tableSetting.Contemporary;
import tableSetting.ITableSetting;
import tableSetting.Modern;
import tableSetting.Vintage;

/**
 * 
 * @author Sachin Shinde
 *
 */

// This class prepares a party setting Builder
public class PartySettingBuilder {
	int numberOfTables = 0;
	ArrayList<ITableSetting> tableSettings = new ArrayList<ITableSetting>();
	String style="";
	
	
	public PartySettingBuilder(int numberOfTables,String style){
		System.out.println("Inside Party Setting Builder Constructor");
		this.numberOfTables = numberOfTables;
		this.style = style.trim().toLowerCase();
	}
	
	// prepares a party setting
	public ArrayList preparePartySettings(){
		switch(this.style){
		case "vintage":
			for(int i=0;i<this.numberOfTables;i++){
				tableSettings.add(new Vintage());
			}
			break;
		case "contemporary":
			for(int i=0;i<this.numberOfTables;i++){
				tableSettings.add(new Contemporary());
			}
			break;
		case "modern":
			for(int i=0;i<this.numberOfTables;i++){
				tableSettings.add(new Modern());
			}
			break;
			
		}
		return tableSettings;
	}
	
	
}
