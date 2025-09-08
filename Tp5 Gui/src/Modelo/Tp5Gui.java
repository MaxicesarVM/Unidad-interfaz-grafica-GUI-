
package Modelo;

import java.util.Iterator;


public class Tp5Gui {

    
    public static void main(String[] args) {
        
        Contacto contacto1 = new Contacto("12345678", "Juan", "Pérez", "Buenos Aires", "Av. Siempre Viva 742");
        Contacto contacto2 = new Contacto("87654321", "María", "Gómez", "Córdoba", "Calle Falsa 123");
        Contacto contacto3 = new Contacto("11223344", "Carlos", "Rodríguez", "Rosario", "San Martín 456");
        
        DirectorioTelefonico dr = new DirectorioTelefonico();
        
        
        
        dr.agregarContacto(Long.valueOf("123456"), contacto1);
        dr.agregarContacto(Long.valueOf("1124124"), contacto2);
        dr.agregarContacto(Long.valueOf("24124124"), contacto3);
        
        dr.mostrarContactos();
        System.out.println("--------");
        
        dr.borrarContacto(Long.valueOf("123456"));
        System.out.println(dr.buscarContacto(Long.valueOf("1124124")));
        System.out.println(dr.buscarContactosCiudad("Córdoba"));
        System.out.println(dr.buscarTelefono("Rodríguez"));
        
        
        System.out.println("--------");
        dr.mostrarContactos();
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
