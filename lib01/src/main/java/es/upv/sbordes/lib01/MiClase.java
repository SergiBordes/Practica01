package es.upv.sbordes.lib01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class MiClase {

    public static void main(String[] args) {

        ArrayList<Persona> p = new ArrayList<>();
        p.add(new Persona("Sergi", 20));
        p.add(new Profesor("Andres", 45, "IOT"));
        p.add(new Alumno("Sergi", 20, 0));

        for (Persona x:p){

            x.mostrar();

        }
// prueba
        /*
        Random r = new Random();
        r.nextDouble();

        ArrayList<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            lista.add(r.nextInt());
        }

        System.out.println("Lista desordenada: ");
        System.out.println(lista);

        Collections.sort(lista);

        //Ordenamos la lista

        int sol= lista.get(0);

        for (int i = 0; i < lista.size(); i++){
            if (sol >= lista.get(i)){
                sol = lista.get(i);
            }
        }

        System.out.println("Solucion: ");
        System.out.println(sol);
        */


        /* PRUEBAS

         //CON ARRAYS BASICOS
        String a[] = {"Hola", "mundo"};

        for (int i = 0; i<a.length; i++){
            System.out.println(a[i]);
        }

        for (String x:a){               //Versión corta del FOR
            System.out.println(x);
        }

         // CON ARRAYLIST
        ArrayList<String> b = new ArrayList<>();
        b.add("HOLA");
        b.add("MUNDO!");

        for (int i = 0; i<b.size(); i++){  // Añadir <> delante y detras de cada palabra.
            String n = "<" + b.get(i) + ">";
            b.set(i,n);
        }

        System.out.println(b);
         */


    }

}
