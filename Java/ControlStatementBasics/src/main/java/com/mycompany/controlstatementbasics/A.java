/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.controlstatementbasics;

import java.util.Scanner;

public class A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int num = sc.nextInt();

        //System.out.println(num);
        if (num > 0) {
//            System.out.println("Positive");
            if (num % 2 == 0) {
                System.out.println("Postive Even number");
            } else {
                System.out.println("Positive odd number");
            }
        } else if (num < 0) {
            if (num % 2 == 0) {
                System.out.println("Negative Even number");
            } else {
                System.out.println("Negative odd number");
            }
        } else {
            System.out.println("Zero");
        }
    }
}
