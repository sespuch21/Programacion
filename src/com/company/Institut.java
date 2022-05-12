package com.company;

import java.util.ArrayList;

public class Institut {
    private String nom;
    private String profe;
    private String estudiant;

    public Institut(String nom){
        this.nom = nom;
    }

    public void afegirProfe(String profe) {
        this.profe = profe;

    }
    public void afegirEstudiant(String estudiant){
        this.estudiant = estudiant;
    }


    public String imprimirInformacio(){
        return "El Institut es diu: " + this.nom ;
    }
}
