package OpcionesMenuEj4;

public class Opcion2 {
    public static int SumarFilas (int[][]array, int filas){

        int sumas = 0;

            for (int j = 0; j <array[filas].length ; j++) {//filas
                sumas += array[filas][j];

            }

         return sumas;
    }

}
