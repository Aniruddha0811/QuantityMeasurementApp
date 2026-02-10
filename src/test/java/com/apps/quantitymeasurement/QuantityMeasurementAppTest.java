package com.apps.quantitymeasurement;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

import com.apps.quantitymeasurement.Length.LengthUnit;

public class QuantityMeasurementAppTest {
	
	//shortcut to access inner class
	QuantityMeasurementApp.Feet Feet(Double value) {
		return new QuantityMeasurementApp.Feet(value);
	}
	
	QuantityMeasurementApp.Inches Inches(Double value) {
		return new QuantityMeasurementApp.Inches(value);
	}
	@Test
	public void testFreeEquality_SameValue() {
	QuantityMeasurementApp.Feet f1=Feet(5.0);
	assertTrue(f1.equals(f1));
				
	}

	@Test
	public void testFeetEquality_DifferenceValue() {
		QuantityMeasurementApp.Feet f1=Feet(5.0);
		QuantityMeasurementApp.Feet f2=Feet(6.0);
		assertFalse(f1.equals(f2));
	}

	@Test
	public void testFeetEquality_NullComparison() {
		QuantityMeasurementApp.Feet f1=Feet(5.0);
		assertFalse(f1.equals(null));
	}

	@Test
	public void testFeetEquality_DifferenceClass() {
		QuantityMeasurementApp.Feet f1=Feet(5.0);
		String other="5.0";
		assertFalse(f1.equals(other));
	}

	@Test
	public void testFeetEquality_SameReference() {
		QuantityMeasurementApp.Feet f1=Feet(5.0);
		assertTrue(f1.equals(f1));
	}
	
	//test case for inches
	
	@Test
	public void testInchesEquality_SameValue() {
	QuantityMeasurementApp.Inches f1=Inches(5.0);
	assertTrue(f1.equals(f1));
				
	}

	@Test
	public void testnchesEquality_DifferenceValue() {
		QuantityMeasurementApp.Inches f1=Inches(5.0);
		QuantityMeasurementApp.Inches f2=Inches(6.0);
		assertFalse(f1.equals(f2));
	}

	@Test
	public void testInchesEquality_NullComparison() {
		QuantityMeasurementApp.Inches f1=Inches(5.0);
		assertFalse(f1.equals(null));
	}

	@Test
	public void testInchesEquality_DifferenceClass() {
		QuantityMeasurementApp.Inches f1=Inches(5.0);
		String other="5.0";
		assertFalse(f1.equals(other));
	}

	@Test
	public void testInchesEquality_SameReference() {
		QuantityMeasurementApp.Inches f1=Inches(5.0);
		assertTrue(f1.equals(f1));
	}
	
	@Test
	public void testFeetEquality()
	{
		Length length1=new Length(1.0, LengthUnit.FEET);
		Length length2= new Length(12.0, LengthUnit.INCHES);
		assertEquals(length1, length2);
	}
	
	@Test 
	public void tetsInchesEquality()
	{
		Length inches1=new Length(10.0,LengthUnit.INCHES);
		Length inches2=new Length(10.0,LengthUnit.INCHES);
		assertEquals(inches1, inches2);
	}
	
	@Test
	public void testFeetInchesComparison()
	{
		Length lengthFeet=new Length(1.0,LengthUnit.FEET);
		Length lengthInches=new Length(12.0,LengthUnit.INCHES);
		assertEquals(lengthFeet, lengthInches);
	}
	
	@Test
	public void testFeetInEquality()
	{
		Length lengthFeet1= new Length(1.0,LengthUnit.FEET);
		Length lengthFeet2=new Length(10.0, LengthUnit.FEET);
		assertNotEquals(lengthFeet1, lengthFeet2);
	}
	@Test
	public void testInchesInEquality() {
		Length lengthInch1=new Length(12.0, LengthUnit.INCHES);
		Length lengthInch2=new Length(1.0, LengthUnit.INCHES);
		assertNotEquals(lengthInch1, lengthInch2);
	}
	
	@Test
	public void crossUnitInEquality()
	{
		Length lengthFeet=new Length(3.0,LengthUnit.FEET);
		Length lengthInches=new Length(35.0, LengthUnit.INCHES);
		assertNotEquals(lengthFeet, lengthInches);
	}
	
	@Test
	public void testMultipleFeetComparsion()
	{
		Length lengthFeet1=new Length(5.0,LengthUnit.FEET);
		Length lengthFeet2=new Length(5.0,LengthUnit.FEET);
		assertEquals(lengthFeet1, lengthFeet2);
	}
}
