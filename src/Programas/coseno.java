package Programas;

import java.util.Scanner;

public class coseno {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Double n1;
        System.out.println("escriba un número");
        n1 = sc.nextDouble();

        double b = Math.toRadians(n1);
        System.out.println("Seno de " + n1 + " es: " + Math.cos(b));

    }

}
