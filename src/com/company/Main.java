package com.company;

import java.lang.reflect.Array;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws Exception {

        Institut ins = new Institut("La Guineueta");

        Persona p1 = new Persona(); //instancia
        Persona p2 = new Persona();

        p1.canviarNom("75247845G");
        p1.canviarDni("46419312F");
        String dades = p1.obtenirDades();
        System.out.println(dades);

        Estudiant e = new Estudiant();
        e.posarNota(1);
        e.posarNota(9);
        e.posarNota(4);
        e.posarNota(6);
        e.posarNota(8);
        e.posarNota(5);
        e.posarNota(4);
        // e.posarNota(-2);
        e.canviarNom("Manuel");
        e.canviarDni("64446288R");
        dades = e.obtenirDades();
        System.out.println(dades);

        Professor p = new Professor();
        p.canviarSou(2000);
        //p.canviarSou(-2000);
        //p.canviarSou(6000);
        p.canviarNom("Marc");
        p.canviarDni("85567651T");
        dades = p.obtenirDades();
        System.out.println(dades);

        ProfessorSubstitut ps = new ProfessorSubstitut();
        Date dataInici = new Date(2021, 11, 1);
        Date dataFi = new Date(2022, 6, 30);
        ps.assignarSubstitucio(dataInici ,dataFi);
        ps.canviarSou(2000);
        ps.canviarDni("58725823F");
        ps.canviarNom("Nil");

        ps.obtenirDades();
        dades = ps.obtenirDades();
        System.out.println(dades);



    }
}