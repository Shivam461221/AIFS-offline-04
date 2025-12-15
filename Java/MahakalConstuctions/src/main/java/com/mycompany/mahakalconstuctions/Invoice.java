/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mahakalconstuctions;

public class Invoice {

    public static void getInvoice(Plot p) {
        System.out.println("Mahakal Constructions Pvt. Ltd.");
        System.out.println("Plot Sector: " + p.sector);
        System.out.println("Plot length: " + p.length);
        System.out.println("Plot breadth: " + p.breadth);
        System.out.println("plot Area: " + p.getArea());

        if (p.sector.equalsIgnoreCase(("A"))) {
            System.out.println("Plot price : " + Utils.SECTOR_A_PRICE);
        } else if (p.sector.equalsIgnoreCase(("B"))) {
            System.out.println("Plot price : " + Utils.SECTOR_B_PRICE);
        } else if (p.sector.equalsIgnoreCase(("C"))) {
            System.out.println("Plot price : " + Utils.SECTOR_C_PRICE);
        }
        System.out.println("Society Development Charges: "+Utils.SOCIETY_DEVELOPMENT_PRICE);
        System.out.println("Registry Percentage: "+ Utils.REGISTRY_PERCENTAGE +"%");
        System.out.println("Base Price: "+ Operation.getBasePrice(p));
        
        System.out.println("Final Price: "+ Operation.getFinalPrice(p));

    }
}
