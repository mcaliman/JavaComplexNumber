package com.trueprogramming.math.complex;


import java.util.Objects;
import static com.trueprogramming.math.complex.ComplexForm.POLAR;
import static com.trueprogramming.math.complex.ComplexForm.RECT;
import static java.lang.Math.*;

/**
 * An implementation of a complex number class.
 *
 * @author Massimo Caliman
 */
public class Complex {

    /**
     * the real part
     */
    private final double real;

    /**
     * the imaginary part
     */
    private final double imaginary;

    private final String joperator = "j";

    /**
     * Create a new object with the given real and imaginary parts
     *
     * @param real
     * @param imaginary
     */
    public Complex ( double real , double imaginary ) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex () {
        this ( 0 , 0 );
    }

    /**
     *
     * @param form
     * @param q
     * @param p
     * @return
     */
    public static Complex of ( ComplexForm form , double q , double p ) {
        if ( form == POLAR ) {
            return new Complex ( q * cos ( p ) , q * sin ( p ) );
        } else {
            return new Complex ( q , p );
        }
    }

    /**
     * @return a string representation of the invoking Complex object
     */
    @Override
    public String toString () {
        if ( imaginary == 0 ) {
            return real + "";
        }
        if ( real == 0 ) {
            return joperator + imaginary;
        }
        if ( imaginary < 0 ) {
            return real + " - " + joperator + (  - imaginary );
        }
        return real + " + " + joperator + imaginary;
    }

    /**
     * @return abs/modulus/magnitude
     */
    public double abs () {
        return hypot ( real , imaginary );
    }

    /**
     * @return angle/phase/argument, normalized to be between -pi and pi
     */
    public double phase () {
        return atan2 ( imaginary , real );
    }

    /**
     * @param that
     * @return a new Complex object whose value is (this + that)
     */
    public Complex add ( Complex that ) {
        return new Complex ( this.real + that.real , this.imaginary + that.imaginary );
    }

    /**
     * @param that
     * @return a new Complex object whose value is (this - that)
     */
    public Complex subtract ( Complex that ) {
        return new Complex ( this.real - that.real , this.imaginary - that.imaginary );
    }

    /**
     *
     * @param z2
     * @return a new Complex object whose value is (this * z2)
     */
    public Complex multiply ( Complex z2 ) {
        Complex z1 = this;
        return new Complex ( z1.real * z2.real - z1.imaginary * z2.imaginary , z1.real * z2.imaginary + z1.imaginary * z2.real );
    }

    /**
     *
     * @param alpha
     * @return a new object whose value is (this * alpha)
     */
    public Complex scale ( double alpha ) {
        return new Complex ( alpha * this.real , alpha * this.imaginary );
    }

    /**
     * @return a new Complex object whose value is the conjugate of this
     */
    public Complex conjugate () {
        return new Complex ( this.real ,  - this.imaginary );
    }

    /**
     *
     * @return a new Complex object whose value is the reciprocal of this
     */
    public Complex reciprocal () {
        double scale = real * real + imaginary * imaginary;
        return new Complex ( real / scale ,  - imaginary / scale );
    }

    /**
     *
     * @return the real part
     */
    public double re () {
        return this.real;
    }

    /**
     *
     * @return the imaginary part
     */
    public double im () {
        return this.imaginary;
    }

    /**
     *
     * @param z2
     * @return a / b
     */
    public Complex divide ( Complex z2 ) {
        Complex z1 = this;
        return z1.multiply ( z2.reciprocal () );
    }

    /**
     *
     * @param x
     * @return
     */
    @Override
    public boolean equals ( Object x ) {
        if ( x == null ) {
            return false;
        }
        if ( this.getClass () != x.getClass () ) {
            return false;
        }
        Complex that = ( Complex ) x;
        return ( this.real == that.real ) && ( this.imaginary == that.imaginary );
    }

    /**
     *
     * @return hashcode
     */
    @Override
    public int hashCode () {
        return Objects.hash ( real , imaginary );
    }

}
