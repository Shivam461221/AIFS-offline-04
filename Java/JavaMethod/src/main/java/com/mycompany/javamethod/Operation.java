
package com.mycompany.javamethod;

public class Operation {
   // private int x;
    
    //private int y;
    
    public int getSum(int x, int y){
        return x+y;
    }
    
    public int getProduct(int x, int y){
        return x*y;
    }
    
    public int getDivision(int x, int y){
        return x/y;
    }
    
    public int getSubstraction(int x, int y){
        return x-y;
    }
    
    public void sum(int x, int y){
        System.out.println("Sum: "+x+y);
    }
    
    
    // access modifier  return_type method_name(parameters){  logic }
}
