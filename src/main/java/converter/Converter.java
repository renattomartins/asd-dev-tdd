package main.java.converter;

public class Converter {

	private int decimalNumeral;

	public Converter(int decimalNumeral) {
		this.decimalNumeral = decimalNumeral;
	}

	public String toRomanNumeral() {
		
String romanNumeral;
		
		switch (this.decimalNumeral) {
		
		case 1:
			romanNumeral = "I";
			break;
		case 5:
			romanNumeral = "V";
			break;
		
		case 10:
			romanNumeral = "X";
			break;
			
		case 50:
			romanNumeral = "L";
			break;
		
		case 100:
			romanNumeral = "C";
			break;	
		
		case 500:
			romanNumeral = "D";
			break;
			
		case 1000:
			romanNumeral = "M";
			break;	
			
		default:
			romanNumeral = "";
		}

		return romanNumeral;
	}
}
