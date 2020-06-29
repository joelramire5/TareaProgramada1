package com.company.Ejecutables;

import com.company.Mascota;
import com.company.UIHelper;
import cr.ac.ulead.tda.Cola1;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main2B {
    PrintStream output = new PrintStream(System.out);
    Scanner input = new Scanner(System.in);

    static UIHelper ui = new UIHelper();


    public static void main(String[] args) throws IOException {
        PrintStream output = new PrintStream(System.out);
        Scanner input = new Scanner(System.in);
        Cola1 cola1=new Cola1(50);
        Mascota mascota = new Mascota();
        int opcion;

        do{

            output.println("Colas Circularres");
            output.println("Opcion 1: Insertar Cola");
            output.println("Opcion 2: Mostrar en turno");
            output.println("Opcion 3: Eliminar");
            output.println("Opcion 4:Salir");

           opcion=ui.opcion();

            switch (opcion){
                case 1:
                    if(cola1.colallena()) {
                        output.println("La cola Esta Llena");
                    }else{

                        cola1.insertar(IngresarDatosMascota());
                    }
                    break;

                case 2:
                    if(cola1.colavacia()) {
                        output.println("La cola esta vacia");
                    }else{
                        ui.mostrarmascotajson(cola1.eliminar());
                    }
                    break;
                case 3:
                    output.println("El programa ha salido con exito");
                    System.exit(1);
                default:
                    output.println("Opcion Invalida");

            }
        } while(opcion!=3);

    }
    static Mascota IngresarDatosMascota(){
        Mascota mascota = new Mascota();
        mascota.setNombre(ui.obtenernombremascota());
        mascota.setTipoAnimal(ui.obtenertipomascota());
        mascota.setEdad(ui.obteneredadmascota());
        return mascota;
    }
    }
