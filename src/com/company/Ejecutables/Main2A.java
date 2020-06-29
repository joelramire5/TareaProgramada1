package com.company.Ejecutables;

import com.company.Persona;
import com.company.UIHelper;
import cr.ac.ulead.tda.Pila1;

import java.io.IOException;

public class Main2A {
    Persona persona = new Persona();
    static UIHelper ui = new UIHelper();


    public static void main(String[] args) throws IOException {
        Pila1 pila1 = new Pila1(50);
        Persona persona = new Persona();
        int opcion;

        do {
            System.out.println("Menu de Pila");
            System.out.println("Opcion 1: Push");
            System.out.println("Opcion 1: Pop");
            opcion=ui.opcion();

            switch (opcion){
                case 1:
                    persona= IngresarDatosPersona();
                    pila1.push(persona);
                    break;
                case 2:
                    pila1.pop(persona);
                    pila1.mostrarpilaaux();

                    break;

                case 3:
                   System.out.println("El programa ha salido con exito");
                    System.exit(1);
                default:
                   System.out.println("Opcion Invalida");

            }

        } while(opcion!=3);



    }

    public static Persona IngresarDatosPersona() {
        Persona persona = new Persona();
        persona.setNombre(ui.obtenernombre());
        persona.setApellido(ui.obtenerapellido());
        persona.setFechadeNacimiento(ui.obtenerfechadenacimiento());
        persona.setEstatura(ui.obtenerEstatura());
        persona.setPeso(ui.obtenerPeso());

        return persona;

    }



}
