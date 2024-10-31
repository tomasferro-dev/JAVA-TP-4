package OpcionesMenuEj4;

import java.util.Scanner;

public class Opcion1 {
    public static void RellenarMatriz (int array [][], Scanner sc){

        System.out.println("Eligio la opcion 1: ");
        System.out.println("Rellenando Matriz..");
        for (int i = 0; i < array.length ; i++) {//filas
            for (int j = 0; j <array[0].length ; j++) {//columnas
                System.out.print("Introduce el valor para matriz, Fila: [" + i + "], Columna: [ " + j + "]: ");
                array[i][j] = sc.nextInt();

            }
        }

        //mostrar array con los valores agregados por el usuario
        System.out.println("Matriz completada:");
        for (int i = 0; i < array.length ; i++) {//filas
            for (int j = 0; j <array[0].length ; j++) {//columnas

                System.out.print(array[i][j]+" ");

            }
            System.out.println();//salto de linea
        }

    }
}
