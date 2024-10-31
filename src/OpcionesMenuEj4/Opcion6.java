package OpcionesMenuEj4;

public class Opcion6 {
    public static double CalcularMediaMatriz(int[][] array){

        int sumas = 0;//sumar valores de la matriz
        int TotalElementos = 0; //contar cuantos valores hay en la matriz

        for (int i = 0; i <array.length ; i++) {//filas
            for (int j = 0; j <array[0].length ; j++) {//columnas

                sumas += array[i][j];
                TotalElementos ++;

            }

        }
        return  (double) sumas /TotalElementos;
    }
}
