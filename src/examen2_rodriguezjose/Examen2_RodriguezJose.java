/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen2_rodriguezjose;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author david
 */
public class Examen2_RodriguezJose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        ArrayList<Productos> produ = new ArrayList();
        int exi = 1;

        while (exi == 1) {
            System.out.println("----Bienvenido al menu----");
            System.out.println("1.Agregar productos\n2.Buscar Productos\n3.Listar todos los productos\n4.Salir del programa");
            int opt = entrada.nextInt();
            switch (opt) {
                case 1: {
                    System.out.println("Ingresar productos: ");
                    Productos AgregarProduc = registrarProductos();
                    produ.add(AgregarProduc);
                    System.out.println("Producto registrado con exito");
                    System.out.println(produ);
                    System.out.println();

                    break;
                }
                case 2: {
                    System.out.println("---Buscar productos---");
                    System.out.println("(1)Buscar por codigo\n(2)Buscar por nombre");
                    int sel = entrada.nextInt();
                    if (sel == 1) {

                        BusquedaProductos1(produ);

                    } else if (sel == 2) {

                        BusquedaProductos2(produ);

                    } else {
                        System.out.println("Opccion no valida");
                        break;
                    }
                    break;
                }
                case 3: {
                    System.out.println("Productos Listados: ");
                    ListarProductos(produ);
                    break;
                }
                case 4: {
                    System.out.println("Saliendo....");
                    exi++;
                    break;
                }
            }
        }
    }

    public static Productos registrarProductos() {
        Scanner entrada = new Scanner(System.in);
        Random num = new Random();
        int identidad = num.nextInt(30);
        System.out.println("Ingrese el nombre del producto:");
        String NamPro = entrada.nextLine();
        System.out.println("Ingrese la cantidad: ");
        int cantidad = entrada.nextInt();
        System.out.println("Ingrese el precio: ");
        double precio = entrada.nextInt();
        System.out.println("Ingrese (1)Disponible o (0)agotado ");
        int estado = entrada.nextInt();
        boolean flag = true;
        if (estado == 1) {
            flag = true;
        } else if (estado == 0) {
            flag = false;
        }
        Productos AgregarProduc = new Productos(identidad, cantidad, NamPro, precio, flag);

        return AgregarProduc;

    }

    public static void BusquedaProductos1(ArrayList<Productos> produ) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el codigo: ");
        int identidad = entrada.nextInt();
        for (int i = 0; i < produ.size(); i++) {

            if (produ.get(i).getId() == identidad) {
                System.out.println("Datos del producto");
                System.out.println(produ);
            } else {
                System.out.println("No existe el producto");
            }
        }
        System.out.println();

    }

    public static void BusquedaProductos2(ArrayList<Productos> produ) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String name = entrada.nextLine();

        for (int i = 0; i < produ.size(); i++) {
            if (produ.get(i).getNombre().equalsIgnoreCase(name)) {
                System.out.println("Datos del producto");
                System.out.println(produ);
            } else {
                System.out.println("No existe el producto");
            }
        }
    }

    public static void ListarProductos(ArrayList<Productos> produ) {
        for (int i = 0; i < produ.size(); i++) {
            System.out.println(produ.get(i));
        }
    }

}
