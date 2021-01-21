package Controller;

import java.util.Scanner;

public class Multiplos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número A");
        int a = sc.nextInt();
        System.out.println("Ingresa un número B para saber si es divisible por los primeros " + a + "números");
        int b = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            if(b%i == 0){
                System.out.println(b + " es divisible por " +i);
            } else {
                System.out.println(b + " NO es divisible por " +i);
            }
        }
    }
}
