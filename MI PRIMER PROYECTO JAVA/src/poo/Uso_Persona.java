package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

    public static void main(String[] args) {
        Persona[] lasPersonas = new Persona[2];

        lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2009, 2, 25);
        lasPersonas[1] = new Alumno("Ana Lopez", "Biología");

        for (Persona p: lasPersonas) {
            System.out.println(p.dameDescripcion());
        }
    }
}

abstract class Persona {
    private String nombre;

    public Persona(String nom) {
        nombre = nom;
    }

    public abstract String dameDescripcion();
}

class Empleado2 extends Persona {
    private double sueldo;
    private Date altaContrato;
    private static int IdSiguiente = 0;
    private int Id;

    public Empleado2(String nom, double sue, int agno, int mes, int dia) {
        super(nom);
        sueldo = sue;
        GregorianCalendar calendario = new GregorianCalendar(agno, mes - 1, dia);
        altaContrato = calendario.getTime();
        Id = IdSiguiente++; // Increment after assigning
    }

    public String dameDescripcion() {
        return "Este empleado tiene un Id = " + Id + " con un sueldo = " + sueldo;
    }
}

class Alumno extends Persona {
    private String carrera;

    public Alumno(String nom, String car) {
        super(nom);
        carrera = car;
    }

    public String dameDescripcion() {
        return "Este alumno está estudiando la carrera de " + carrera;
    }
}