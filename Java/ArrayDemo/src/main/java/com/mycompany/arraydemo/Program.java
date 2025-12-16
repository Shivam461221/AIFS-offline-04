/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arraydemo;

public class Program {
    
    public static void findLargest(int arr[]){
        int largest = arr[0];
        
        for(int i=0; i<arr.length; i++){
         if(arr[i]>largest){
             largest = arr[i];
         }
        }
        
        System.out.println("Largest element: "+largest);
    }
    
    public static void findSmallest(int arr[]){
        int smallest = arr[0];
        
        for(int i=0; i<arr.length; i++){
         if(arr[i]<smallest){
             smallest = arr[i];
         }
        }
        
        System.out.println("Smallest element: "+smallest);
    }
    
    public static void countEvenOdd(int arr[]){
        int even=0, odd = 0;
        
        
        for (int element : arr) {
            
            if(element%2==0){
                even++;
            }
            else{
                odd++;
            }
            
            
        }
        
        System.out.println("Even: "+even);
        System.out.println("Odd: "+odd);
    }
    
    public static void main(String[] args) {
        int arr[] = {11,2,33,4,15,6,7,8};
        
//        for(int element: arr){
//            System.out.println(element);
//        }
        
        
       // findLargest(arr);
        
        //findSmallest(arr);
        
        countEvenOdd(arr);
    }
}
