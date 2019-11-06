/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin6_3;

import java.util.Scanner;

/**
 *
 * @author jalonsoriveiro
 */
public class Boletin6_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /*3- Teclear un número e sacar por consola o signo “ + “
        se o nº é positivo, o signo “ –“ se é negativo e “ 0 “ se é cero .dan*/
        devolverSigno num1 = new devolverSigno();
        Scanner sc = new Scanner(System.in);   
        System.out.println("dame un numero:");
        short num2 = sc.nextShort();
        num1.mostrarSigno(num2);
        
    }
    
}
