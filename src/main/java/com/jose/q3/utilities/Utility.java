package com.jose.q3.utilities;

import java.io.Console;
import java.util.UUID;

import com.jose.q3.enumerators.OptionEnum;
import com.jose.q3.enumerators.ShapeEnum;
import com.jose.q3.shapes.Circle;
import com.jose.q3.shapes.Donut;
import com.jose.q3.shapes.Rectangle;
import com.jose.q3.shapes.Square;

public class Utility {

	private static Console console = System.console();

	public static Selection initiateConsole() {

		final String[] option = console.readLine("\nPlease choose an option and write the parameters separating with a SPACE:" + "\nCIRCLE" + "\nSQUARE" + "\nRECTANGLE"
						+ "\nDONUT" + "\n\nType HELP for usage instructions." + "\n\nTo exit please Type EXIT \n")
				.split(" ");	
		if(option.length == 4){
			final Float[] coordinates = {Float.parseFloat(option[1]), Float.parseFloat(option[2]), Float.parseFloat(option[3])};
			return new Selection(option[0], coordinates);			
		}else if(option.length == 5){
			final Float[] coordinates = {Float.parseFloat(option[1]), Float.parseFloat(option[2]), Float.parseFloat(option[3]), Float.parseFloat(option[4])};
			return new Selection(option[0], coordinates);
		}else if(option[0].equals("HELP")){
			return new Selection(OptionEnum.HELP);
		}else if(option[0].equals("EXIT")){
			return new Selection(OptionEnum.EXIT);
		}		
		return new Selection(true); //If does not match, return error.
	}

	public static void showMainMenu(){
			
	final Selection selection = initiateConsole();
	
	if(selection.isError()){
		System.out.println("\nYou have entered an invalid option, please type HELP to check the help options.");
		showMainMenu();		
	}else{ //If no error		
		if(selection.getOption().equals(OptionEnum.HELP)){
			System.out.println("\nHi, this is the HELP Section"
					+ "\nPlease select a SHAPE and enter its coordinates as shown below:"
					+ "\nCIRCLE 3.4 -5 4."
					+ "\nanother example:"
					+ "\nSQUARE 4.0 4.0 6"
					+ "\nYou can also make a DONUT with 6 parameters or a RECTANGLE with 4 parameters.");
			showMainMenu();
		}else if(selection.getOption().equals(OptionEnum.EXIT)){
			System.out.println("Bye :)");
			System.exit(0);
		}else if(!Validator.validateCoordinates(selection.getShape(), selection.getCoordinates())){
			System.out.println("\nYou have selected an invalid combination of Shape and Coordinates.");
			showMainMenu();	
		}else{
			final ShapeEnum shape = Validator.validateShape(selection.getShape());
			
			if(shape == shape.CIRCLE){
				final Circle circle = new Circle(UUID.randomUUID(), selection.getCoordinates()[0], selection.getCoordinates()[1], selection.getCoordinates()[2]);
				System.out.println("CIRCLE: ID - " + circle.getId() + "\nWith centre at (" + circle.getCordX() + ", " + circle.getCordY() + ") radius " + circle.getRadius());
				showMainMenu();
			}else if(shape == shape.SQUARE){
				final Square square = new Square(UUID.randomUUID(), selection.getCoordinates()[0], selection.getCoordinates()[1], selection.getCoordinates()[2]);
				System.out.println("SQUARE: ID - " + square.getId() + "\nWith corners at (" + square.getCordX() + ", " + square.getCordY() + ") side lengh " + square.getSideLengh());
				showMainMenu();
			}else if(shape == shape.RECTANGLE){
				final Rectangle rectangle = new Rectangle(UUID.randomUUID(), selection.getCoordinates()[0], selection.getCoordinates()[1], selection.getCoordinates()[2], selection.getCoordinates()[3]);
				System.out.println("RECTANGLE: ID - " + rectangle.getId() + "\nWith Corners at (" + rectangle.getCordX() + ", " + rectangle.getCordY() + ") and sids at " + rectangle.getSide1() + ", " + rectangle.getSide2());
				showMainMenu();
			}else if(shape == shape.DONUT){
				final Donut donut = new Donut(UUID.randomUUID(), selection.getCoordinates()[0], selection.getCoordinates()[1], selection.getCoordinates()[2], selection.getCoordinates()[3], selection.getCoordinates()[4], selection.getCoordinates()[5]);
				System.out.println("DONUT: ID - " + donut.getId() + "\nWith inner centre at (" + donut.getCordX() + ", " + donut.getCordY() + ") radius " + donut.getRadius1() + " and outer centre at (" + donut.getCordA() + ", " + donut.getCordB() + ") radius " + donut.getRadius2());
				showMainMenu();
			}else if(shape == shape.INVALID){
				System.out.println("\nYou have selected an Invalid shape.");
				showMainMenu();
			}
		
		}	
	
	}	
	
}
}

