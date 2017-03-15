package com.jose.q3.utilities;

import java.io.Console;

import com.jose.q3.enumerators.OptionEnum;

public class Utility {

	private static Console console = System.console();

	public static OptionEnum initiateConsole() {

		final OptionEnum option = OptionEnum
				.valueOf(console.readLine("Please choose an option:" + "\nCIRCLE" + "\nSQUARE" + "\nRECTANGLE"
						+ "\nDONUT" + "\n\nType HELP for usage instructions." + "\n\nTo exit please Type EXIT \n"));

		return option;
	}

	public static void showMainMenu(){
		
		 switch (initiateConsole()) {
			case CIRCLE:
				System.out.println("You chose option 1, CIRCLE.\n");
				showMainMenu();
				break;			
			case SQUARE:
				System.out.println("You chose option 2, SQUARE.\n");
				showMainMenu();
				break;
			case RECTANGLE:
				System.out.println("You chose option 3, RECTANGLE.\n");
				showMainMenu();
				break;
			case DONUT:
				System.out.println("You chose option 4, DONUT.\n");
				showMainMenu();
				break;
			case HELP:
				System.out.println("You chose option Help.\n");
				showMainMenu();
				break;
			case EXIT:
				System.out.println("You chose option Exit.");				
				break;

			default:
				System.out.println("You chose an invalid Option.");
				showMainMenu();
				break;
			}	
	}
}	
