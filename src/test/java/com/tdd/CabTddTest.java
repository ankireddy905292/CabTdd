package com.tdd;
import org.junit.Assert;
import org.junit.Test;

public class CabTddTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        CabTdd CabTdd = new CabTdd();
        double distance = 2.0;
        int time = 5;
        double totalFare = CabTdd.calculateFare(distance, time);
        Assert.assertEquals(25, totalFare, 0);
    }

    @Test
    public void givenLessDistanceAndTime_ShouldReturnMinFare() {
        CabTdd CabTdd = new CabTdd();
        double distance = 0.1;
        int time = 1;
        double totalFare = CabTdd.calculateFare(distance, time);
        Assert.assertEquals(5.0, totalFare, 0);
    }

    @Test
    public void givenMultipleRides_ShouldReturnTotalOfTotalFare() {
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(5.0, 10),
                new Ride(0.1, 1),
                new Ride(20, 60)
        };
        CabTdd CabTdd = new CabTdd();
        double totalFare = CabTdd.calculateTotalFare(rides);
        Assert.assertEquals(260, totalFare, 0);
    }

    @Test
    public void givenMultipleRides_ShouldReturnInvoiceSummary() {
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(0.1, 1),
        };
        CabTdd CabTdd = new CabTdd();
        EnhancedSummary EnhancedSummary = CabTdd.calculateFare(rides);
        EnhancedSummary expectedInvoices = new EnhancedSummary(2, 30.0);
        Assert.assertEquals(expectedInvoices.getInvoiceSummary(), EnhancedSummary.getInvoiceSummary());
    }

}
