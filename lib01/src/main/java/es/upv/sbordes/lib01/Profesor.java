package es.upv.sbordes.lib01;

public class Profesor extends Persona {
    String asignatura;
    public Profesor (String nombre, int edad, String asignatura){
        super (nombre, edad);
        this.asignatura = asignatura;
    }
    public void mostrar () {
        System.out.println("Me llamo: " +nombre+ " y doy la asig. " +asignatura+ ".");
    }
}
