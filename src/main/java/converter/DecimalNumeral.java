package main.java.converter;

public class DecimalNumeral {

	private int decimalNumeral;

	public DecimalNumeral(int decimalNumeral) {
		this.decimalNumeral = decimalNumeral;
	}

	public String toRomanNumeral() {
		String romanNumeral = "";

		int arabic = this.decimalNumeral;

		if (arabic < 4000) {
			while (arabic >= 1000) {
				romanNumeral += "M";
				arabic -= 1000;
			}
			while (arabic >= 900) {
				romanNumeral += "CM";
				arabic -= 900;
			}

			while (arabic >= 500) {
				romanNumeral += "D";
				arabic -= 500;
			}

			while (arabic >= 400) {
				romanNumeral += "CD";
				arabic -= 400;
			}

			while (arabic >= 100) {
				romanNumeral += "C";
				arabic -= 100;
			}

			while (arabic >= 90) {
				romanNumeral += "XC";
				arabic -= 90;
			}

			while (arabic >= 50) {
				romanNumeral += "L";
				arabic -= 50;
			}

			while (arabic >= 40) {
				romanNumeral += "XL";
				arabic -= 40;
			}

			while (arabic >= 10) {
				romanNumeral += "X";
				arabic -= 10;
			}

			while (arabic >= 9) {
				romanNumeral += "IX";
				arabic -= 9;
			}

			while (arabic >= 5) {
				romanNumeral += "V";
				arabic -= 5;
			}

			while (arabic >= 4) {
				romanNumeral += "IV";
				arabic -= 4;
			}

			while (arabic >= 1) {
				romanNumeral += "I";
				arabic -= 1;
			}
		}

		return romanNumeral;
	}
}
