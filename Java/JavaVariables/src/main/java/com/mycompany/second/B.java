/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.second;

/**
 *
 * @author shiva
 */
public class B {
    static int age = 25;
    
    public static void show(){
        System.out.println("Show");
    }
    
    static{
        System.out.println("Static field");
    }
    
    public static void main(String[] args) {
        System.out.println(age);
        show();
    }
}
