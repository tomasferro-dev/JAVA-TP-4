package OpcionesMenuEj4;

public class Opcion4 {
    public static int SumarDiagonalPrincipal(int [][]array){

        //creamos una variable para guardar el resultado
        int sumas =0;

        for (int i = 0; i <array.length ; i++) {//filas

            sumas += array[i][i]; // ej: array [0][0], array[1][1],....

        }
        return sumas;
    }
}
