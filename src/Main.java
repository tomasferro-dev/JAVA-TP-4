import OpcionesMenuEj4.*;
import OpcionesMenuEj5.Opc1;
import OpcionesMenuEj5.Opc2;
import OpcionesMenuEj5.Opc3;
import OpcionesMenuEj5.Opc4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Ejercicio1Ejemplo();
        //Ejercicio1(sc);
        //Ejercicio2(sc);
//        Ejercicio3(sc);
        //Ejercicio4(sc);
        //Ejercicio5(sc);

    }

    public static void Ejercicio1Ejemplo() {
        //Crea un programa que pida por pantalla cuatro países y a continuación tres
        //ciudades de cada uno de estos países. Los nombres de ciudades deben
        //almacenarse en un array multidimensional cuyo primer índice sea el número
        //asignado a cada país y el segundo índice el número asignado a cada ciudad. Es decir
        //el array deberá tener un tamaño de 4x4

        /*
        Argentina : Buenos Aires,      Cordoba , La plata
        España:       Madrid ,          Lugo ,   Sevilla
        Francia:      Paris ,           Niza ,   Lyon
        Italia:       Roma ,           Napoles, Sicilia
         */

        //definimos el array bidimensional

        String[][] Pais_Ciudades = new String[4][4];

        //llenamos el array dimensional

        Pais_Ciudades[0][0] = "Argentina:";
        Pais_Ciudades[0][1] = "Buenos Aires";
        Pais_Ciudades[0][2] = "Cordoba";
        Pais_Ciudades[0][3] = "La Plata";
        Pais_Ciudades[1][0] = "España:";
        Pais_Ciudades[1][1] = "Madrid";
        Pais_Ciudades[1][2] = "Lugo";
        Pais_Ciudades[1][3] = "Sevilla";
        Pais_Ciudades[2][0] = "Francia:";
        Pais_Ciudades[2][1] = "Paris";
        Pais_Ciudades[2][2] = "Niza";
        Pais_Ciudades[2][3] = "Lyon";
        Pais_Ciudades[3][0] = "Italia:";
        Pais_Ciudades[3][1] = "Roma";
        Pais_Ciudades[3][2] = "Napoles";
        Pais_Ciudades[3][3] = "Sicilia";


        System.out.print("[" + Pais_Ciudades[0][0] + "");
        System.out.print(" " + Pais_Ciudades[0][1] + " ");
        System.out.print(" " + Pais_Ciudades[0][2] + " ");
        System.out.println(" " + Pais_Ciudades[0][3] + "]");

        System.out.print("[" + Pais_Ciudades[1][0] + "");
        System.out.print(" " + Pais_Ciudades[1][1] + " ");
        System.out.print(" " + Pais_Ciudades[1][2] + " ");
        System.out.println(" " + Pais_Ciudades[1][3] + "]");

        System.out.print("[" + Pais_Ciudades[2][0] + "");
        System.out.print(" " + Pais_Ciudades[2][1] + " ");
        System.out.print(" " + Pais_Ciudades[2][2] + " ");
        System.out.println(" " + Pais_Ciudades[2][3] + "]");

        System.out.print("[" + Pais_Ciudades[3][0] + " ");
        System.out.print(" " + Pais_Ciudades[3][1] + " ");
        System.out.print(" " + Pais_Ciudades[3][2] + " ");
        System.out.println(" " + Pais_Ciudades[3][3] + "]");


    }

    public static void Ejercicio1(Scanner sc) {

        System.out.println("----- EJERCICIO 1 -----");
        //declara e inicializa un array de 4x4, porque vamos a pedir 4 paises y 3 ciudades
        int filas = 4;
        int columnas = 4;
        String[][] arreglo = new String[filas][columnas];

        //pedir valores por consola mediante un bucle for
        for (filas = 0; filas < arreglo.length; filas++) {//filass
            //System.out.println("Ingrese el pais : n"+(filas));
            for (columnas = 0; columnas < arreglo[0].length; columnas++) {//columnas
                System.out.println("Ingrese el pais n: " + (filas + 1) + ", ciudad :" + (columnas));
                arreglo[filas][columnas] = sc.nextLine();
            }
        }

        for (filas = 0; filas < arreglo.length; filas++) {//filas

            for (columnas = 0; columnas < arreglo[0].length; columnas++) {//columnas
                //System.out.println("pais n "+filas+", ciudad: "+columnas+" :");

                System.out.print(arreglo[filas][columnas] + " ");

            }
            System.out.println();
        }
    }

    public static void Ejercicio2(Scanner sc) {
        /*
        Crea un programa que pida por pantalla 2 valores numéricos enteros X e Y. Cree un
        primer array de tamaño [X,Y] de tipo entero y almacene en cada posición un valor
        entero que deberá ser ingresado por el usuario. A continuación cree un segundo
        array de tamaño [Y,X] y almacene en cada posición un valor entero que deberá ser
        ingresado por el usuario. Finalmente cree un tercer array de tamaño [X,Y] que será
        el resultante de multiplicar cada una de las posiciones de las filas del array uno por
        cada una de las posiciones de las columnas del array 2.
        Muestre por pantalla cada uno de los arrays con sus valores.
         */


        System.out.println("----- EJERCICIO 2 -----");
        //pedir dos valores enteros al usuario, guardarlos en variables
        System.out.println("Ingrese el primer valor, para el array:");
        int X = sc.nextInt();
        System.out.println("Ingrese el segundo valor, para el array:");
        int Y = sc.nextInt();

        //creamos un array con los valores dados por el usuario
        int[][] array1;
        array1 = new int[X][Y];

        //pedir al usuario que ingrese valores y almacenarlos en el primer array, usar bucle for
        for (int i = 0; i < array1.length; i++) {//filas
            for (int j = 0; j < array1[0].length; j++) {//columnas
                System.out.println("Ingresa un valor tipo entero, en la fila: " + (i + 1) + ", columna: " + (j + 1));
                array1[i][j] = sc.nextInt();

            }

        }
        //mostrar valores por consola del primer array
        System.out.println("Valores del primer array:");
        for (int i = 0; i < array1.length; i++) {//filas
            for (int j = 0; j < array1[0].length; j++) {//columnas
                System.out.print(array1[i][j]);

            }

            System.out.println();//salto de linea
        }

        //------------------------------------------------------------------

        //creamos un segundo array, con los tamaños [Y][X]
        int[][] array2;
        array2 = new int[Y][X];

        //pedir valores al usuario, almacenarlos en array2 mediante bucle for
        System.out.println("segundo array:");
        for (int i = 0; i < array2.length; i++) {//filas
            for (int j = 0; j < array2[0].length; j++) {//columnas
                System.out.println("Ingresa un valor de tipo entero, fila: " + (i + 1) + ", columna: " + (j + 1));
                array2[i][j] = sc.nextInt();
            }

        }

        //mostrar por consola array2
        System.out.println("Valores array 2:");
        for (int i = 0; i < array2.length; i++) {//filas
            for (int j = 0; j < array2[0].length; j++) {//columnas
                System.out.print(array2[i][j]);
            }
            System.out.println();//salto de linea
        }
        //----------------------------------------------------------

        //crear un array 3, [X][Y]
        int[][] array3;
        array3 = new int[X][Y];

        //multiplicamos valores del array1 con array2, guardar resultado en array3,
        // mediante bucle for
//        for (int i = 0; i < array1.length; i++) {//filas
//            for (int j = 0; j < array1[0].length; j++) {//columnas
//
//                //guardar el resultado de la multiplicacion en el array3
//                array3[i][j] = array1[i][j] * array2[i][j];
//            }
//
//        }
        for (int i = 0; i < array1.length; i++) { // filas de array1
            for (int j = 0; j < array2[0].length; j++) { // columnas de array2
                array3[i][j] = 0; // Inicializar el valor en array3
                for (int k = 0; k < array1[0].length; k++) { // columnas de array1 (o filas de array2)
                    array3[i][j] += array1[i][k] * array2[k][j]; // Multiplicación y suma
                }
            }
        }
        //--------------------------------------------------------------
        //mostrar arrays por consola

        //mostrar por consola array1
        System.out.println("Valores del array 1:");
        for (int i = 0; i < array1.length; i++) {//filas
            for (int j = 0; j < array1[0].length; j++) {//columnas
                System.out.print(array1[i][j]);

            }

            System.out.println();//salto de linea
        }

        //mostrar por consola array2
        System.out.println("Valores array 2:");
        for (int i = 0; i < array2.length; i++) {//filas
            for (int j = 0; j < array2[0].length; j++) {//columnas
                System.out.print(array2[i][j]);
            }
            System.out.println();//salto de linea
        }


        //mostrar por consola array 3
        System.out.println("Resultados de multiplicar array1 * array2:");

        for (int i = 0; i < array3.length; i++) {//filas
            for (int j = 0; j < array3[0].length; j++) {//columnas
                System.out.print(array3[i][j] + " ");
            }
            System.out.println();//salto de linea
        }

    }

    public static void Ejercicio3(Scanner sc) {
        /*
        Codifique un programa que solicite un valor entero X mayor o igual a 3 y menor o
        igual a 10. Cree un arreglo de tamaño [X,X] de tipo int. Posteriormente solicite
        los valores necesarios para cargar cada una de las celdas de la matriz. Muestre por
        pantalla la matriz resultante.
        Al finalizar la carga sume cada una de las columnas del array y asigne los resultados
        en una nueva matriz de una dimensión, finalmente sume los valores de esta última
        matriz y muestre el resultado por pantalla.
         */

        //pedir al usuario un valor tipo int x, x>=3 && x<=10
        System.out.println("----- EJERCICIO 3 -----");
        System.out.println("Ingrese un valor de tipo entero:");
        int X = sc.nextInt();

        while (X < 3 || X > 10) {

            if (X < 3) {
                System.out.println("Ingrese un numero mayor o igual a 3: ");
                X = sc.nextInt();

            } else if (X > 10) {
                System.out.println("ingrese un numero menor o igual a 10: ");
                X = sc.nextInt();
            }
        }

        //mostrar X
        System.out.println("Valor ingresado: " + X);

        //crear un array tipo int, con el valor que ingreso el usuario [X][X]
        int[][] array;
        array = new int[X][X];

        //------------------------------------

        //llenar array con valores que ingrese el usuario, mediante bucle for

        for (int i = 0; i < array.length; i++) {//filas
            for (int j = 0; j < array[0].length; j++) {//columnas

                System.out.println("Ingrese un valor tipo entero, fila: " + (i + 1) + ", columna: " + (j + 1));
                array[i][j] = sc.nextInt();

            }

        }

        //mostrar array
        System.out.println("Valores del array:");
        for (int i = 0; i < array.length; i++) {//filas
            for (int j = 0; j < array[0].length; j++) {//columnas

                System.out.print(array[i][j] + " ");

            }
            System.out.println();//salto de linea
        }

        //crear un array unidimensional para cargar las sumas de las columnas
        int[] array_sumas;
        array_sumas = new int[array[0].length];//longitud de columnas del primer array

        //sumamos las columnas y el resultado lo guardamos en el array_sumas,mediante el bucle for
        for (int i = 0; i < array.length; i++) {//filas
            for (int j = 0; j < array[0].length; j++) {//columnas
                array_sumas[j] += array[i][j];

            }

        }

        //mostrar array por consola
        System.out.println("Sumas de columnas del array anterior: ");
        for (int i = 0; i < array_sumas.length; i++) {//filas


            System.out.println("Columna " + (i + 1) + ": " + array_sumas[i]);

        }

        //Sumamos el último arreglo y lo mostramos
        int total = 0;
        for (int i = 0; i < array_sumas.length; i++){
            total += array_sumas[i];
        }
        System.out.println("El total es "+ total);
    }


    public static void Ejercicio4(Scanner sc) {
        /*
        Codifique un programa que solicite un valor entero X mayor o igual a 4 y menor o
        igual a 10. Cree un arreglo de tamaño [X,X] de tipo int, crear un menu con las siguientes opciones
        a) Rellenar TODA la matriz de números, debes pedírselo al usuario.
        b) Suma de una fila que se pedirá al usuario (validar que elija una correcta)
        c) Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
        d) Sumar la diagonal principal
        e) Sumar la diagonal inversa
        f) La media de todos los valores de la matriz

        IMPORTANTE: hasta que no se haga la primera opción a, el resto de opciones no se
        deberán de ejecutar, simplemente mostrar un mensaje que diga que debes
        rellenar la matriz. Mostrar por pantalla el resultado de la ejecución de cada una de
        las opciones del menú.
         */

        //pedir al usuario que ingrese un valor tipo int, X>=4 && X<=

        System.out.println("----- EJERCICIO 4 -----");
        System.out.println("Ingrese un numero de tipo entero:");
        int X = sc.nextInt();

        while (X < 4 || X > 10) {

            if (X < 4) {
                System.out.println("Ingrese un numero mayor o igual a 4: ");
                X = sc.nextInt();
            } else if (X > 10) {
                System.out.println("Ingrese un numero menor o igual a 10: ");
                X = sc.nextInt();
            }
        }

        //crear un array bidimensional del tipo int con el valor ingresado por el usuario
        int[][] array;
        array = new int[X][X];

        //indicamos que la matriz esta vacia
        boolean MatrizRellena = false;

        //crear variable para opc menu
        int opcion = 0;

        //crear menu
        do {
            //mostrar el menu
            System.out.println("-----MENU-----");
            System.out.println(" 1 - Rellenar la matriz");
            System.out.println(" 2 - Sumar una fila");
            System.out.println(" 3 - Sumar una columna");
            System.out.println(" 4 - Suma de diagonal principal");
            System.out.println(" 5 - Suma de diagonal inversa");
            System.out.println(" 6 - Media de los valores de la matriz");
            System.out.println(" 7 - Salir del menu");
            System.out.println("Elija una opcion: ");
            opcion = sc.nextInt();


            switch (opcion) {

                case 1: //Rellenar TODA la matriz de números, debes pedírselo al usuario.

                    //llamar metodo OpcionesMenuEj4.Opcion1
                    Opcion1.RellenarMatriz(array, sc);
                    MatrizRellena = true; //validamos que la matriz esta rellena
                    break;

                case 2://Suma de una fila que se pedirá al usuario (validar que elija una correcta)
                    if (MatrizRellena) {
                        System.out.println("Ingrese el numero de fila que desea sumar: (0 a " + (X - 1) + "): ");
                        int filas = sc.nextInt();

                        if (filas >= 0 && filas <= (X - 1)) {

                            System.out.println("-----------------------------------");
                            System.out.println("Suma de la fila " + filas + ": " + Opcion2.SumarFilas(array, filas));
                            System.out.println("-----------------------------------");

                        } else {
                            System.out.println("----Fila fuera de rango o no valida----");
                        }

                    } else {
                        System.out.println("Antes de realizar esta accion, debe llenar la matriz primero");
                    }
                    break;
                case 3://Suma de una columna que se pedirá al usuario (controlar que elija una correcta)
                    if (MatrizRellena) {
                        System.out.println("Ingrese el numero de columna que desea sumar: (0 a " + (X - 1) + "): ");
                        int columnas = sc.nextInt();

                        if (columnas >= 0 && columnas <= (X - 1)) {

                            System.out.println("-----------------------------------");
                            System.out.println("La suma de la columna " + columnas + ":" + Opcion3.SumarColumnas(array, columnas));
                            System.out.println("-----------------------------------");

                        } else {

                            System.out.println("----Columna fuera de rango o no valida----");
                        }
                    } else {
                        System.out.println("Antes de realizar esta accion, debe llenar la matriz primero");
                    }
                    break;

                case 4://Sumar la diagonal principal
                    if (MatrizRellena) {

                        System.out.println("-----------------------------------");
                        System.out.println("Suma diagonal principal: " + Opcion4.SumarDiagonalPrincipal(array));
                        System.out.println("-----------------------------------");

                    } else {
                        System.out.println("----Antes de realizar esta accion, debe llenar la matriz primero----");
                    }
                    break;

                case 5://Sumar la diagonal inversa
                    if (MatrizRellena) {

                        System.out.println("-----------------------------------");
                        System.out.println("Suma diagonal inversa: " + Opcion5.SumarDiagonalInversa(array));
                        System.out.println("-----------------------------------");

                    } else {
                        System.out.println("----Antes de realizar esta accion, debe llenar la matriz primero----");
                    }
                    break;

                case 6://Media de todos los valores de la matriz
                    if (MatrizRellena) {

                        System.out.println("-----------------------------------");
                        System.out.println("Media de todos los valores de la matriz: " + Opcion6.CalcularMediaMatriz(array));
                        System.out.println("-----------------------------------");


                    } else {
                        System.out.println("----Antes de realizar esta accion, debe llenar la matriz primero----");
                    }
                    break;


                default:
                    System.out.println("------------------");
                    System.out.println(" Opción no válida ");
                    System.out.println("------------------");
            }
        } while (opcion != 7);


    }


    public static void Ejercicio5(Scanner sc) {
        /*
        Codifique la siguiente matriz de 2 dimensiones, que se corresponde a una máquina
        expendedora de golosinas donde la columna 1 es la golosina, la columna 2 el precio
        y la columna 3 la cantidad (stock) actual de golosinas
         */

        //crear un array bidimensional con los valores dados
        //primer columna:productos/golosinas
        //segunda columna: precio
        //tercer columna: stock disponible

        System.out.println("----- EJERCICIO 5 -----");

        String [][] MaquinaExpendedora = {

             //producto            //$   //stock
            {"KitKat"             ,"32"  ,"10"},
            {"Chicles"            ,"2"   ,"50"},
            {"Caramelos de Menta" ,"2"   ,"50"},
            {"Huevo kinder"       ,"25"  ,"10"},
            {"Chetoos"            ,"30"  ,"10"},
            {"Twix"               ,"26"  ,"10"},
            {"M&M'S"              ,"35"  ,"10"},
            {"Papas Lays"         ,"40"  ,"20"},
            {"Milkybar"           ,"30"  ,"10"},
            {"Alfajor Tofi"       ,"20"  ,"15"},
            {"Lata Coca"          ,"50"  ,"20"},
            {"Chitos"             ,"45"  ,"10"}

        };

        //variable ventas
        int TotalVentas = 0;
        //variable booleana para encender maquina
        boolean Encendido = true;


        //crear menu con las opciones dadas

        //variable para validar bucle
        int opc = 0;

        System.out.println("Encendiendo maquina...");

        while (Encendido){
            //menu
            System.out.println("-----MENU-----");
            System.out.println("1- Pedir golosina");
            System.out.println("2- Mostrar golosinas");
            System.out.println("3- Rellenar golosinas");
            System.out.println("4- Apagar maquina");
            opc = sc.nextInt();


            switch (opc){

                case 1:
                    //a. Pedir golosina: pedirá la posición de la golosina que quiera. Esta máquina
                    //tiene golosinas en cada posición, identificados por su fila y columna, que
                    //será lo que introduzca el usuario al pedir una golosina, por ejemplo si el
                    //usuario teclea 2 significa que está pidiendo la golosina que está en la fila 2.
                    //Al seleccionar una golosina debe disminuir la cantidad disponible de la
                    //golosina. En caso de agotar el stock de la golosina deberá informar de la
                    //situación al cliente y solicitarle que seleccione otra golosina.
                    System.out.println("Ingrese la posicion de la golosina: (0 a "+(MaquinaExpendedora.length - 1)+")");
                    int PosicionGolosina = sc.nextInt();

                    if (PosicionGolosina>=0 && PosicionGolosina<=(MaquinaExpendedora.length-1)){

                        //metodo
                        Opc1.PedirGolosina(MaquinaExpendedora,PosicionGolosina,TotalVentas);
                        TotalVentas = Opc1.PedirGolosina(MaquinaExpendedora,PosicionGolosina,TotalVentas);

                    }else {
                        System.out.println("Valor fuera de rango o no valido");
                    }
                    break;

                case 2:
                    //b. Mostrar golosinas: mostrara todas las golosinas con la cantidad actual
                    //disponible.
                    //metodo
                    Opc2.MostrarGolosinas(MaquinaExpendedora);
                    break;

                case 3:
                    //Rellenar golosinas: esta es una función exclusiva de un técnico por lo que
                    //para su ejecución nos pedirá una contraseña, si el usuario escribe
                    //“AdminXYZ” nos autorizara y pedirá la posición de la golosina y la cantidad a
                    //recargar. La cantidad ingresada se sumara a la cantidad actual existente

                    Opc3.RellenarStock(MaquinaExpendedora,sc);
                    break;

                case 4:
                    //Apagar maquina: sale del programa, antes de salir mostrara las ventas
                    //totales durante la ejecución del programa. Es decir la suma de todos los
                    //precios de las golosinas seleccionadas desde el inicio del programa.
                    Opc4.ApagarMaquina(TotalVentas);
                    Encendido = false;//apagamos maquina
                    break;

                default:
                    System.out.println("Opcion no valida");
            }

        }


    }

}