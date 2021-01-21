package Controller;

import java.util.Scanner;

public class Primo {
    public static void main(String[] args){
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
}
