package TP2.Ejercicio_4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class ComplexNumberTest {

    ComplexNumber compNum = new ComplexNumber(8.0, 6.0);

    @Test
    void sum() {
        compNum.sum(new ComplexNumber(3.0, 4.0));
        assertEquals(compNum.re(), 11.0);
        assertEquals(compNum.im(), 10.0);
    }

    @Test
    void substract() {
        compNum.substract(new ComplexNumber(3.0, 4.0));
        assertEquals(5.0, compNum.re());
        assertEquals(2.0, compNum.im());
    }

    @Test
    void product() {
        compNum.product(new ComplexNumber(2.0, 2.0));
        assertEquals(4.0, compNum.re());
        assertEquals(28.0, compNum.im());
    }

    @Test
    void quotient() {
    }

    @Test
    void modulus() {
    }

    @Test
    void re() {
        assertEquals(compNum.re(), 1.0);
    }

    @Test
    void im() {
        assertEquals(compNum.im(), 2.0);
    }
}