package main.java.converter;

public class DecimalNumeral {

	private int decimalNumeral;

	public DecimalNumeral(int decimalNumeral) {
		this.decimalNumeral = decimalNumeral;
	}

	public String toRomanNumeral() {
		String romanNumeral = "";


		int numberOfThousands = this.decimalNumeral / 1000;
		int restOfThousands = this.decimalNumeral % 1000;

		for (int i = 0; i < numberOfThousands; i++) {
			romanNumeral += "M";
		}

		int hasHalfThousand = restOfThousands / 500;
		int restOfHalfThousand = restOfThousands % 500;

		if (hasHalfThousand == 1) {
			romanNumeral += "D";
		}
		
		int numberOfHundreds = restOfHalfThousand / 100;
		int restOfHundreds = restOfHalfThousand % 100;

		for (int i = 0; i < numberOfHundreds; i++) {
			romanNumeral += "C";
		}
		
		romanNumeral = romanNumeral.replaceAll("DCCCC", "CM");
		romanNumeral = romanNumeral.replaceAll("CCCC", "CD");
		
		int hasFifty = restOfHundreds / 50;
		int restOfFifty = restOfHundreds % 50;

		if (hasFifty == 1) {
			romanNumeral += "L";
		}
		
		int numberOfDozens = restOfFifty / 10;
		int restOfDozens = restOfFifty % 10;

		for (int i = 0; i < numberOfDozens; i++) {
			romanNumeral += "X";
		}
		
		int hasFive = restOfDozens / 5;
		int restOfFive = restOfThousands % 5;

		if (hasFive == 1) {
			romanNumeral += "V";
		}
		
		int hasUnit = restOfFive;

		switch (hasUnit) {
		case 1:
			romanNumeral += "I";
			break;
		case 2:
			romanNumeral += "II";
			break;
		case 3:
			romanNumeral += "III";
			break;
		case 4:
			romanNumeral += "IV";
			break;
		}

		romanNumeral = romanNumeral.replaceAll("XXXXVIV", "XLIX");
		romanNumeral = romanNumeral.replaceAll("VIV", "IX");


		return romanNumeral;
	}
}