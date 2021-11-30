package com.tdd;
import org.junit.Assert;
import org.junit.Test;

public class CabTddTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        CabTdd CabTdd = new CabTdd();
        double distance = 2.0;
        int time = 5;
        double totalFare = CabTdd.CalculateFare(distance, time);
        Assert.assertEquals(25, totalFare,0);
    }

    @Test
    public void givenLessDistanceAndTime_ShouldReturnMinFare() {
        CabTdd invoiceService = new CabTdd();
        double distance = 0.1;
        int time = 1;
        double totalFare = invoiceService.CalculateFare(distance, time);
        Assert.assertEquals(5.0, totalFare,0);
    }
}

