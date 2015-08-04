package PartySetting;

import Styles.Contemporary;
import Styles.Modern;
import Styles.Vintage;

/**
 * 
 * @author Sachin Shinde
 * This class defines a party setting	
 */
public class PartySetting {
	
	// Number of tables
	int noOfTables=0;
	
	// Array of Tables
	TableSetting[] tableSettings;
	
	// parameterized constructor which sets the following
	public PartySetting(int noOfTables, String style){
		this.noOfTables = noOfTables;
		tableSettings = new TableSetting[noOfTables];
		populateTablesArray(style);
	}
	

	/**
	 * This method calculates the total cost and returns the same
	 * @return int
	 */
	public int calculateCost(){
		TableSetting table = null;
		int totalCost = 0;
		for(int i=0; i<tableSettings.length;i++){
			table = tableSettings[i];
			totalCost = totalCost+table.cost();
		}
		return totalCost;
	}
	
	/**
	 * This method displays various information related to the party setting
	 */
	public void displayPartySetting(){
		System.out.println("Party Setting is as follows:");
		System.out.println("Number of tables: "+ this.noOfTables);
		System.out.println("Style: "+tableSettings[0].style);
		System.out.println("total number of center pieces: "+tableSettings[0].noOfCenterPieces*tableSettings.length);
		System.out.println("total number of chairs: "+tableSettings[0].noOfChairs*tableSettings.length);
		System.out.println("total number of place settings: "+tableSettings[0].noOfplaceSettings*tableSettings.length);
		System.out.println("Total party Cost: "+calculateCost());
	}
	
	/**
	 * This method forms the Table setting array
	 * @param style
	 */
	public void populateTablesArray(String style){
		
		// Switch case for populating the array according to the style chosen by the user
		switch(style){
		case "Vintage":
			for(int i=0;i<tableSettings.length;i++){
				tableSettings[i] = new Vintage();
			}
			break;
		case "Contemporary":
			for(int i=0;i<tableSettings.length;i++){
				tableSettings[i] = new Contemporary();
			}
			break;
		case "Modern":
			for(int i=0;i<tableSettings.length;i++){
				tableSettings[i] = new Modern();
			}
			break;
		}
		
	}
}
