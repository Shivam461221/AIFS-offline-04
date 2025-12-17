/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stringdemo;
    
    

public class Program {
    public static void reverseString(String str){
        
        System.out.println("Original String: "+str);
        String rev="";
        
        for(int i=str.length()-1; i>=0;i--){
            rev+=str.charAt(i);
        }
        
        System.out.println("Reversed String: "+ rev);
    }
    
    public static void checkPalindrome(String str){
        String rev="";
        
        for(int i=str.length()-1; i>=0;i--){
            rev+=str.charAt(i);
        }
        
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }
    
    public static void countWords(String str){
        String[] words = str.split(" ");
        
        System.out.println("Total words: "+words.length);
    }
    
    public static void countCharacters(String str){
        String newStr = str.replace(" ", "");
        
        System.out.println("Total characters: "+newStr.length());
    }
    
    
    
    public static void main(String[] args) {
      //  reverseString("Hello Java");
        
      //  checkPalindrome("java");
        
        String str = "This is a java program. We are using core java";
        
        countWords(str);
        
        countCharacters(str);
    }
}
