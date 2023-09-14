package Ejercicio3;

import java.util.Scanner;

public class ResumenVentas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[][] ventas = new int[5][4]; 
        int[] totalPorProducto = new int[5]; 
        int[] totalPorVendedor = new int[4];
        
        for (int vendedor = 0; vendedor < 4; vendedor++) {
            for (int producto = 0; producto < 5; producto++) {
                System.out.print("Ingrese el valor de ventas del producto " + (producto + 1) +
                                 " para el vendedor " + (vendedor + 1) + ": s/.");
                ventas[producto][vendedor] = scanner.nextInt();
                totalPorProducto[producto] += ventas[producto][vendedor];
                totalPorVendedor[vendedor] += ventas[producto][vendedor];
            }
        }
        
        System.out.println("\nResumen de Ventas:");
        System.out.println("Producto\tVendedor 1\tVendedor 2\tVendedor 3\tVendedor 4\tTotal por Producto");
        for (int producto = 0; producto < 5; producto++) {
            System.out.print("Producto " + (producto + 1) + ":\t");
            for (int vendedor = 0; vendedor < 4; vendedor++) {
                System.out.print(ventas[producto][vendedor] + "\t\t");
            }
            System.out.println(totalPorProducto[producto]);
        }
        
        System.out.print("Total por Vendedor:\t");
        for (int vendedor = 0; vendedor < 4; vendedor++) {
            System.out.print(totalPorVendedor[vendedor] + "\t\t");
        }
        
        scanner.close();
    }
}