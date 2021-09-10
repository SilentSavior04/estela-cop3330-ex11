package com.company;
import java.util.Scanner;

public class CurrencyConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double result = 0;

        System.out.println("Currency Conversion");
        System.out.println("----------------------------------");
        System.out.println("How many Euros are you exchanging?");

        double euros = sc.nextDouble();
        System.out.println("Exchange Rate");

        double exchangeRate = sc.nextDouble();
        double dollars = currencyConverter(euros, exchangeRate,result);

        System.out.println(euros + " Euros exchange rate " + exchangeRate + " is ");
        System.out.println(dollars + " U.S. Dollars ");
        sc.close();
    }
    private static double currencyConverter(double euros, double exchangeRate,double result) {
        return result = euros * exchangeRate;
    }
}
