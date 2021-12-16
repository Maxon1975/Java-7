package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void calculateSumSales() {
        StatsService service = new StatsService();
        int[]  managersRevenue = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSumSales( managersRevenue);

        assertEquals(expected, actual);
    }

    @Test
    void shouldAverageFind  () {
        StatsService service = new StatsService();
        int[]  managersRevenue = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.findAverage (managersRevenue);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMaxFindSales() {
        StatsService service = new StatsService();
        int[]  managersRevenue = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        int actual = service.findMaxSales(managersRevenue);

        assertEquals(expected, actual);
    }

    @Test
    void shouldMinFindSales() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findMinSales(managerSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldSearchBelowAverage    () {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findBelowAverage(managerSales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldSearchAboveAverage() {
        StatsService service = new StatsService();
        int[] managerSales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.findAboveAverage(managerSales);

        assertEquals(expected, actual);

    }
}

