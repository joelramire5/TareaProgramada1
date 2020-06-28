package com.company.Ejecutables;

import com.company.Mascota;
import com.company.UIHelper;
import cr.ac.ulead.tda.Cola1;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Main2B {
    private PrintStream output = new PrintStream(System.out);
    private Scanner input = new Scanner(System.in);
    Mascota mascota = new Mascota();
    static UIHelper ui = new UIHelper();
    Cola1 cola1 =new Cola1(50);

    public void IngresarDatosMascota(){
    mascota.setNombre(ui.obtenernombremascota());
    mascota.setTipoAnimal(ui.obtenertipomascota());
    mascota.setEdad(ui.obteneredadmascota());
    }

    public static void main(String[] args) throws IOException {


    }
    }
