
package tp7;

import java.util.HashSet;


public class Materia {
    private int idMateria;
    private String nombre;
    private int anio;
    //HashSet <Materia> materias = new HashSet <>();

    public Materia(int idMateria, String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Materia){
            Materia materia2 = (Materia)obj;
            if(this.idMateria==materia2.idMateria){
                return true;
            }
            else{
                return false;
            }
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
