package com.tdd;
import org.junit.Assert;
import org.junit.Test;

public class CabTddTest {
    @Test
    public void givenDistanceAndTime_ShouldReturnTotalFare() {
        CabTdd invoiceService = new CabTdd();
        double distance = 2.0;
        int time = 5;
        double totalFare = invoiceService.CalculateFare(distance, time);
        Assert.assertEquals(25, totalFare, 0);
    }

    @Test
    public void givenLessDistanceAndTime_ShouldReturnMinFare() {
        CabTdd CabTdd = new CabTdd();
        double distance = 0.1;
        int time = 1;
        double totalFare = CabTdd.CalculateFare(distance, time);
        Assert.assertEquals(5.0, totalFare, 0);
    }

    @Test
    public void givenMultipleRides_ShouldReturnTotalOfTotalFare() {
        Ride[] rides = {new Ride(2.0, 5),
                new Ride(5.0, 10),
                new Ride(0.1, 1),
                new Ride(20, 60)
        };
        CabTdd invoiceService = new CabTdd();
        double totalFare = invoiceService.calculateFare(rides);
        Assert.assertEquals(260, totalFare, 0);
    }
}

