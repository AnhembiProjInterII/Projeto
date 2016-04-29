package com.anhembi.ads.model;

import java.util.List;

/**
 * @author Gustavo Martins Oliveira - RA 20706520
 * @author Gustavo Soares Handa - RA 20856177
 * @author Norberto Ferreira dos Santos Neto - RA 20735810
 * @author Rodrigo Fabiano - 20585554
 * @author Rodrigo Ferreira Bravo - 20742535
 */
public class Campeonato {

    private String nome;
    private List<Partida> partidas;
    private List<Time> times;

    //após iniciado, os times e jogos não podem ser adicionados.
    //somente os jogos podem ser manipulados, mas não excluídos.
    private Boolean campeonatoIniciado;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Partida> getPartidas() {
        return partidas;
    }

    public void setPartidas(List<Partida> partidas) {
        this.partidas = partidas;
    }

    public List<Time> getTimes() {
        return times;
    }

    public void setTimes(List<Time> times) {
        this.times = times;
    }

    public Boolean getCampeonatoIniciado() {
        return campeonatoIniciado;
    }

    public void setCampeonatoIniciado(Boolean campeonatoIniciado) {
        this.campeonatoIniciado = campeonatoIniciado;
    }
}
