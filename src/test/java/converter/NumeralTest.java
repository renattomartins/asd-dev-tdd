package test.java.converter;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.converter.Numeral;

public class NumeralTest {
	
	@Test(expected = RuntimeException.class)
	public void shouldThrowAnExceptionWhen0() {
		Numeral.toRomanLiteral(0);
	}
	
	@Test(expected = RuntimeException.class)
	public void shouldThrowAnExceptionWhen4000() {
		Numeral.toRomanLiteral(4000);
	}

	@Test
	public void shouldReturnIWhen1() {
		assertEquals("I", Numeral.toRomanLiteral(1));
	}

	@Test
	public void shouldReturnVWhen5() {
		assertEquals("V", Numeral.toRomanLiteral(5));
	}

	@Test
	public void shouldReturnXWhen10() {
		assertEquals("X", Numeral.toRomanLiteral(10));
	}
	
	@Test
	public void shouldReturnXVWhen15() {
		assertEquals("XV", Numeral.toRomanLiteral(15));
	}
	
	
	@Test
	public void shouldReturnXXWhen20() {
		assertEquals("XX", Numeral.toRomanLiteral(20));
	}
	
	@Test
	public void shouldReturnXWhen40() {
		assertEquals("XL", Numeral.toRomanLiteral(40));
	}
	
	@Test
	public void shouldReturnXLVWhen45() {
		assertEquals("XLV", Numeral.toRomanLiteral(45));
	}
	
	@Test
	public void shouldReturnLWhen50() {
		assertEquals("L", Numeral.toRomanLiteral(50));
	}
	
	@Test
	public void shouldReturnXWhen80() {
		assertEquals("LXXX", Numeral.toRomanLiteral(80));
	}
	
	@Test
	public void shouldReturnXWhen90() {
		assertEquals("XC", Numeral.toRomanLiteral(90));
	}

	@Test
	public void shouldReturnCWhen100() {
		assertEquals("C", Numeral.toRomanLiteral(100));
	}
	
	@Test
	public void shouldReturnCXXWhen120() {
		assertEquals("CXX", Numeral.toRomanLiteral(120));
	}
	
	@Test
	public void shouldReturnCCWhen200() {
		assertEquals("CC", Numeral.toRomanLiteral(200));
	}
	
	@Test
	public void shouldReturnCCLWhen250() {
		assertEquals("CCL", Numeral.toRomanLiteral(250));
	}
	
	@Test
	public void shouldReturnCCCWhen300() {
		assertEquals("CCC", Numeral.toRomanLiteral(300));
	}
	
	@Test
	public void shouldReturnCDWhen400() {
		assertEquals("CD", Numeral.toRomanLiteral(400));
	}
	
	@Test
	public void shouldReturnCDXCWhen490() {
		assertEquals("CDXC", Numeral.toRomanLiteral(490));
	}


	@Test
	public void shouldReturnDWhen500() {
		assertEquals("D", Numeral.toRomanLiteral(500));
	}
	
	@Test
	public void shouldReturnDCWhen600() {
		assertEquals("DC", Numeral.toRomanLiteral(600));
	}

	@Test
	public void shouldReturnDCCWhen700() {
		assertEquals("DCC", Numeral.toRomanLiteral(700));
	}
	
	@Test
	public void shouldReturnDCCCWhen800() {
		assertEquals("DCCC", Numeral.toRomanLiteral(800));
	}
	
	@Test
	public void shouldReturnCMWhen900() {
		assertEquals("CM", Numeral.toRomanLiteral(900));
	}
	
	@Test
	public void shouldReturnCMXCWhen990() {
		assertEquals("CMXC", Numeral.toRomanLiteral(990));
	}

	@Test
	public void shouldReturnMWhen1000() {
		assertEquals("M", Numeral.toRomanLiteral(1000));
	}
	
	@Test
	public void shouldReturnMCWhen1100() {
		assertEquals("MC", Numeral.toRomanLiteral(1100));
	}
	
	@Test
	public void shouldReturnMCCWhen1200() {
		assertEquals("MCC", Numeral.toRomanLiteral(1200));
	}
	
	@Test
	public void shouldReturnMCCCWhen1300() {
		assertEquals("MCCC", Numeral.toRomanLiteral(1300));
	}
	
	@Test
	public void shouldReturnMCDWhen1400() {
		assertEquals("MCD", Numeral.toRomanLiteral(1400));
	}

	@Test
	public void shouldReturnMDWhen1500() {
		assertEquals("MD", Numeral.toRomanLiteral(1500));
	}
	
	@Test
	public void shouldReturnMDCWhen1600() {
		assertEquals("MDC", Numeral.toRomanLiteral(1600));
	}
	
	@Test
	public void shouldReturnCXXWhen1620() {
		assertEquals("MDCXX", Numeral.toRomanLiteral(1620));
	}
	
	@Test
	public void shouldReturnMDCCWhen1700() {
		assertEquals("MDCC", Numeral.toRomanLiteral(1700));
	}
	
	@Test
	public void shouldReturnMDCCCWhen1800() {
		assertEquals("MDCCC", Numeral.toRomanLiteral(1800));
	}
	
	@Test
	public void shouldReturnMCMWhen1900() {
		assertEquals("MCM", Numeral.toRomanLiteral(1900));
	}
	
	@Test
	public void shouldReturnMCMLWhen1950() {
		assertEquals("MCML", Numeral.toRomanLiteral(1950));
	}

	@Test
	public void shouldReturnMMWhen2000() {
		assertEquals("MM", Numeral.toRomanLiteral(2000));
	}

	@Test
	public void shouldReturnMMMWhen3000() {
		assertEquals("MMM", Numeral.toRomanLiteral(3000));
	}
	
	@Test
	public void shouldReturnMMMDWhen3500() {
		assertEquals("MMMD", Numeral.toRomanLiteral(3500));
	}
	
	@Test
	public void shouldReturnMMMDCWhen3600() {
		assertEquals("MMMDC", Numeral.toRomanLiteral(3600));
	}
}
