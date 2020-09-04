package generics.estruturadecontrolegenerics.test;

import generics.estruturadecontrolegenerics.AverageGenerics;

public class AverageGenericsTest {
    public static void main(String[] args) {

        AverageGenerics<Double, Double> avg = new AverageGenerics<>();
        avg.calculateAverage(7.0, 5.0);
    }
}
