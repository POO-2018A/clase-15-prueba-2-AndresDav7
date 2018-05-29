package prueba2;

import java.util.Arrays;
import java.util.Objects;

public class Estudiantes {

    private String nombre;
    private int edad;
    private Materia[] materias; 

    public Estudiantes(String nombre, int edad, Materia[] materias) {
        this.nombre = nombre;
        this.edad = edad;
        this.materias = materias;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Estudiantes other = (Estudiantes) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Arrays.deepEquals(this.materias, other.materias)) {
            return false;
        }
        return true;
    }
    
    

    @Override
    public String toString() {
        return "\nNombre : " + nombre + "\nEdad : " + edad + "\nMaterias : ";
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

        
   
}
