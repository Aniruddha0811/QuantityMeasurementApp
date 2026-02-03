package com.apps.quantitymeasurement;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class QuantityMeasurementAppTest {
	
	//shortcut to access inner class
	QuantityMeasurementApp.Feet Feet(Double value)
	{
		return new QuantityMeasurementApp.Feet(value);
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

}
