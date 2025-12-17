/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stringdemo;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Cloudblitz";
        String surname = "Institute";
        
        System.out.println(name.toLowerCase());
        
        System.out.println(name.toUpperCase());
        
        System.out.println(name.length());
        
        System.out.println(name.substring(3));
        
        System.out.println(name.contains("litz"));
        
        System.out.println(name.replace("blitz", "kitchen"));
        
       // String fullname = name+" " +surname;
        
        //System.out.println(fullname);
        
        String fullname = name.concat(surname);
        System.out.println(fullname);
        
        System.out.println(name.charAt(2));
        
        char[] arr = name.toCharArray();
        
        for(char i: arr){
            System.out.println(i);
        }
        
        
        String msg = "This is a java program";
        
        String[] arr2 = msg.split(" ");
        
        for(String i: arr2){
            System.out.println(i);
        }
        
    }
}
