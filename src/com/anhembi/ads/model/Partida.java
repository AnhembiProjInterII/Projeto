/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhembi.ads.model;

/**
 *
 * @author neto
 */
public class Partida {
    
    private Time timeMandante;
    private Time timeVisitante;
    
    private int golMandante;
    private int golVisitande;
    
    

    public Time getTimeMandante() {
        return timeMandante;
    }

    public void setTimeMandante(Time timeMandante) {
        this.timeMandante = timeMandante;
    }

    public Time getTimeVisitante() {
        return timeVisitante;
    }

    public void setTimeVisitante(Time timeVisitante) {
        this.timeVisitante = timeVisitante;
    }

    public int getGolMandante() {
        return golMandante;
    }

    public void setGolMandante(int golMandante) {
        this.golMandante = golMandante;
    }

    public int getGolVisitande() {
        return golVisitande;
    }

    public void setGolVisitande(int golVisitande) {
        this.golVisitande = golVisitande;
    }

    
    
    
}
