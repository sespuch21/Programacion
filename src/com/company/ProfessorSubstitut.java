package com.company;

import java.util.Date;

public class ProfessorSubstitut extends Professor {
    private Date dataInici;
    private Date dataFi;

    public void ProfessorSubstitut(){

    }

    public void assignarSubstitucio(Date dataFi, Date dataInici){
        this.dataInici = dataInici;
        this.dataFi = dataFi;

    }


    public String obtenirDades() throws Exception {
        return super.obtenirDades() + " Data Inici:" + dataInici + " Data final:" + dataFi;
    }

}