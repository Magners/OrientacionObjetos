/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacionobjetos;
import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author magner
 */
public class ListaPresupuestos implements Serializable{
    
    public ArrayList<Presupuesto> listaPres;
    
    public ListaPresupuestos(){
        listaPres = new ArrayList<>();
    }

    public ArrayList<Presupuesto> getLista() {
        return listaPres;
    }

    public void setLista(ArrayList<Presupuesto> lista) {
        this.listaPres = lista;
    }  
}
