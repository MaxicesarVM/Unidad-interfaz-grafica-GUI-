


package Modelo;

import java.util.TreeSet;


public class Supermercado {
       private TreeSet<Producto> listaProductos;

    public Supermercado() {
        this.listaProductos = new TreeSet<>();
    }

    public TreeSet<Producto> getListaProductos() {
        return listaProductos;
    }
       
       
}