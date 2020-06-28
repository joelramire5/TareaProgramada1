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
        Persona persona;
        persona= IngresarDatosPersona();

        pila1.push(persona);
        pila1.push(persona);



    }

    private static Persona IngresarDatosPersona() {
        Persona persona = new Persona();
        persona.setNombre(ui.obtenernombre());
        persona.setApellido(ui.obtenerapellido());
        persona.setFechadeNacimiento(ui.obtenerfechadenacimiento());
        persona.setEstatura(ui.obtenerEstatura());
        persona.setPeso(ui.obtenerPeso());

        return persona;

    }

}
