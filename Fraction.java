package org.example;

public class Fraction {
    private int numarator;
    private int numitor;

    public int getNumarator() {
        return numarator;
    }

    public void setNumarator(int numarator) {
        this.numarator = numarator;
    }

    public Fraction(int numarator, int numitor) {
        this.numarator = numarator;
        this.numitor = numitor;
    }

    public int getNumitor() {
        return numitor;
    }

    public void setNumitor(int numitor) {
        this.numitor = numitor;
    }
}
