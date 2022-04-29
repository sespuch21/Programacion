package com.company;

public class Persona {
    //atributos siempre privados
    private String nom;
    private String dni;

    // funciones publicas o privadas

    public Persona () {
        //constructores
        // System out
    }
    public void canviarNom(String nom){
        this.nom = nom;

    }
    public void canviarDni(String dni) throws Exception{
        if (this.dni == null) {
            this.dni = dni;
        } else {
            throw new Exception("Error No se puede cambiar Dni");
        }



    }
    // Funcion retornar el nom i dni
    public String obtenirDades() throws Exception{
        if(dni == null || nom == null ) {
            throw new Exception("Error al obtener los datos");
        }
        return "Persona que es diu " + nom + " Amb dni:" + dni;
    }
}