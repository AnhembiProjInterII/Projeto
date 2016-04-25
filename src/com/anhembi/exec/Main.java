/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhembi.exec;

import com.anhembi.ads.model.*;
import com.anhembi.ads.service.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author neto
 */
public class Main {

    private static CampeonatoService campoonatoService;

    public static void main(String[] args) {

        Time time;
        List<Time> times = new ArrayList();

        Boolean timesAdicionados = false;
        Scanner sCanner = new Scanner(System.in);

        System.out.println("Inidicado.");

        //verifica se o campeonado foi Criado
        if (!campoonatoService.verificaCampeonatoIniciado()) {

            campoonatoService = new CampeonatoService();

            System.out.println("Digite o nome do campeonato.");

            Campeonato campeonato = new Campeonato();
            campeonato.setNome(sCanner.nextLine());

            System.out.println("Digite os times que farão parte do campeonato.");

            while (!timesAdicionados) {

                time = new Time();

                System.out.println("Digite o nome do time");
                time.setNome(sCanner.nextLine());
                System.out.println("Digite o nome da cidade");
                time.setCidade(sCanner.nextLine());

                times.add(time);

                System.out.println("Digite s para encerrar");

                if (sCanner.nextLine().equals("s")) {
                    timesAdicionados = true;
                }

            }

            //adiciona os times
            campeonato.setTimes(times);
            campeonato.setCampeonatoIniciado(true);
            
            campoonatoService.CriaCampeonato(campeonato);

            System.out.println("campeonato criado");

        } else {

            Campeonato campenato = campoonatoService.
            
        }
    }
}
