package com.jose.q3.utilities;

import com.jose.q3.enumerators.ShapeEnum;

public class Validator {

	public static boolean validateCoordinates(final String shape, final Float[] coordinates){
		
		if(shape.contains("CIRCLE") && coordinates.length == 3){
			System.out.println("\nYou have a valid Shape of a CIRCLE");
			return true;
		}else if(shape.contains("SQUARE") && coordinates.length == 3){
			final int compareFloat = Float.compare(coordinates[0],  coordinates[1]);
			if(compareFloat != 0 && shape.contains("SQUARE")){			
				System.out.println("\nYou can not make a Square when Cordinate X and Cordinate Y differs.");
				return false;
			}else{
				System.out.println("\nYou have a valid Shape of a Square");
				return true;	
				}			
		}else if(shape.contains("RECTANGLE") && coordinates.length == 4){
			final int compareFloatCorner = Float.compare(coordinates[0],  coordinates[1]);		
			final int compareFloatSides = Float.compare(coordinates[2],  coordinates[3]);
			if(compareFloatCorner != 0){
				System.out.println("\nYou can not make a Rectangle when Corner X and Corner Y differs.");
				return false;
			}else if(compareFloatSides != 0){
				System.out.println("\nYou can not make a Rectangle when Side 1 and Side 2 differs.");
				return false;
			}
			System.out.println("You have a valid Shape of a Rectangle.");
			return true;
		}else if(shape.contains("DONUT") && coordinates.length == 6){
			System.out.println("\nYou have a valid Shape of a Donut");
			return true;
		}
		
		else{
			System.out.println("You have an valid Shape.");
			return false;
		}		
		
	}
	
	
	public static ShapeEnum validateShape(final String shape){
		if(shape.contains("CIRCLE")){
			return ShapeEnum.CIRCLE;
		}else if(shape.contains("SQUARE")){
			return ShapeEnum.SQUARE;
		}else if(shape.contains("RECTANGLE")){
			return ShapeEnum.RECTANGLE;
		}else if(shape.contains("DONUT")){
			return ShapeEnum.DONUT;
		}else{
			return ShapeEnum.INVALID;
		}
	}
	
}
