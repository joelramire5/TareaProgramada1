package com.company;

import com.company.Interfaz.SerializadorUlead;

import java.io.PrintStream;
import java.util.Scanner;

public class Mascota implements SerializadorUlead {
    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);

    String nombre;
    String tipoAnimal;
    int Edad;

    public void IngresarDatosMascota(){
        output.println("Ingrese los datos de Mascota");
        output.println("Ingrese el nombre de la mascota");
        nombre= input.nextLine();
        output.println("Ingrese el tipo de Animal");
        tipoAnimal=input.nextLine();
        output.println("Ingrese la edad de "+nombre);
        Edad= input.nextInt();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    @Override
    public String SerializadorJson() {
        return "{Nombre: "+getNombre()+", Edad: "+getEdad()+", TipodeAnimal: "+getTipoAnimal();
    }

    @Override
    public String SerializadorXML() {
        return "<Mascota> \n"+"<Nombre>"+getNombre()+"<Nombre>\n"+"<Edad>"+getEdad()+"<Edad\n>"+
                "<TipodeAnimal>"+getTipoAnimal()+"<TipodeAnimal\n>"+"<Mascota>";
    }
}
