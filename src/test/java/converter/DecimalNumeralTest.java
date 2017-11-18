package test.java.converter;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.converter.DecimalNumeral;

public class DecimalNumeralTest {

	@Test
	public void shouldReturnIWhenOne(){
		DecimalNumeral decimalNumeral = new DecimalNumeral(1);
		String romanNumeral = decimalNumeral.toRomanNumeral();
		
		assertEquals("I", romanNumeral);
	}
	
	@Test
	public void shouldReturnVWhenFive(){
		DecimalNumeral decimalNumeral = new DecimalNumeral(5);
		String romanNumeral = decimalNumeral.toRomanNumeral();
		
		assertEquals("V", romanNumeral);
	}
	
	@Test
	public void shouldReturnXWhenTen(){
		DecimalNumeral decimalNumeral = new DecimalNumeral(10);
		String romanNumeral = decimalNumeral.toRomanNumeral();
		
		assertEquals("X", romanNumeral);
	}
	
	@Test
	public void shouldReturnLWhenFifty(){
		DecimalNumeral decimalNumeral = new DecimalNumeral(50);
		String romanNumeral = decimalNumeral.toRomanNumeral();
		
		assertEquals("L", romanNumeral);
	}
	
	@Test
	public void shouldReturnCWhenHundred(){
		DecimalNumeral decimalNumeral = new DecimalNumeral(100);
		String romanNumeral = decimalNumeral.toRomanNumeral();
		
		assertEquals("C", romanNumeral);
	}
	
	@Test
	public void shouldReturnDWhenFiveHundred(){
		DecimalNumeral decimalNumeral = new DecimalNumeral(500);
		String romanNumeral = decimalNumeral.toRomanNumeral();
		
		assertEquals("D", romanNumeral);
	}
	
	@Test
	public void shouldReturnMWhenThousand(){
		DecimalNumeral decimalNumeral = new DecimalNumeral(1000);
		String romanNumeral = decimalNumeral.toRomanNumeral();
		
		assertEquals("M", romanNumeral);
	}
}
