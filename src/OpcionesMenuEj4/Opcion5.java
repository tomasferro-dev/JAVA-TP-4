package OpcionesMenuEj4;

public class Opcion5 {
    public static int SumarDiagonalInversa(int[][] array){

        int sumas= 0;
        int n = array.length;
        for (int i = 0; i < n ; i++) {//columnas
            sumas+= array[i] [n - 1 - i];

        }
        return sumas;
    }
}
