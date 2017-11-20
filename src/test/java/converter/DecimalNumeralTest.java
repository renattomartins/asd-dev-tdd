package test.java.converter;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.converter.DecimalNumeral;

public class DecimalNumeralTest {

	@Test
	public void shouldReturnIWhen1() {
		DecimalNumeral decimalNumeral = new DecimalNumeral(1);
		String romanNumeral = decimalNumeral.toRomanNumeral();

		assertEquals("I", romanNumeral);
	}

	@Test
	public void shouldReturnVWhen5() {
		DecimalNumeral decimalNumeral = new DecimalNumeral(5);
		String romanNumeral = decimalNumeral.toRomanNumeral();

		assertEquals("V", romanNumeral);
	}

	@Test
	public void shouldReturnXWhen10() {
		DecimalNumeral decimalNumeral = new DecimalNumeral(10);
		String romanNumeral = decimalNumeral.toRomanNumeral();

		assertEquals("X", romanNumeral);
	}

	@Test
	public void shouldReturnLWhen50() {
		DecimalNumeral decimalNumeral = new DecimalNumeral(50);
		String romanNumeral = decimalNumeral.toRomanNumeral();

		assertEquals("L", romanNumeral);
	}

	@Test
	public void shouldReturnCWhen100() {
		DecimalNumeral decimalNumeral = new DecimalNumeral(100);
		String romanNumeral = decimalNumeral.toRomanNumeral();

		assertEquals("C", romanNumeral);
	}
	
	@Test
	public void shouldReturnCCWhen200() {
		DecimalNumeral decimalNumeral = new DecimalNumeral(200);
		String romanNumeral = decimalNumeral.toRomanNumeral();

		assertEquals("CC", romanNumeral);
	}
	
	@Test
	public void shouldReturnCCCWhen300() {
		DecimalNumeral decimalNumeral = new DecimalNumeral(300);
		String romanNumeral = decimalNumeral.toRomanNumeral();

		assertEquals("CCC", romanNumeral);
	}

	@Test
	public void shouldReturnDWhen500() {
		DecimalNumeral decimalNumeral = new DecimalNumeral(500);
		String romanNumeral = decimalNumeral.toRomanNumeral();

		assertEquals("D", romanNumeral);
	}
	
	@Test
	public void shouldReturnDCWhen600() {
		DecimalNumeral decimalNumeral = new DecimalNumeral(600);
		String romanNumeral = decimalNumeral.toRomanNumeral();

		assertEquals("DC", romanNumeral);
	}

	@Test
	public void shouldReturnDCCWhen700() {
		DecimalNumeral decimalNumeral = new DecimalNumeral(700);
		String romanNumeral = decimalNumeral.toRomanNumeral();

		assertEquals("DCC", romanNumeral);
	}
	
	@Test
	public void shouldReturnDCCCWhen800() {
		DecimalNumeral decimalNumeral = new DecimalNumeral(800);
		String romanNumeral = decimalNumeral.toRomanNumeral();

		assertEquals("DCCC", romanNumeral);
	}

	@Test
	public void shouldReturnMWhen1000() {
		DecimalNumeral decimalNumeral = new DecimalNumeral(1000);
		String romanNumeral = decimalNumeral.toRomanNumeral();

		assertEquals("M", romanNumeral);
	}

	@Test
	public void shouldReturnMDWhen1500() {
		DecimalNumeral decimalNumeral = new DecimalNumeral(1500);
		String romanNumeral = decimalNumeral.toRomanNumeral();

		assertEquals("MD", romanNumeral);
	}

	@Test
	public void shouldReturnMMWhen2000() {
		DecimalNumeral decimalNumeral = new DecimalNumeral(2000);
		String romanNumeral = decimalNumeral.toRomanNumeral();

		assertEquals("MM", romanNumeral);
	}

	@Test
	public void shouldReturnMMMWhen3000() {
		DecimalNumeral decimalNumeral = new DecimalNumeral(3000);
		String romanNumeral = decimalNumeral.toRomanNumeral();

		assertEquals("MMM", romanNumeral);
	}
	
	@Test
	public void shouldReturnMMMDWhen3500() {
		DecimalNumeral decimalNumeral = new DecimalNumeral(3500);
		String romanNumeral = decimalNumeral.toRomanNumeral();

		assertEquals("MMMD", romanNumeral);
	}
	
	@Test
	public void shouldReturnMMMDCWhen3600() {
		DecimalNumeral decimalNumeral = new DecimalNumeral(3600);
		String romanNumeral = decimalNumeral.toRomanNumeral();

		assertEquals("MMMDC", romanNumeral);
	}
}
