/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.question1;

/**
 *
 * @author wentz
 */
public class Question1
{

    public static void main(String[] args)
    {

        //Decl
        int total;
        int highestTotal = 0;
        String topCity = "";

        //populte one dimensional array
        String[] cityNames =
        {
            "Cape Town", "Port Elizabeth", "Pretoria"
        };

        //Populate two dim array
        int[][] sales =
        {
            {
                1000, 2000, 3000
            },
            {
                2000, 3000, 4000
            },
            {
                1500, 1100, 1200
            }
        };

        System.out.println("------------------------------------------");
        System.out.println("Gaming Console Report");
        System.out.println("------------------------------------------");

        System.out.println("\t\tPS5\tXBOX\tSWITCH");
        for (int i = 0; i < sales.length; i++)
        {
            System.out.print(cityNames[i] + "\t");
            for (int j = 0; j < sales[i].length; j++)
            {
                System.out.print(sales[i][j] + "\t");
            }
            System.out.println();

        }

        System.out.println("------------------------------------------");
        System.out.println("Console Sales Totals for Each City");
        System.out.println("------------------------------------------");

        for (int i = 0; i < sales.length; i++)
        {
            total = 0;
            System.out.print(cityNames[i] + "\t");
            for (int j = 0; j < sales[i].length; j++)
            {
                total = total + sales[i][j];
            }
            System.out.println(total);

            if (total > highestTotal)
            {
                highestTotal = total;
                topCity = cityNames[i];
            }
        }
        System.out.println("");
        System.out.println("City With The Most Sales: " + topCity);
        System.out.println("------------------------------------------");
    }
}
