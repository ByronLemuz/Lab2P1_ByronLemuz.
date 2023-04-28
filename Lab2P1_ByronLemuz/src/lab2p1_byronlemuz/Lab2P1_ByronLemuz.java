/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_byronlemuz;
import java.util.Scanner;
/**
 *
 * @author lesly
 */
public class Lab2P1_ByronLemuz {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("Menu:");
            System.out.println("1. Discount!");
            System.out.println("2. Puntos Colineales");
            System.out.println("3. Los Tres Chiflados");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = leer.nextInt();

            if (opcion == 1) {
                System.out.print("Ingrese el subtotal: ");
                double subtotal = leer.nextDouble();
                double total = 0;
                if (subtotal < 3000) {
                    total = subtotal * 0.9;
                } else if (subtotal < 5500) {
                    total = subtotal * 0.8;
                } else {
                    total = subtotal * 0.7;
                }
                System.out.println("Su total con descuento es de: " + total);
            } else if (opcion == 2) {
                System.out.print("Ingrese coordenada x de P: ");
                int x1 = leer.nextInt();
                System.out.print("Ingrese coordenada y de P: ");
                int y1 = leer.nextInt();
                System.out.print("Ingrese coordenada x de Q: ");
                int x2 = leer.nextInt();
                System.out.print("Ingrese coordenada y de Q: ");
                int y2 = leer.nextInt();
                System.out.print("Ingrese coordenada x de R: ");
                int x3 = leer.nextInt();
                System.out.print("Ingrese coordenada y de R: ");
                int y3 = leer.nextInt();
                if ((y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1)) {
                    System.out.println("¡Los puntos son colineales! Sí forman una recta");
                } else {
                    System.out.println("Los puntos no son colineales! No forman una recta");
                }
            } else if (opcion == 3) {
                System.out.print("Ingrese el número de Larry: ");
                int larry = leer.nextInt();
                System.out.print("Ingrese el número de Moe: ");
                int moe = leer.nextInt();
                System.out.print("Ingrese el número de Curly: ");
                int curly = leer.nextInt();
                int mayor = Math.max(larry, Math.max(moe, curly));
                int menor = Math.min(larry, Math.min(moe, curly));
                if (larry != mayor && larry != menor) {
                    System.out.println("¡Larry debe pagar!");
                } else if (moe != mayor && moe != menor) {
                    System.out.println("¡Moe debe pagar!");
                } else if (curly != mayor && curly != menor) {
                    System.out.println("¡Curly debe pagar!");
                } else {
                    System.out.println("Los tres chiflados tienen el mismo número. ¡Nadie paga!");
                }
            } else if (opcion != 4) {
                System.out.println("Opcion invalida. Por favor ingrese una opcion valida.");
            }
        } while (opcion != 4);
        System.out.println("¡Gracias por usar el programa!");
    }
}
   

