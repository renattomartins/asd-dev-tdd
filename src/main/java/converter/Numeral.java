package main.java.converter;

public class Numeral {

	private Numeral() {}

	public static String toRomanLiteral(int arabicNumeral) {		
		if ( arabicNumeral < 1 || arabicNumeral > 3999 ){
			throw new RuntimeException("arabicNumber must be between 1-3999");
		}
		
		String romanLiteral = "";

		int numberOfThousands = arabicNumeral / 1000;
		int restOfThousands = arabicNumeral % 1000;

		for (int i = 0; i < numberOfThousands; i++) {
			romanLiteral += "M";
		}
		
		int numberOfHalfThousand = restOfThousands / 500;
		int restOfHalfThousands = restOfThousands % 500;

		for (int i = 0; i < numberOfHalfThousand; i++) {
			romanLiteral += "D";
		}

		int numberOfHundreds = restOfHalfThousands / 100;
		int restOfHundreds = restOfHalfThousands % 100;

		for (int i = 0; i < numberOfHundreds; i++) {
			romanLiteral += "C";
		}
			
		int numberOfFifty = restOfHundreds / 50;
		int restOfFifty = restOfHundreds % 50;

		for (int i = 0; i < numberOfFifty; i++) {
			romanLiteral += "L";
		}

		int numberOfDozens = restOfFifty / 10;
		int restOfDozens = restOfFifty % 10;

		for (int i = 0; i < numberOfDozens; i++) {
			romanLiteral += "X";
		}
		
		int numberOfFive = restOfDozens / 5;
		int restOfFive = restOfDozens % 5;

		for (int i = 0; i < numberOfFive; i++) {
			romanLiteral += "V";
		}
		
		int numberOfUnits = restOfFive;

		for (int i = 0; i < numberOfUnits; i++) {
			romanLiteral += "I";
		}

		romanLiteral = romanLiteral.replaceAll("DCCCC", "CM");
		romanLiteral = romanLiteral.replaceAll( "CCCC", "CD");
		romanLiteral = romanLiteral.replaceAll("LXXXX", "XC");
		romanLiteral = romanLiteral.replaceAll( "XXXX", "XL");
		romanLiteral = romanLiteral.replaceAll("VIIII", "IX");
		romanLiteral = romanLiteral.replaceAll( "IIII", "IV");

		return romanLiteral;
	}
}