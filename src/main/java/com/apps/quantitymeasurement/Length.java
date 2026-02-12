package com.apps.quantitymeasurement;

import com.apps.quantitymeasurement.service.Quantity;

public class Length implements Quantity{

	private double value;
	private LengthUnit unit;

	public enum LengthUnit{
		FEET(12.0), 
		INCHES(1.0),
		YARD(36.0), 
		CENTIMETERS(0.393701);

		private final double conversionFactor;

		LengthUnit(Double conversionFactor) {
			this.conversionFactor = conversionFactor;
		}

		public double getConversionfactor() {
			return conversionFactor;
		}

		public double toBase(Double value) {
			return value * conversionFactor;
		}
	}

	public Length(Double value, LengthUnit unit) {
		validateValue(value);
		this.value = value;
		this.unit = unit;

	}
	
	private void validateValue(Double value)
	{
		if(value.isNaN() || value.isInfinite())
		{
			throw new IllegalArgumentException("Invalid numeric value");
		}
	}
	public double convertToBaseUnit()
	{
		return unit.toBase(value);
	}
	public Double getValue() {
		return value;
	}

	public LengthUnit getUnit() {
		return unit;
	}

	public void display() {
		System.out.println("Value:" + value + "Unit:" + unit);
	}
	
	public boolean compare(Length other)
	{
		return Double.compare(this.toBaseUnit(), other.toBaseUnit())==0;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}

		Length other = (Length) obj;
		return compare(other);
	}
	
	@Override
	public double toBaseUnit() {
		return unit.toBase(getValue());
	}
	
	@Override
	public int hashCode()
	{
		return Double.hashCode(toBaseUnit());
	}
	public static void main(String[] args) {
		Length length1= new Length(1.0, LengthUnit.FEET);
		Length length2 = new Length(12.0, LengthUnit.INCHES);
		System.out.println("Are lengths equal?" + length1.equals(length2));
		
		Length length3= new Length(1.0, LengthUnit.YARD);
		Length length4 = new Length(36.0, LengthUnit.INCHES);
		System.out.println("Are lengths equal?" + length3.equals(length4));
		
		Length length5= new Length(100.0, LengthUnit.CENTIMETERS);
		Length length6 = new Length(39.3701, LengthUnit.INCHES);
		System.out.println("Are lengths equal?" + length5.equals(length6));
	}
}
