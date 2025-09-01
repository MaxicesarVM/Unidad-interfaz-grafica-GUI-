
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
        //deberia ver si retorno las materias a las que se inscribio o ver si solo pide numero
       for(Materia mat : materiasInscripto){
           System.out.println(mat);
       }
        
    }
    
    /*
 Materia materia1 = new Materia(1, "Web 2", 2);
        Materia materia2 = new Materia(2, "Matematicas", 1);
        Materia materia3 = new Materia(3, "Laboratorio 1", 1);
        
        Alumno alumno1 = new Alumno(1001, "Martin", "Lopez");
        Alumno alumno2 = new Alumno(1002, "brenda", "martinez");
        
        alumno1.agregarMateria(materia1);
         alumno1.agregarMateria(materia2);
          alumno1.agregarMateria(materia3);
          
          alumno2.agregarMateria(materia1);
          alumno2.agregarMateria(materia2);
          alumno2.agregarMateria(materia3);
          alumno2.agregarMateria(materia3); //la consigna pide 2 veces creo?¡
          
          alumno1.mostrarMaterias();
          alumno2.mostrarMaterias();
          
*/
    
}
    
    
    
    

