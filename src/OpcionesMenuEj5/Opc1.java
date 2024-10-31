package OpcionesMenuEj5;

public class Opc1 {
    public static int PedirGolosina (String[][]array, int opcion, int TotalVentas ){


        //verificar si hay stock disponible
        int StockDisponible = Integer.parseInt(array[opcion][2]);

        if (StockDisponible>0){

            //guardar el precio del producto en una variable
            int precio = Integer.parseInt(array[opcion][1]);

            //agregar el precio del producto en la variable ventas
            TotalVentas += precio;

            //restar en producto vendido en el stock
            StockDisponible--;

            //convertimos la variablr a string
            array[opcion][2] = String.valueOf(StockDisponible);

            //Mostrar resultados por consola
            System.out.println("Has pedido: " + array[opcion][0]);
            System.out.println("Precio: $" + precio);
            System.out.println("Cantidad restante: " + StockDisponible);

        }else {

            //si no hay  stock disponible
            System.out.println("Lo sentimos, " + array[opcion][0] + " está agotado. Seleccione otra golosina.");
        }
      return TotalVentas;
    }

}
