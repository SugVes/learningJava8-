package generics.estruturadecontrolegenerics.test;

import generics.estruturadecontrolegenerics.LeapGenerics;

public class LeadGenericsTest {
    public static void main(String[] args) {
        LeapGenerics<Integer> leap = new LeapGenerics<>();
        leap.verifyIfYearIsLeap(2004);
    }

}
