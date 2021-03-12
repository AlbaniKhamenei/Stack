/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
public class CobaStackStatis {
    public static void main(String[] args){
        Stack S = new Stack ();
        S.createEmpty();
        S.printStack();
        
        System.out.println("=============================");
        
        S.push ("E31201158", "Albani Khamenei", 90.100);
        S.push ("E31201159", "Mimi Peri", 80.90);
        S.push ("E31201160", "Rahmawati Kekeyi", 70.80);
        
        S.printStack();
        
        System.out.println("==============================");
        
        S.pop();
        S.pop();
        S.printStack();
        
        System.out.println("==============================");
    }
}
   
