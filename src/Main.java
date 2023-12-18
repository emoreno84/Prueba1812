import java.util.Scanner;
import java.util.ArrayList;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int opcion = 0;
        String id;
        String tipo;
        double precio;
        String modelo;
        Scanner sc = new Scanner(System.in);
        ArrayList<Producto> listadoProductos;
        ArrayList<Producto>[] listaAlmacenes = new ArrayList[3];
        int tamanyoAlmacenes[];
        tamanyoAlmacenes = new int[3];

        listadoProductos = new ArrayList<Producto>();

        while (true){
            System.out.println("Elija una opción:");
            System.out.println(" + 1) Crear producto");
            System.out.println(" + 2) Buscar producto");
            System.out.println(" + 3) Salir");

            opcion = Integer.parseInt(sc.nextLine());

            if (opcion == 1){ // Crea producto
                System.out.println("Introduzca un id:");
                id = sc.nextLine();
                System.out.println("Introduzca un tipo:");
                tipo = sc.nextLine();
                System.out.println("Introduzca un modelo:");
                modelo = sc.nextLine();
                System.out.println("Introduzca un precio:");
                precio = Double.parseDouble(sc.nextLine());

                Producto nuevoProducto = new Producto(id,tipo, precio, modelo);
                int min;
                int i = 0;
                while (i <= 3){

                }
                for (ArrayList<Producto> almacen: listaAlmacenes){


                }

            } else if (opcion == 2) {
                Boolean encontrado = false;
                System.out.println("Introduzca un id para buscar:");
                id = sc.nextLine();
                for (Producto prod: listadoProductos){
                    if (id.equals(prod.id)){
                        System.out.println("********************************");
                        System.out.println("**** PRODUCTO ENCONTRADO *******");
                        System.out.println("ID: " + prod.id);
                        System.out.println("TIPO: " + prod.tipo);
                        System.out.println("PRECIO: " + prod.precio);
                        System.out.println("MODELO: " + prod.modelo);
                        System.out.println("********************************");
                        encontrado = true;
                    }
                }
                System.out.println("***********************************");
                System.out.println("**** PRODUCTO NO ENCONTRADO *******");
                System.out.println("***********************************");
            } else if (opcion == 3) {
                System.out.println("Adios...");
                break;
            }
        }
    }
}