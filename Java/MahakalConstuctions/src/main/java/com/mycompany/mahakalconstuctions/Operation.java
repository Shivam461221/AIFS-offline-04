/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mahakalconstuctions;

public class Operation {

    public static double getBasePrice(Plot p) {
        double area = p.getArea();

        if (p.sector.equalsIgnoreCase(("A"))) {
            return area * Utils.SECTOR_A_PRICE;
        } else if (p.sector.equalsIgnoreCase(("B"))) {
            return area * Utils.SECTOR_B_PRICE;
        } else if (p.sector.equalsIgnoreCase(("C"))) {
            return area * Utils.SECTOR_C_PRICE;
        }

        return 0;
    }
    
    public static double getFinalPrice(Plot p){
        double basePrice = getBasePrice(p);
        
        double finalPrice = basePrice + (basePrice*Utils.REGISTRY_PERCENTAGE)/100 + Utils.SOCIETY_DEVELOPMENT_PRICE;
        
        return finalPrice;
    }
}
