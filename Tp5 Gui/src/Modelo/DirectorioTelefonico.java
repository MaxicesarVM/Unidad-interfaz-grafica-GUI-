package Modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DirectorioTelefonico {

    TreeMap<Long, Contacto> directorio = new TreeMap();

    public DirectorioTelefonico() {
    }

    public TreeMap<Long, Contacto> getDirectorio() {
        return directorio;
    }
    
   
    

    public void setDirectorio(TreeMap<Long, Contacto> directorio) {
        this.directorio = directorio;
    }

    @Override
    public String toString() {
        return "DirectorioTelefonico{" + "directorio=" + directorio + '}';
    }

    public void agregarContacto(Long telefono, Contacto contacto) {

        directorio.put(telefono, contacto);

    }

    public Contacto buscarContacto(Long telefono) {

        return directorio.get(telefono);

    }

    public Set<Long> buscarTelefono(String apellido) {

        Set<Long> resultado = new TreeSet<>();
        for (Map.Entry<Long, Contacto> entry : directorio.entrySet()) {
            if (entry.getValue().getApellido().equalsIgnoreCase(apellido)) {
                resultado.add(entry.getKey());
            }
        }
        return resultado;
    }

    public ArrayList<Contacto> buscarContactosCiudad(String ciudad) {

        ArrayList<Contacto> resultadoCiudad = new ArrayList();

        for (Contacto contactoRecorrido : directorio.values()) {

            if (contactoRecorrido.getCiudad().equalsIgnoreCase(ciudad)) {
                resultadoCiudad.add(contactoRecorrido);
            }

        }

        return resultadoCiudad;

    }

    public void borrarContacto(Long telefono) {

        
        Iterator<Map.Entry<Long, Contacto>> it = directorio.entrySet().iterator();

        while (it.hasNext()) {

            if (it.next().getKey().equals(telefono)) {
                it.remove();
            }

        }

        
        
        
        
    }

    
    
    public void mostrarContactos() {

        for (Map.Entry<Long, Contacto> entry : directorio.entrySet()) {
            Long key = entry.getKey();
            Contacto value = entry.getValue();
            System.out.println(key + " " + value);
        }

    }

}
