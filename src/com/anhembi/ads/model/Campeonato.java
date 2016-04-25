/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhembi.ads.model;

import java.util.List;

/**
 *
 * @author neto
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
