/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gamingconsolereport;

/**
 *
 * @author rendz
 */
public class GamingConsoleReport {

    public static void main(String[] args) {
        // Single-dimensional arrays
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        // Two-dimensional array: [city][console]
        int[][] sales = {
            {1000, 2000, 3000},  
            {2000, 3000, 4000},   
            {1500, 1100, 1200}    
        };

        // Report header
        System.out.println("-------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-------------------------------------");
        System.out.printf("%-18s%-8s%-8s%-8s%n", "", consoles[0], consoles[1], consoles[2]);

        // Sales per city
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s", cities[i]);
            for (int j = 0; j < consoles.length; j++) {
                System.out.printf("%-8d", sales[i][j]);
            }
            System.out.println();
        }

        // Totals per city
        System.out.println("-------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-------------------------------------");

        int[] cityTotals = new int[cities.length];
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < consoles.length; j++) {
                cityTotals[i] += sales[i][j];
            }
            System.out.printf("%-18s%d%n", cities[i], cityTotals[i]);
        }

        // City with the most sales
        int maxIndex = 0;
        for (int i = 1; i < cityTotals.length; i++) {
            if (cityTotals[i] > cityTotals[maxIndex]) {
                maxIndex = i;
            }
        }

        System.out.println("-------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxIndex]);
        System.out.println("-------------------------------------");
    }
}
