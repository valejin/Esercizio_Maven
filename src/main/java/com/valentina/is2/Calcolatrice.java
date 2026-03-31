package com.valentina.is2;

public class Calcolatrice {

    public int somma(int a, int b) {
        return a + b;
    }

    public int sottrai(int a, int b) {
        return a - b;
    }

    public int moltiplica(int a, int b) {
        return a * b;
    }

    public double dividi(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Divisione per zero!");
        return (double) a / b;
    }
}