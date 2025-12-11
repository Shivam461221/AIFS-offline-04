
package com.mycompany.javamethod;

public class JavaMethod {
    
    public static void printTable(int num){
        for(int i = 1; i<=10; i++){
            System.out.println(num*i);
        }
    }
    
    static{
    
}

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        
//        A a = new A();
//        
//        a.print(0, "java");
//        
//        
//        C.getData();


        printTable(17);
        printTable(33);
        
    }
}
