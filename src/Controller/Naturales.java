package Controller;

import java.util.Scanner;

public class Naturales {
    public static int charCount(String s, char c){
        int count = 0;
        for(int j = 0; j < s.length(); j++) {
            if(s.charAt(j) == c)
                count++;
        }
        return count;
    }

    public static boolean cumpleCondicion(int i, int m, int d){
        String s = Integer.toString(i);
        char c = (char) (d+48);
        return charCount(s,c) == m;

    }
    public static void main(String[] args){
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
