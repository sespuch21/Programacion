package com.company;

import java.util.ArrayList;

public class Institut {
    private String nom;
    //public ArrayList <Persona> profe;
    private String profe;
    private String estudiant;

    public Institut(String nom){
        this.nom = nom;
        System.out.println(nom);
    }

    public void afegirProfe(String profe) {
        this.profe = profe;

    }
    public void afegirEstudiant(){

    }


    public String imprimirInformacio(){
        return "El Professor es diu " + this.profe ;
    }
}
