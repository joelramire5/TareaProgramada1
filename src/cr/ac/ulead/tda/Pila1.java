package cr.ac.ulead.tda;

import com.company.Persona;

import java.io.PrintStream;
import java.util.Scanner;

public class Pila1 {
    Scanner input = new Scanner(System.in);
    PrintStream output = new PrintStream(System.out);
    Persona[] personas = new Persona[tamano()];
    Persona person = new Persona();
    int top = -1;
    Double Temporal;

    public int tamano() {
        System.out.println("Ingrese el tamano de la Pila");
        int tamano = input.nextInt();
        return tamano;
    }

    public void push() {
        if (top >= personas.length - 1) {
            System.out.println("La pila esta llena");
        } else {
            top += 1;
            person.IngresarDatosPersona();

            personas[top] = new Persona(person.getNombre(),person.getEstatura(),person.getFechadeNacimiento(),
                    person.getPeso(),person.getEstatura());

        }
    }

    public void pop() {
        if (top == -1) {
            output.println("La posicion esta vacia");
        } else {
            output.println("Se ha Eliminado un elemento de la Pila");
            personas[top] = null;
        }
    }

    public void mostrarpila() {
        for (int i = 0; i < personas.length && personas[i] != null; i++) {
            System.out.println("Datos de la pila: " + " [" + i + "] " + personas[i].getNombre() + " " + personas[i].getApellido() + " " + personas[i].getFechadeNacimiento() + " " +
                    personas[i].getEstatura() + " " + personas[i].getPeso());
        }
    }

    public void menorestatura() {
        Double menor =150.0;
        if (Temporal < menor ) {
            menor = Temporal;
            output.println(menor);

        }
    }
}
