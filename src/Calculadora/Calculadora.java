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
            case 3: 
                System.out.println("Ingrese el primer numero:");
                num1 = sc.nextInt();
                System.out.println("Ingrese el segundo numero:");
                num2 = sc.nextInt();
                multi(num1,num2);
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
    public static void multi(int num1, int num2){
        int multi = num1*num2;
        System.out.println("La multiplicacion es: "+multi);
       
    }
}
