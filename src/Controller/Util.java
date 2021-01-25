package Controller;

import java.util.Scanner;

public class Util {
    public static void pares(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número para saber los pares anteriores");
        int n = sc.nextInt();
        for (int i = 1; i < n; i++) {
            if(i%2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void multiplos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número A");
        int a = sc.nextInt();
        System.out.println("Ingresa un número B para saber si es divisible por los primeros " + a + " números");
        int b = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            if(b%i == 0){
                System.out.println(b + " es divisible por " +i);
            } else {
                System.out.println(b + " NO es divisible por " +i);
            }
        }
    }

    public static void primo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número para saber si es primo");
        int a = sc.nextInt();
        boolean flag = false;
        for (int i = 2; i <= a/2; ++i) {
            if (a % i == 0) {
                flag = true;
                break;
            }
        }
        if (!flag){
            System.out.println(a + " es primo");
        }
        else {
            System.out.println(a + " NO es primo");
        }
    }

    public static void primerosPrimos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número para saber los primos anteriores");
        int a = sc.nextInt();
        for (int i = 1; i <= a; i++) {
            boolean flag = false;
            for (int j = 2; j <= i/2; ++j) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (!flag){
                System.out.println(i + " es primo");
            }
        }
    }

    private static int charCount(String s, char c){
        int count = 0;
        for(int j = 0; j < s.length(); j++) {
            if(s.charAt(j) == c)
                count++;
        }
        return count;
    }

    private static boolean cumpleCondicion(int i, int m, int d){
        String s = Integer.toString(i);
        char c = (char) (d+48);
        return charCount(s,c) == m;

    }
    public static void naturales(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número N que será la cantidad de números a mostrar");
        int n = sc.nextInt();
        System.out.println("Ingresa un número D que será el dígito a buscar");
        int d = sc.nextInt();
        System.out.println("Ingresa un número M la cantidad de dígitos " + d);
        int m = sc.nextInt();

        int i = 1;
        int count = 0;
        while (count < n) {
            if (cumpleCondicion(i, m, d)){
                System.out.println(i);
                count++;
            }
            i++;
        }
    }
}
