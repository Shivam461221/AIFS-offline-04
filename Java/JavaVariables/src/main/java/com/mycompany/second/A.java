
package com.mycompany.second;

import com.mycompany.javavariables.JavaVariables;

public class A {
    int age;
    
    public void show(){
        System.out.println("Show");
    }
    
    
    {
        //non-static field
        System.out.println("Non-static field");
    }
    
    public static void main(String[] args) {
       A obj = new A();
        System.out.println(obj.age);
        obj.show();
        
        
        A obj2 = new A();
        
        
        B.show();
    }
}
