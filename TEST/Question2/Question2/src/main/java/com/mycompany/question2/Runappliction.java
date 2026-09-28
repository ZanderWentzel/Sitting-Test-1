/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;

import java.util.Scanner;

/**
 *
 * @author wentz
 */
public class Runappliction
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("===== SELECT A CONSOLE DEVICE TYPE =====");
        System.out.println("1. PS5");
        System.out.println("2. XBOX");
        System.out.println("3. SWITCH");

        int choice = input.nextInt();
        input.nextLine();

        String consoleType = null;
        switch (choice)
        {
            case 1:
                consoleType = "PS5";
                break;
            case 2:
                consoleType = "XBOX";
                break;
            case 3:
                consoleType = "SWITCH";
                break;
        }

        System.out.print("Enter the store: ");
        String storeName = input.nextLine();

        System.out.print("Enter the total amount of sales of " + consoleType + " for Nimber 1 Electronic Store: ");
        int totalSales = input.nextInt();

        ConsoleSales sale = new ConsoleSales(consoleType, storeName, totalSales);

        System.out.println();
        sale.printReport();

        input.close();
    }
}
