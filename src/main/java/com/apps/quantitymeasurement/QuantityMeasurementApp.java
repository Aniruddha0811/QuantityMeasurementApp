package com.apps.quantitymeasurement;

import com.apps.quantitymeasurement.Length.LengthUnit;

public class QuantityMeasurementApp {
	
	public static void main(String[] args) {
		demonstrateFeetEquality();
		demonstrtaeInchesEquality();
		demonstrateLengthComparison();
	}

	public static class Feet {
		
		private final double value;

		public Feet(double value) {
			this.value = value;
		}

		public double getValue() {
			return value;
		}

		@Override
		public boolean equals(Object obj) {
			
			if (this == obj) {
				return true;
			}
			if (obj == null || getClass() != obj.getClass()) {
				return false;
			}

			Feet other = (Feet) obj;
			return Double.compare(this.value, other.value) == 0;
		}

		@Override
		public int hashCode() {
			return Double.hashCode(value);
		}
	}
	
	public static class Inches {

		private final double value;

		public Inches(double value) {
			this.value = value;
		}

		public double getValue() {
			return value;
		}

		@Override
		public boolean equals(Object obj) {

			if (this == obj) {
				return true;
			}
			if (obj == null || getClass() != obj.getClass()) {
				return false;
			}

			Inches other = (Inches) obj;
			return Double.compare(this.value, other.value) == 0;
		}

		@Override
		public int hashCode() {
			return Double.hashCode(value);
		}
	}
	
	public static void demonstrateFeetEquality() {
		Feet feetValue1 = new Feet(5.0);
		Feet feetValue2 = new Feet(5.0);
		boolean feetResult = feetValue1.equals(feetValue2);
		//System.out.println("Equal" + "(" + feetResult + ")");
	}
	
	public static void demonstrtaeInchesEquality() {
		Inches inchesValue1 = new Inches(1.0);
		Inches inchesValue2 = new Inches(1.0);
		boolean inchesResult = inchesValue1.equals(inchesValue2);
		//System.out.println("Equal" + "(" + inchesResult + ")");
	}
	
	public static boolean demonstrateLengthEquality(Length length1, Length length2)
	{
		return length1.equals(length2);
	}
	public static void demonstrateLengthComparison()
	{
		Length length1 = new Length(1.0, LengthUnit.FEET);
		Length length2 = new Length(12.0, LengthUnit.INCHES);
		boolean result1=demonstrateLengthEquality(length1,length2);
		System.out.println("Equal" + "(" + result1 + ")");
		
		Length length3 = new Length(1.0, LengthUnit.YARD);
		Length length4 = new Length(36.0, LengthUnit.INCHES);
		boolean result2=demonstrateLengthEquality(length3,length4);
		System.out.println("Equal" + "(" + result2 + ")");
		
		Length length5 = new Length(100.0, LengthUnit.CENTIMETERS);
		Length length6 = new Length(39.3701, LengthUnit.INCHES);
		boolean result3=demonstrateLengthEquality(length5,length6);
		System.out.println("Equal" + "(" + result3 + ")");
		
		Length length7 = new Length(3.0, LengthUnit.FEET);
		Length length8 = new Length(1.0, LengthUnit.YARD);
		boolean result4=demonstrateLengthEquality(length7,length8);
		System.out.println("Equal" + "(" + result4 + ")");
		
		Length length9 = new Length(30.48, LengthUnit.CENTIMETERS);
		Length length10 = new Length(1.0, LengthUnit.FEET);
		boolean result5=demonstrateLengthEquality(length9,length10);
		System.out.println("Equal" + "(" + result5 + ")");
		
		
	}
}
