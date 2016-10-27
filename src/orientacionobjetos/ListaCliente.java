package orientacionobjetos;
import java.io.Serializable;
import java.util.ArrayList;

public class ListaCliente implements Serializable{
      private ArrayList<Cliente> lista;
    
    public ListaCliente(){
        lista = new ArrayList<>();
    }

    public ArrayList<Cliente> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Cliente> lista) {
        this.lista = lista;
    }
    
    
}
