/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraydemo;

public class A {
    
    
    
    public static void main(String[] args) {
         int[] arr = new int[5]; 
    
         arr[0] = 1;
         arr[1] = 3;
         
       //  arr[5] = 11;
         
        // System.out.println(arr[0]);
        
        System.out.println(arr);
         
        // int arr2[] = {1,2,3,4,5,6,7};
         
         for(int i=0; i<arr.length; i++){
             System.out.println(arr[i]);
         }
         
         int[][] arr3 = new int[2][2];
         
          arr3[0][0] = 1;
          arr3[0][1] = 2;
          arr3[1][0] = 3;
          arr3[1][1] = 4;
          
          System.out.println("------------------------");
          
          for(int i = 0; i<arr3.length;i++){
             
              for(int j=0;j<arr3[i].length;j++){
                  System.out.print(arr3[i][j]+" ");
              }
              
              System.out.println();
          }
          
          int[][] arr4 = {{1,2,3,},{4,5,6}};
          
    }
    
}
