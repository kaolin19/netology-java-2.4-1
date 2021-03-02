package ru.netology.Stats;

public class StatsService {
    int[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    public int calculateSum(int[] monthlySales) {
        int sum = 0;
        for (int sale : monthlySales) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverage(int[] monthlySales) {
        int sum = 0;
        for (int sale : monthlySales) {
            sum += sale;
        }
        return sum / monthlySales.length;
    }

    public int calculateMax(int[] monthlySales) {
        int month = 1;
        int maxMonth = 0;
        int currentMax = monthlySales[0];
        for (int sale : monthlySales) {
            if (currentMax <= sale) {
                currentMax = sale;
                maxMonth = month;
            }
            month++;
        }
        return maxMonth;
    }

    public int calculateMin(int[] monthlySales) {
        int month = 1;
        int minMonth = 0;
        int currentMin = monthlySales[0];
        for (int sale : monthlySales) {
            if (currentMin >= sale) {
                currentMin = sale;
                minMonth = month;
            }
            month++;
        }
        return minMonth;
    }

    public int calculateOverAverage(int[] monthlySales) {
        int sum = 0;
        for (int sale : monthlySales) {
            sum += sale;
        }
        int averageSum = sum / monthlySales.length;
        int monthCount = 0;
        for (int sale : monthlySales) {
            if (averageSum < sale) {
                monthCount++;
            }
        }
        return monthCount;
    }

    public int calculateUnderAverage(int[] monthlySales) {
        int sum = 0;
        for (int sale : monthlySales) {
            sum += sale;
        }
        int averageSum = sum / monthlySales.length;
        int monthCount = 0;
        for (int sale : monthlySales) {
            if (averageSum > sale) {
                monthCount++;
            }
        }
        return monthCount;
    }
}