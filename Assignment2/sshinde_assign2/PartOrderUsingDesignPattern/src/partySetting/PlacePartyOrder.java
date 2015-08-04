package partySetting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import partySetting.PartySetting;

/**
 * 
 * @author Sachin Shinde
 * This class has the main method
 *
 */
public class PlacePartyOrder {

	public static void main(String[] args) {
		
		// instantiatng a reader to take input from the user
		BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
			
		int numberOfTables;
		int style;
		try {
				// Start user interaction
				System.out.println("Welcome to Party order");
				System.out.println("Please place your order as below");
			while(true){
				System.out.println("Enter number of tables required: ");
				numberOfTables = Integer.parseInt(bufferRead.readLine());
				System.out.println();
			    System.out.println("Style: Choose option number");
			    System.out.println("1. Vintage");
			    System.out.println("2. Contemporary");
			    System.out.println("3. Modern");
			    style = Integer.parseInt(bufferRead.readLine());
			    System.out.println();
			    if(style > 3 || style < 1){
			    	System.out.println("Please enter a valid number");
			    }else{
			    	break;
			    }
			}
			
			PartySetting partySetting = null;
			
			// switch case for the style
			switch(style){
				case 1:
					partySetting = new PartySetting(numberOfTables,"Vintage");
					break;
				case 2:
					partySetting = new PartySetting(numberOfTables,"Contemporary");
					break;
				case 3:
					partySetting = new PartySetting(numberOfTables,"Modern");
					break;
 			}
			System.out.println();
			partySetting.displayPartySetting();

			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
	}

	}


