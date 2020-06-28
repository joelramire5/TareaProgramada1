package com.company;

import java.io.*;
import java.util.Scanner;

public class UIHelper {
    public PrintStream output = new PrintStream(System.out);
    public Scanner input = new Scanner(System.in);
    Persona persona = new Persona();
    Mascota mascota = new Mascota();

    Persona[] pilapersonas = new Persona[2];



    public void menuprincipal() {
        output.println("Serializador de Objetos");
        output.println("Selecciona si desea serializar un objeto Persona o Mascota: ");
        output.println("Opcion 1: Persona");
        output.println("Opcion 2: Mascota");
        output.println("Opcion 3: Salir");

    }

    public void opcionmenuprincipal() {

      int opcion;



        do {
            this.menuprincipal();
            opcion = input.nextInt();
            input.skip("[\r\n]");


            switch (opcion) {
                case 1:

                    this.opcionmenusecundariopersona();
                    break;
                case 2:
                    mascota.IngresarDatosMascota();
                    this.opcionmenusecundariomascota();
                    break;
                case 3:
                    output.println("El programa finalizo");
                    break;
                default:
                    output.println("Ingrese una opcion valida");


            }

        } while (opcion != 3);
    }

    public void menuserializador() {
        output.println("Ingrese una opcion para serializar en XML o JSON");
        output.println("1: JSON");
        output.println("2. XML");
        output.println("3. Volver a seleccionar");
    }

    public void opcionmenusecundariopersona() {

        int opcion;
        do {
            this.menuserializador();
            opcion = input.nextInt();
            input.skip("[\r\n]");

            switch (opcion) {
                case 1:
                    output.println(persona.SerializadorJson());
                    break;
                case 2:
                    output.println(persona.SerializadorXML());
                    break;
                case 3:
                    this.opcionmenusecundariopersona();
                    break;
                default:
                    output.println("Ingrese una opcion valida");
            }


        }while (opcion != 4) ;
    }
    public void opcionmenusecundariomascota() {

        int opcion;
        do {
            this.menuserializador();
            opcion = input.nextInt();
            input.skip("[\r\n]");

            switch (opcion) {
                case 1:
                    output.println(mascota.SerializadorJson());
                    break;
                case 2:
                    output.println(mascota.SerializadorXML());
                    break;
                case 3:
                    this.opcionmenusecundariomascota();

                default:
                    output.println("Ingrese una opcion valida");
            }

        }while (opcion != 4) ;
    }
    public String obtenernombre(){
        output.println("Introduzca el Nombre ");
        return input.nextLine();
    }

    public String obtenerapellido(){
        output.println("Introduzca el Apellido ");
        return input.nextLine();
    }

    public String obtenerfechadenacimiento(){
        output.println("Introduzca la Fecha de Nacimiento: ");
        return input.nextLine();
    }

    public Double obtenerPeso(){
        output.println("Introduzca el Peso: ");
        return input.nextDouble();
    }

    public Double obtenerEstatura(){
        output.println("Introduzca el Estatura: ");
        return input.nextDouble();
    }

    public String obtenernombremascota(){
        output.println("Introduzca el nombre de la Mascota");
        return input.nextLine();
    }

    public String obtenertipomascota(){
        output.println("Introduzca el nombre de la Mascota");
        return input.nextLine();
    }

    public int obteneredadmascota(){
        output.println("Introduzca la edad de la Mascota");
        return input.nextInt();
    }




}
