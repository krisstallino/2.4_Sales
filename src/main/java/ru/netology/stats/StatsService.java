package ru.netology.stats;

public class StatsService {
    public int calcAllSum(long[] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int calcAverageSum(long[] sales) {
        int average = 0;
        if (sales.length > 0) {
            int sum = 0;
            for (long i : sales) {
                sum += i;
            }
            average = sum / sales.length;
        }
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        long maxSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (maxSale <= sales[i]) {
                maxSale = sales[i];
                maxMonth = i + 1;
            }
        }
        return maxMonth;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        long minSale = sales[0];
        for (int i = 0; i < sales.length; i++) {
            if (minSale >= sales[i]) {
                minSale = sales[i];
                minMonth = i + 1;
            }
        }
        return minMonth;
    }

    public int belowAverage(long[] sales) {
        int average = calcAverageSum(sales);
        int numberMonth = 0;
        for (long sale : sales) {
            if (sale < average) {
                sale = 1;
                numberMonth += sale;
            }
        }
        return numberMonth;
    }
    public int aboveAverage(long[] sales) {
        int average = calcAverageSum(sales);
        int numberMonth = 0;
        for (long sale : sales) {
            if (sale > average) {
                sale = 1;
                numberMonth += sale;
            }
        }
        return numberMonth;
    }
}