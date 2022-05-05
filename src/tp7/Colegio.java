
package tp7;


public class Colegio {

    
    public static void main(String[] args) {
        
       Materia ingles = new Materia(1,"Ingles",1);
       Materia matematicas= new Materia(2,"Matematicas",1);
       Materia laboratorio= new Materia(3,"Laboratorio",1);
       
       Alumno a1= new Alumno(1001,"Lopez","Martin");
       Alumno a2= new Alumno(1002,"Martínez", "Brenda");
       a1.agregarMateria(ingles);
       a1.agregarMateria(matematicas);
       a1.agregarMateria(laboratorio);
       
    }
    
}
