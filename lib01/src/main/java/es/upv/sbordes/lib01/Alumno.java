package es.upv.sbordes.lib01;

public class Alumno extends Persona {
    int suspensos;
    public Alumno (String nombre, int edad, int suspensos){
        super (nombre, edad);
        this.suspensos = suspensos;
    }
    public void mostrar () {
        System.out.println("Me llamo: " +nombre+ " y he suspendido " +suspensos+ " asignaturas.");
    }
}
