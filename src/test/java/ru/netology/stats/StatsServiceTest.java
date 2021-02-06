package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldSum() {
        assertEquals(180, service.sum(sales));
    }

    @Test
    void shouldAverage() {
        assertEquals(15, service.avg(sales));
    }

    @Test
    void shouldReturnMonthWithMax() {
        assertEquals(8, service.monthWithMax(sales));
    }

    @Test
    void shouldReturnMonthWithMin() {
        assertEquals(9, service.monthWithMin(sales));
    }

    @Test
    void shouldReturnMonthWithLessThanAverage() {
        assertEquals(5, service.monthCountLessThanAverage(sales));
    }

    @Test
    void shouldReturnMonthWithMoreThanAverage() {
        assertEquals(5, service.monthCountMoreThanAverage(sales));
    }
}