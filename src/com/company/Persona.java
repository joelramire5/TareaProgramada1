package com.company;

import com.company.Interfaz.SerializadorUlead;

import java.io.PrintStream;
import java.util.Scanner;

public class Persona implements SerializadorUlead {

    private PrintStream output = new PrintStream(System.out);

    
    String nombre;
    String apellido;
    String fechadeNacimiento;
    Double peso;
    Double estatura;



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

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getEstatura() {
        return estatura;
    }
    public void setEstatura(Double estatura) {
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
