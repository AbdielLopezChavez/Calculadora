package Calculadora;

import java.util.Scanner;

/**
 *
 * @author Abdiel
 */
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2, opc;
        
        System.out.println(".: MENU :.");
        System.out.println("Seleccione una opcion:");
        System.out.println("1.-Suma");
        opc = sc.nextInt();
        
        switch(opc){
            case 1: 
                System.out.println("Ingrese el primer numero:");
                num1 = sc.nextInt();
                System.out.println("Ingrese el segundo numero:");
                num2 = sc.nextInt();
                suma(num1,num2);
                break;
        }
    }
    public static void suma(int num1, int num2){
        int res = num1+num2;
        System.out.println("La suma es: "+res);
       
    }
}
