package com.company;

import com.company.Interfaz.SerializadorUlead;

import java.io.PrintStream;
import java.util.Scanner;

public class Persona implements SerializadorUlead {

    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);




    String nombre;
    String apellido;
    String fechadeNacimiento;
    String peso;
    String estatura;

    public Persona(String nombre, String apellido, String fechadeNacimiento, String peso, String estatura) {
        this.nombre=nombre;
        this.apellido=apellido;
        this.fechadeNacimiento=fechadeNacimiento;
        this.estatura=estatura;
        this.peso=peso;

    }

    public Persona() {

    }


    public void IngresarDatosPersona(){
        output.println("Ingrese los datos de Persona");
        output.println("Ingrese el Nombre");
        nombre = input.nextLine();
        output.println("Ingrese el Apellido");
        apellido=input.nextLine();
        output.println("Ingrese la fecha de Nacimiento");
        fechadeNacimiento= input.nextLine();
        output.println("Ingrese el Peso");
        peso=input.nextLine();
        output.println("Ingrese la Estatura");
        estatura=input.nextLine();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getFechadeNacimiento() {
        return fechadeNacimiento;
    }

    public void setFechadeNacimiento(String fechadeNacimiento) {
        this.fechadeNacimiento = fechadeNacimiento;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getEstatura() {
        return estatura;
    }

    public void setEstatura(String estatura) {
        this.estatura = estatura;
    }

    @Override
    public String SerializadorJson() {

        return "{Nombre: "+getNombre()+", Apellido: "+getApellido()+ ", FechadeNacimiento: "+ getFechadeNacimiento()+
                ", Estatura: "+getEstatura()+", Peso: "+getPeso()+"}";

    }

    @Override
    public String SerializadorXML() {
        return "<Persona> \n"+"<Nombre>"+getNombre()+"<Nombre>\n"+"<Apellido>"+getApellido()+"<Apellido\n>"+"<FechadeNacimiento>"+getFechadeNacimiento()+"<FechadeNacimiento\n>"+
        "<Estatura>"+getEstatura()+"<Estatura>\n"+"<Peso>"+getPeso()+"<Peso>\n"+"<Persona>";
    }
}
