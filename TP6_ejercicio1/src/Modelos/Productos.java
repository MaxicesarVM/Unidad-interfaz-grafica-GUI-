/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import java.util.ArrayList;

public class Productos {
    private ArrayList<String>categorias;
    private ArrayList<Producto>listaProductos;

    public Productos() {
        this.categorias = new ArrayList<>();
        this.listaProductos = new ArrayList<>();
    }

    public ArrayList<String> getCategorias() {
        return categorias;
    }

    public ArrayList<Producto> getListaProductos() {
        return listaProductos;
    }

    public void setCategorias(ArrayList<String> categorias) {
        this.categorias = categorias;
    }
    
    public void guardarProducto(Producto producto){
        listaProductos.add(producto);
    }
    
}
