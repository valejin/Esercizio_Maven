package com.valentina.is2;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalcolatriceTest {

    @Test
    public void testSomma() {
        Calcolatrice c = new Calcolatrice();
        assertEquals(5, c.somma(2, 3));
    }

    @Test
    public void testSottrai() {
        Calcolatrice c = new Calcolatrice();
        assertEquals(1, c.sottrai(3, 2));
    }

    @Test
    public void testMoltiplica() {
        Calcolatrice c = new Calcolatrice();
        assertEquals(6, c.moltiplica(2, 3));
    }

    @Test
    public void testDividi() {
        Calcolatrice c = new Calcolatrice();
        assertEquals(2.0, c.dividi(6, 3), 0.001);
    }
}