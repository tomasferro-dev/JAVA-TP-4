package OpcionesMenuEj5;

import java.util.Scanner;

public class Opc3 {
    public static void RellenarStock(String [][] array, Scanner sc){

        System.out.print("Introduce la contraseña: ");

        String contraseña = sc.next();

        if ("AdminXYZ".equals(contraseña)) {

            System.out.print("Seleccione la posición de la golosina a rellenar (0 a " + (array.length - 1) + "): ");
            int posRellenar = sc.nextInt();

            if (posRellenar >= 0 && posRellenar < array.length) {
                System.out.print("Introduce la cantidad a añadir: ");
                int cantidadAAgregar = sc.nextInt();
                int cantidadActual = Integer.parseInt(array[posRellenar][2]);
                array[posRellenar][2] = String.valueOf(cantidadActual + cantidadAAgregar);
                System.out.println("Golosina " + array[posRellenar][0] + " reabastecida. Nueva cantidad: " + array[posRellenar][2]);

            } else {
                System.out.println("Posición no válida.");
            }
        } else {
            System.out.println("Contraseña incorrecta.");
        }
    }
}
