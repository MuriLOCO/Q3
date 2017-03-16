package com.jose.q3;

import com.jose.q3.enumerators.ShapeEnum;
import com.jose.q3.utilities.Validator;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
    	assertEquals(ShapeEnum.CIRCLE, Validator.validateShape("CIRCLE"));
    	assertEquals(ShapeEnum.SQUARE, Validator.validateShape("SQUARE"));
    	assertEquals(ShapeEnum.RECTANGLE, Validator.validateShape("RECTANGLE"));
    	assertEquals(ShapeEnum.DONUT, Validator.validateShape("DONUT"));
    	
    	final Float[] coordinatesCircle = {4.0F, 5.6F, 4.0F};
    	final Float[] coordinatesSquare = {4.0F, 4.0F, 5.0F};
    	final Float[] coordinatesSquareInvalid = {4.0F, 5.0F, 5.0F};
    	final Float[] coordinatesRectangle = {4.0F, 4.0F, 5.0F, 5.0F};
    	final Float[] coordinatesRectangleInvalid = {4.1F, 4.0F, 5.0F, 5.0F};
    	final Float[] coordinatesRectangleInvalid2 = {4.0F, 4.0F, 5.0F, 5.1F};
    	final Float[] coordinatesDonut = {4.0F, 5.6F, 4.0F, 4.0F, 5.6F, 4.0F};
    	assertEquals(true, Validator.validateCoordinates("CIRCLE", coordinatesCircle));
    	assertEquals(true, Validator.validateCoordinates("SQUARE", coordinatesSquare));
    	assertEquals(false, Validator.validateCoordinates("SQUARE", coordinatesSquareInvalid));
    	assertEquals(true, Validator.validateCoordinates("RECTANGLE", coordinatesRectangle));
    	assertEquals(false, Validator.validateCoordinates("RECTANGLE", coordinatesRectangleInvalid));
    	assertEquals(false, Validator.validateCoordinates("RECTANGLE", coordinatesRectangleInvalid2));
    	assertEquals(true, Validator.validateCoordinates("DONUT", coordinatesDonut));
        assertTrue( true );
    }
}
