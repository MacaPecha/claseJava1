package Controller;

import java.util.Scanner;

public class PrimerosPrimos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número para saber si es primo");
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
}
