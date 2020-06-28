package cr.ac.ulead.tda;


import com.company.Persona;

import java.io.PrintStream;
import java.util.Scanner;

public class Pila1 {
    Scanner input = new Scanner(System.in);
    PrintStream output = new PrintStream(System.out);
    Persona[] pilapersonas;
    Persona[] pilaaux;
    Persona person = new Persona();
    int top = 0;
    int tamanopila;
    int topaux;


    public Pila1(int tamano){
        this.tamanopila=tamano;
        pilapersonas=new Persona[tamano];
        pilaaux=new Persona[tamano];
    }

    public void push(Persona persona) {
        if (pilallena()) {
            System.out.println("La pila esta llena");
        } else {

            pilapersonas[top] = persona;
            top++;
            if(pilaauxvacia()) {
                pilaaux[topaux] = persona;
                topaux++;
            }else{
                if(persona.getEstatura()<=pilaaux[topaux-1].getEstatura()){
                    pilaaux[topaux]=persona;
                    topaux++;
                }
            }
        }
    }

    public Persona pop(Persona persona) {
        if (pilavacia()) {
            output.println("La Pila esta vacia");
        } else {
            pilapersonas[top]=null;
            top=top-1;
            output.println("Se ha Eliminado un elemento de la Pila");
            if(pilapersonas[top].getEstatura()==pilaaux[topaux-1].getEstatura()){
                pilaaux[topaux]=null;
                topaux=topaux-1;
            }


        }
        return pilapersonas[top];
    }

    public void mostrarpila() {
        for (int i = 0; i < pilapersonas.length && pilapersonas[i] != null; i++) {
            System.out.println("Datos de la pila: " + " [" + i + "] " + pilapersonas[i].getNombre() + " " + pilapersonas[i].getApellido() + " " + pilapersonas[i].getFechadeNacimiento() + " " +
                    pilapersonas[i].getEstatura() + " " + pilapersonas[i].getPeso());
        }
    }

    public boolean pilallena(){
        if (this.top>tamanopila-1) {
            return true;
        } else{
            return false;
            }
        }
    public boolean pilaauxllena(){
        if (this.top>tamanopila-1) {
            return true;
        } else{
            return false;
        }
    }

        public boolean pilaauxvacia(){

        if(this.topaux==0) {
            return true;
        }else{
            return false;
        }
        
        }

    public boolean pilavacia(){

        if(this.top==0) {
            return true;
        }else{
            return false;
        }
    }

    public void mostrarpilaaux(){
        System.out.println("La edad menor es :"+pilaaux[topaux].getEstatura() );
    }

}


