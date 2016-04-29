package com.anhembi.ads.model;

/**
 * @author Gustavo Martins Oliveira - RA 20706520
 * @author Gustavo Soares Handa - RA 20856177
 * @author Norberto Ferreira dos Santos Neto - RA 20735810
 * @author Rodrigo Fabiano - 20585554
 * @author Rodrigo Ferreira Bravo - 20742535
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
