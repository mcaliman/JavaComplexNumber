package com.trueprogramming.math.complex;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Massimo Caliman
 */
public class ComplexTest {

    Complex z1 = new Complex ( 5.0 , 6.0 );
    Complex z2 = new Complex (  - 3.0 , 4.0 );

    public ComplexTest () {
    }

    /**
     * Test of re method, of class Complex.
     */
    @Test
    public void testRe () {
        System.out.println ( "re" );
        double expResult = 5.0;
        double result = z1.re ();
        assertEquals ( expResult , result , 0.0 );
        System.out.println ( "Re(a)        = " + z1.re () );
    }

    /**
     * Test of im method, of class Complex.
     */
    @Test
    public void testIm () {
        System.out.println ( "im" );
        double expResult = 6.0;
        double result = z1.im ();
        assertEquals ( expResult , result , 0.0 );
        System.out.println ( "z1            = " + z1 );
        System.out.println ( "Im(z1)        = " + z1.im () );
    }

    /**
     * Test of conjugate method, of class Complex.
     */
    @Test
    public void testConjugate () {
        System.out.println ( "conjugate" );
        Complex expResult = new Complex ( 5 , -6 );
        Complex result = z1.conjugate ();
        assertEquals ( expResult , result );
        System.out.println ( "z1            = " + z1 );
        System.out.println ( "conj(z1)      = " + z1.conjugate () );
    }

    /**
     * Test of add method, of class Complex.
     *
     */
    @Test
    public void testAdd () {
        System.out.println ( "plus" );
        Complex expResult = new Complex ( 2 , 10 );
        Complex result = z1.add ( z2 );
        assertEquals ( expResult , result );
        System.out.println ( "z1            = " + z1 );
        System.out.println ( "z2            = " + z2 );
        System.out.println ( "z1 + z2       = " + result.toString () );
    }

    /**
     * Test of subtract method, of class Complex.
     */
    @Test
    public void testSubtract () {
        System.out.println ( "minus" );
        Complex expResult = new Complex ( 8 , 2 );
        Complex result = z1.subtract ( z2 );
        assertEquals ( expResult , result );
        System.out.println ( "z1            = " + z1 );
        System.out.println ( "z2            = " + z2 );
        System.out.println ( "z1 - z2       = " + result.toString () );
    }

    /**
     * Test of multiply method, of class Complex.
     */
    @Test
    public void testMultiply () {
        System.out.println ( "times" );
        Complex expResult = new Complex ( -39 , 2 );
        Complex result = z1.multiply ( z2 );
        assertEquals ( expResult , result );
        System.out.println ( "z1            = " + z1 );
        System.out.println ( "z2            = " + z2 );
        System.out.println ( "z1 * z2       = " + result.toString () );
    }

    /**
     * Test of divide method, of class Complex.
     */
    @Test
    public void testDivide () {
        System.out.println ( "divides" );
        Complex expResult = new Complex ( 0.36 ,  - 1.52 );
        Complex result = z1.divide ( z2 );
        assertEquals ( expResult , result );
        System.out.println ( "z1            = " + z1 );
        System.out.println ( "z2            = " + z2 );
        System.out.println ( "z1 / z2       = " + result.toString () );
    }

    /**
     * Test of abs method, of class Complex.
     */
    @Test
    public void testAbs () {
        System.out.println ( "abs" );
        double expResult = 7.810249675906654;
        double result = z1.abs ();
        assertEquals ( expResult , result , 0.0 );
        System.out.println ( "z1            = " + z1 );
        System.out.println ( "|z1|          = " + z1.abs () );
    }

    /**
     * Test of phase method, of class Complex.
     */
    @Test
    public void testPhase () {
        System.out.println ( "phase" );
        double expResult = 0.8760580505981934;
        double result = z1.phase ();
        assertEquals ( expResult , result , 0.0 );
        System.out.println ( "z1            = " + z1 );
        System.out.println ( "phase(z1)          = " + z1.phase () );
    }

    /**
     * Test of reciprocal method, of class Complex.
     */
    @Test
    public void testReciprocal () {
        System.out.println ( "reciprocal" );
        Complex expResult = new Complex ( 0.08196721311475409 ,  - 0.09836065573770492 );
        Complex result = z1.reciprocal ();
        assertEquals ( expResult , result );
        System.out.println ( "z1            = " + z1 );
        System.out.println ( "reciprocal(z1)          = " + result.toString () );
    }

    /**
     * Test of scale method, of class Complex.
     */
    @Test
    public void testScale () {
        System.out.println ( "scale" );
        double alpha = 2.0;
        Complex expResult = new Complex ( 10.0 , 12.0 );
        Complex result = z1.scale ( alpha );
        assertEquals ( expResult , result );
        System.out.println ( "z1                      = " + z1 );
        System.out.println ( "alpha                   = " + alpha );
        System.out.println ( "z1 * alpha         = " + result.toString () );
    }

    /**
     * Test of toString method, of class Complex.
     */
    @Test
    public void testToString () {
        System.out.println ( "toString" );
        String expResult = "5.0 + j6.0";
        String result = z1.toString ();
        assertEquals ( expResult , result );
        System.out.println ( "z1 = " + result );
    }

    /**
     * Test of equals method, of class Complex.
     */
    @Test
    public void testEquals () {
        System.out.println ( "equals" );
        assertEquals ( false , z1.equals ( z2 ) );
        assertEquals ( true , z1.equals ( z1 ) );
    }

}
