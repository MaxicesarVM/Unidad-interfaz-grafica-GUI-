/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
