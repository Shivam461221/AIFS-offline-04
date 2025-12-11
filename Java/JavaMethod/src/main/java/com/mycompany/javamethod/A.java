/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javamethod;

public class A {
    
    String name;
    int age;
    
    public void print(int age, String name){
        System.out.println("Age: "+age);
        System.out.println("Name: "+ name);
    }
    
    public static void main(String[] args) {
        A a = new A();
       //a.age = 12;
        
       a.print(12, "hello");
    }
}
