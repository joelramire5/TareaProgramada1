package cr.ac.ulead.tda;

import com.company.Persona;

import java.io.PrintStream;
import java.util.Scanner;

public class Pila1 {
Scanner input = new Scanner(System.in);
PrintStream output = new PrintStream(System.out);
Persona [] personas = new Persona[tamano()];
Persona person =new Persona();
int top=-1;
String nombre = input.nextLine(),Apellido,fechadeNacimiento;
String peso,estatura;

    public int tamano(){
        System.out.println("Ingrese el tamano de la Pila");
        int tamano = input.nextInt();
        return tamano;
    }

public void push(){
    if (top>=personas.length-1){
        System.out.println("La pila esta llena");
    }
    else {
        top+=1;
    System.out.println("Ingrese el Objeto persona");
        System.out.println("Ingrese el Nombre");
        nombre=input.nextLine();
        System.out.println("Ingrese el Apellido");
        Apellido=input.nextLine();
        System.out.println("Ingrese la fecha de Nacimiento");
        fechadeNacimiento=input.nextLine();
        System.out.println("Ingrese el Peso");
        peso=input.nextLine();
        System.out.println("Ingrese la Estatura");
        estatura=input.nextLine();

    personas[top]=new Persona(nombre, Apellido, fechadeNacimiento, peso, estatura);

    }
}

public void pop(){
    if(top==-1){
        output.println("La posicion esta vacia");
    }else {
        output.println("Se ha Eliminado un elemento de la Pila");
        personas[top]=null;
}
}

public void mostrarpila(){
for(int i=0;i<personas.length;i++){
    System.out.println("Datos de la pila: "+" ["+i+"] "+personas[i].getNombre()+" "+personas[i].getApellido()+" "+personas[i].getFechadeNacimiento()+" "+
            personas[i].getEstatura()+" "+personas[i].getPeso());
}
}
}
