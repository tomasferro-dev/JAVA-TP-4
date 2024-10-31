package OpcionesMenuEj4;

public class Opcion3 {
    public static int SumarColumnas(int [][] array,int columnas ){
        int sumas = 0;

        for (int i = 0; i <array[columnas].length ; i++) {//columnas
            sumas += array[i][columnas];

        }
        return sumas;
    }
}
