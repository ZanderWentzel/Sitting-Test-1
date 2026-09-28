/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.question2;

/**
 *
 * @author wentz
 */
public class ConsoleSales extends Consoles {

    // Constructor that accepts console type, store name, and total sales
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }

    // Method that prints the report
    public void printReport() {
        System.out.println("           CONSOLE SALES REPORT               ");
        System.out.println("**********************************************");
        System.out.println("Console Type : " + getConsoleType());
        System.out.println("Store   : " + getStore());
        System.out.println("Total Sales  : " + getTotalSales());
        System.out.println("**********************************************");
    }
}
