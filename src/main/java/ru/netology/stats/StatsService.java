package ru.netology.stats;

public class StatsService {
    public int sum(int[] sales) {
        int result = 0;
        for (int sale : sales) {
            result += sale;
        }
        return result;
    }

    public int avg(int[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthWithMax(int[] sales) {
        int max = getMax(sales);
        int monthNumber = 0;
        int monthWithMax = 0;
        for (int sale : sales) {
            monthNumber++;
            if (sale == max) {
                monthWithMax = monthNumber;
            }
        }
        return monthWithMax;
    }

    public int monthWithMin(int[] sales) {
        int min = getMin(sales);
        int monthNumber = 0;
        int monthWithMin = 0;
        for (int sale : sales) {
            monthNumber++;
            if (sale == min) {
                monthWithMin = monthNumber;
            }
        }
        return monthWithMin;
    }

    public int monthCountLessThanAverage(int[] sales) {
        int avg = avg(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if(sale < avg) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int monthCountMoreThanAverage(int[] sales) {
        int avg = avg(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if(sale > avg) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int getMax(int[] sales) {
        int max = sales[0];
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public int getMin(int[] sales) {
        int min = sales[0];
        for (int sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }
}