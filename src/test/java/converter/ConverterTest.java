package test.java.converter;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.converter.Converter;

public class ConverterTest {

	@Test
	public void shouldReturnIWhenOne(){
		Converter decimalNumeral = new Converter(1);
		String romanNumeral = decimalNumeral.toRomanNumeral();
		
		assertEquals("I", romanNumeral);
	}
	
	@Test
	public void shouldReturnVWhenFive(){
		Converter decimalNumeral = new Converter(5);
		String romanNumeral = decimalNumeral.toRomanNumeral();
		
		assertEquals("V", romanNumeral);
	}
	
	@Test
	public void shouldReturnXWhenTen(){
		Converter decimalNumeral = new Converter(10);
		String romanNumeral = decimalNumeral.toRomanNumeral();
		
		assertEquals("X", romanNumeral);
	}
	
	@Test
	public void shouldReturnLWhenFifty(){
		Converter decimalNumeral = new Converter(50);
		String romanNumeral = decimalNumeral.toRomanNumeral();
		
		assertEquals("L", romanNumeral);
	}
	
	@Test
	public void shouldReturnCWhenHundred(){
		Converter decimalNumeral = new Converter(100);
		String romanNumeral = decimalNumeral.toRomanNumeral();
		
		assertEquals("C", romanNumeral);
	}
	
	@Test
	public void shouldReturnDWhenFiveHundred(){
		Converter decimalNumeral = new Converter(500);
		String romanNumeral = decimalNumeral.toRomanNumeral();
		
		assertEquals("D", romanNumeral);
	}
	
	@Test
	public void shouldReturnMWhenThousand(){
		Converter decimalNumeral = new Converter(1000);
		String romanNumeral = decimalNumeral.toRomanNumeral();
		
		assertEquals("M", romanNumeral);
	}
}
