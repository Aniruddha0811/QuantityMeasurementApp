package com.apps.quantitymeasurement;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertSame;
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
	public void testFeetEquality_SameValue() {
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
	
	@Test
	public void testEqualityYardToYard_SameValue()
	{
		Length length1=new Length(1.0,LengthUnit.YARD);
		Length length2=new Length(1.0,LengthUnit.YARD);
		assertEquals(length1, length2);
	}
	
	@Test
	public void testEqualityYardToYard_DifferentValue()
	{
		Length length1=new Length(1.0,LengthUnit.YARD);
		Length length2=new Length(2.0,LengthUnit.YARD);
		assertNotEquals(length1, length2);
	}
	
	@Test
	public void testEqualityYardToFeet_EquivalentValue()
	{
		Length length1=new Length(2.0,LengthUnit.YARD);
		Length length2=new Length(6.0,LengthUnit.FEET);
		assertEquals(length1, length2);
	}
	
	@Test
	public void testEqualityYardToInches_EquivalentValue()
	{
		Length length1=new Length(1.0,LengthUnit.YARD);
		Length length2=new Length(36.0,LengthUnit.INCHES);
		assertEquals(length1, length2);
	}
	
	@Test
	public void testEqualityInchesToYard_EquivalentValue()
	{
		Length length1=new Length(36.0,LengthUnit.INCHES);
		Length length2=new Length(1.0,LengthUnit.YARD);
		assertEquals(length1, length2);
	}
	
	@Test
	public void testEqualityYardToFeet_NonEquivalentValue()
	{
		Length length1=new Length(1.0,LengthUnit.YARD);
		Length length2=new Length(2.0,LengthUnit.FEET);
		assertNotEquals(length1, length2);
	}
	
	@Test
	public void testEquality_centimetersToInches_EquivalentValue()
	{
		Length length1 = new Length(1.0, LengthUnit.CENTIMETERS);
		Length length2 = new Length(0.393701, LengthUnit.INCHES);
		assertEquals(length1, length2);
	}
	
	@Test
	public void testCMToCMEquality()
	{
		Length length1 = new Length(30.48, LengthUnit.CENTIMETERS);
		Length length2 = new Length(30.48, LengthUnit.CENTIMETERS);
		assertEquals(length1, length2);
	}
	
	@Test
	public void testEquality_centimetersToFeet_NonEquivalentValue()
	{
		Length length1 = new Length(1.0, LengthUnit.CENTIMETERS);
		Length length2 = new Length(1.0, LengthUnit.FEET);
		assertNotEquals(length1, length2);
	}
	
	@Test
	public void testEquality_MultiUnit_TransitiveProperty()
	{
		Length length1 = new Length(1.0, LengthUnit.YARD);
		Length length2 = new Length(3.0, LengthUnit.FEET);
		Length length3 = new Length(36.0, LengthUnit.INCHES);
		
		assertEquals(length1, length2);
		assertEquals(length2, length3);
		assertEquals(length1, length3);
		
	}
	
	@Test
	public void testEqualityYardWithNullUnit()
	{
		Length length1 = new Length(1.0, LengthUnit.YARD);
		Length length2 = new Length(3.0, null);
		assertNotEquals(length1,length2);
	}
	
	@Test
	public void testEquality_YardSameReference()
	{
		Length yardObj=new Length(1.0, LengthUnit.YARD);
		Length sameReference=yardObj;
		
		assertSame(yardObj, sameReference);
	}
	
	@Test
	public void testEquality_YardNullComparison()
	{
		Length length1=new Length(1.0, LengthUnit.YARD);
		assertFalse(length1.equals(null));
		
	}
	
	@Test 
	public void testEquality_CentimetersWithNullValue()
	{
		
	}
	
	@Test 
	public void testEquality_CentimetersSameReference()
	{
		Length centiObj = new Length(1.0, LengthUnit.CENTIMETERS);
		Length centRef=centiObj;
		
		assertSame(centiObj, centRef);
	}
	
	@Test 
	public void testEquality_CentimetersNullComparsion()
	{
		Length Length1= new Length(1.0, LengthUnit.CENTIMETERS);
		assertFalse(Length1.equals(null));
		
	}
	
	@Test
	public void testConversion_FeetToInches()
	{
		double expectedInches=12.0;
		double feetToInches=Length.convert(1.0,LengthUnit.FEET,LengthUnit.INCHES);
		assertTrue(expectedInches==feetToInches);
	}
	@Test
	public void testConversion_InchesToFeet()
	{
		double expectedFeet=2.0;
		double inchesToFeet=Length.convert(24.0, LengthUnit.INCHES, LengthUnit.FEET);
		assertTrue(expectedFeet==inchesToFeet);
	}
	
	@Test
	public void testConversion_YardsToInches()
	{
		double expectedInch=36.0;
		double yardToInches=Length.convert(1.0, LengthUnit.YARD, LengthUnit.INCHES);
		assertTrue(expectedInch==yardToInches);
		
	}
	@Test
	public void testConversion_InchesToYards()
	{
		double expectedYard=2.0;
		double inchesToYard=Length.convert(72.0, LengthUnit.INCHES, LengthUnit.YARD);
		assertTrue(expectedYard==inchesToYard);
	}
	@Test
	public void testConversion_CentimetersToInches()
	{
		double expectedYard=1.0;
		double cmToInches=Length.convert(2.54, LengthUnit.CENTIMETERS, LengthUnit.YARD);
		assertTrue(expectedYard==cmToInches);
	}
	@Test
	public void testConversion_FeetToYard()
	{
		double expectedYard=2.0;
		double feetToYard=Length.convert(6.0, LengthUnit.FEET, LengthUnit.YARD);
		assertTrue(expectedYard==feetToYard);
	}
	@Test
	public void testConversion_RoundTrip_PreservesValue()
	{
		
	}
	@Test
	public void testConversion_ZeroValue()
	{
		
	}
	@Test
	public void testConversion_NegativeValue()
	{
		
	}
	@Test
	public void testConversion_InvalidUnit_Throws()
	{
		
	}
	@Test
	public void testConversion_NaNOrInfinite_Throws()
	{
		
	}
	@Test
	public void testConversion_PrecisionTolerance()
	{
		
	}
}
