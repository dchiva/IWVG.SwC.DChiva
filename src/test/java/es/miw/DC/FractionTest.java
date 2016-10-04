package es.miw.DC;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {

	private Fraction fraction;

    @Before
    public void before() {
        this.fraction= new Fraction(5,10);
    }

    @Test
    public void testDecimal() {
    	assertEquals(0.5, this.fraction.decimal(), 10e-5);
    }

    @Test
    public void testGetNumerator() {
    	assertEquals(5, this.fraction.getNumerator());
    }

    @Test
    public void testGetDenominator() {
    	assertEquals(10, this.fraction.getDenominator());
    }
    
    @Test
    public void testSumInt() {
    	this.fraction.sumInt(2);
    	assertEquals(2.5, this.fraction.decimal(), 10e-5);
    }
    
    @Test
    public void testRestarInt() {
    	this.fraction.restarInt(2);
    	assertEquals(-1.5, this.fraction.decimal(), 10e-5);
    }
    
    @Test
    public void testSumFraction() {
    	this.fraction.sumFraction(new Fraction(2,3));
    	assertEquals(1.1666, this.fraction.decimal(), 10e-5);
    }

}
