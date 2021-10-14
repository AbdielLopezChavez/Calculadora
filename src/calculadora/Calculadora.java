/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author zallo
 */
public class Calculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2, opc;
        
        System.out.println(".: MENU :.");
        System.out.println("Seleccione una opcion:");
        System.out.println("1.-Suma");
        System.out.println("2.-Resta");
        opc = sc.nextInt();
        
        switch(opc){
            case 1: 
                System.out.println("Ingrese el primer numero:");
                num1 = sc.nextInt();
                System.out.println("Ingrese el segundo numero:");
                num2 = sc.nextInt();
                suma(num1,num2);
                break;
            case 2: 
                System.out.println("Ingrese el primer numero:");
                num1 = sc.nextInt();
                System.out.println("Ingrese el segundo numero:");
                num2 = sc.nextInt();
                resta(num1,num2);
                break;
        }
    }
    public static void suma(int num1, int num2){
        int res = num1+num2;
        System.out.println("La suma es: "+res);
       
    }
    public static void resta(int num1, int num2){
        int res = num1-num2;
        System.out.println("La resta es: "+res);
       
    }
    
}
