
package Modelo;


public class Materia {
    private int idMateria;
    private String nombreMateria;
    private int anio;

    public Materia(int idMateria, String nombreMateria, int anio) {
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public String toString() {
        return "Materia inscripta [" + "id Materia= " + idMateria + ", nombre Materia= " + nombreMateria + ",  " + anio +" anio" + ']';
    }
    
    
    
    
}
