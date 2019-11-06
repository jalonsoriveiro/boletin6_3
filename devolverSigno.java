/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;

/**
 *
 * @author jalonsoriveiro
 */
public class devolverSigno {
    
     public void mostrarSigno(int num1){
    
        if(num1>0){ 
            System.out.println("+");        
         }
        else if(num1<0){
         System.out.println("-");   
        }
         else {
         System.out.println(0);   
        }
       
    }
}
