
package Modelo;

import java.util.HashSet;


public class Alumno {
    private int legajo;
    private String nombre;
    private String apellido;
    HashSet <Materia> materiasInscripto = new HashSet();

    public Alumno(int legajo, String nombre, String apellido) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public HashSet<Materia> getMateriasInscripto() {
        return materiasInscripto;
    }

    public void setMateriasInscripto(HashSet<Materia> materiasInscripto) {
        this.materiasInscripto = materiasInscripto;
    }
    
    
    public void agregarMateria(Materia mat){
        materiasInscripto.add(mat);
        
    }
    
    public void mostrarMaterias(){
       
       for(Materia mat : materiasInscripto){
           System.out.println(nombre + " :" + mat);
       }
        
    }
    
    
    
}
    
    
    
    

