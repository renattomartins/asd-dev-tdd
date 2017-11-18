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
}
