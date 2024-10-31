package OpcionesMenuEj5;

public class Opc2 {
    public static void MostrarGolosinas (String[][] array){
        System.out.println("Golosinas disponibles:");
        System.out.println("Nombre\t\tPrecio\tCantidad");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%-18s %-7s %-8s%n", array[i][0], array[i][1], array[i][2]);
        }
    }
}
