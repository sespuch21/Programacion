package com.company;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Estudiant extends Persona {
    //clase extendida de Persona

    private List<Double> notas =new ArrayList<Double>();

    public double obtenerNotaMaxima(List<Double> notas) {
        double max = 0;


        for(double str : this.notas) {
            if (str > max) {
                max = str;
            }
        }
        return max;
    }
    public double obtenerNotaMinima(List<Double> notas) {
        double min = this.notas.get(0);
        for(double str : this.notas) {
            if (str < min) {
                min = str;
            }
        }
        return min;
    }
    public double obtenerNotaMitjana(List<Double> notas) {
        double suma = 0;
        double medi;
        int size = notas.size();
        for(double str : this.notas) {
            suma += str;
            }
        medi = suma / size;

        return medi;

    }



    public Estudiant(){

    }
    public void posarNota (double nota) throws Exception {

        if (nota > 10) {
            throw new Exception("Nota invalida");
        } else if (nota < 0) {
            throw new Exception("Nota invalida");
        } else {
                this.notas.add(nota);

        }
    }
    public String obtenirDades() throws Exception {
        //datos de persona mas nota
        return super.obtenirDades() + " que te nota maxima de " + obtenerNotaMaxima(this.notas) + " Nota minima de  " + obtenerNotaMinima(this.notas) +" Nota Mitja " + String.format("%.3f", obtenerNotaMitjana(this.notas)) ;

    }

}
