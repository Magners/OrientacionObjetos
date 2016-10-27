/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacionobjetos;
import java.io.Serializable;
import tools.Fichero;
import tools.InputData;
import java.util.ArrayList;
/**
 *
 * @author magner
 */
public class OrientacionObjetos implements Serializable{

    //List Clientes
    private static Cliente listaClientes;
    //variable donde guardaremos los datos (fichero)
    private static Fichero Clientes;
    
    public static void main(String[] args) {
         // Inicializamos el nombre del fichero
        Clientes = new Fichero(".xml");
        // Cargamos los datos del fichero
        listaClientes = (Cliente) Clientes.leer();
        // Si no había fichero, inicializo la lista vacía
        if (listaClientes == null) {
            listaClientes = new Cliente();
        }
    
    int opcion;
        do{
            mostrarMenu();
            opcion = InputData.pedirEntero("Escoge una opción");
            switch (opcion) {
                case 1:
                    altaCliente();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 0:
                    System.out.println("Hasta luego!!");
                    break;
                default:
                    System.out.println("Opción incorrecta");
            }
        } while (opcion != 0);
    }
    private static void mostrarMenu() {
        System.out.println("*** GESTION CLIENTES ***");
        System.out.println("1. Alta Cliente");
        System.out.println("2. Nuevo Presupuesto");
        System.out.println("3. Presupuestes pendientes (de aceptar o rechazar)");
        System.out.println("4. Listado presupuestos de un cliente determinado");
        System.out.println("5. Listado de presupuestos rechazados");
        System.out.println("6. Listado de clientes, con total de presupuestos");
        System.out.println("7. Cambiar estado presupuesto");
        System.out.println("0. Salir");
    }
    private static void altaCliente(){
        
    }
}

    

