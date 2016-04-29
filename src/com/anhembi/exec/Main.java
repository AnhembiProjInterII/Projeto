package com.anhembi.exec;

import com.anhembi.ads.model.*;
import com.anhembi.ads.service.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Gustavo Martins Oliveira - RA 20706520
 * @author Gustavo Soares Handa - RA 20856177
 * @author Norberto Ferreira dos Santos Neto - RA 20735810
 * @author Rodrigo Fabiano - 20585554
 * @author Rodrigo Ferreira Bravo - 20742535
 */
public class Main {

    private static CampeonatoService campeonatoService;
    
    private static int menu;
    
    private static Campeonato campeonato;

    public static void main(String[] args) {
        
        
        do{
            String entrada;
            Scanner scan = new Scanner(System.in);
            
            System.out.println("-----------------------------");
            System.out.println("MENU - Campeonado de Futebol ");
            System.out.println("1. Cadastrar Time            ");
            System.out.println("2. Cadastrar Partida         ");
            System.out.println("3. Listar Partidas           ");
            System.out.println("4. Dados do Time             ");
            System.out.println("5. Sair                      ");
            System.out.println("-----------------------------");
            
            entrada = scan.nextLine().trim();
            
            if(!isInt(entrada)) {
                entrada = "-1";
                System.out.println("Informação errada, informe número de 1 a 4\n\n");
            }
            
            menu = Integer.parseInt(entrada);
            
            switch (menu) {
                case 1:
                    List<Time> times = new ArrayList();
                    String saida = "s";
                    
                    //verifica se o campeonado foi Criado
                    if (!campeonatoService.verificaCampeonatoCriado()) {

                        campeonatoService = new CampeonatoService();

                        System.out.println("Digite o nome do campeonato:");
                        entrada = scan.nextLine().trim();

                        campeonato = new Campeonato();
                        campeonato.setNome(entrada);
                    }
                    do {
                        Time time = new Time();
                        
                        System.out.println("Qual o nome do time?");
                        entrada = scan.nextLine().trim();
                        
                        time.setNome(entrada);
                        
                        System.out.println("Qual a cidade do time?");
                        entrada = scan.nextLine().trim();
                        
                        time.setCidade(entrada);
                        
                        times.add(time);
                        
                        System.out.println("Deseja cadastrar outro time (S/N)?");
                        saida = scan.nextLine().trim();
                    } while (!("n").equalsIgnoreCase(saida));
                    
                    //adiciona os times
                    campeonato.setTimes(times);
                    campeonato.setCampeonatoIniciado(true);

                    campeonatoService.CriaCampeonato(campeonato);
                    break;
                case 2:
                    List<Partida> partidas = new ArrayList();
                    int numTime = -1;
                    int numGol = 0;
                    saida = "s";
                    
                    System.out.println("Times cadastrados:");
                    for (int i = 0; i < campeonato.getTimes().size(); i++) {
                        Time time = campeonato.getTimes().get(i);
                        System.out.println(i + " - " + time.getNome());
                    }
                    do {
                        try {
                            Partida partida = new Partida();
                            
                            System.out.println("Digite o número correspondente ao time mandante:");
                            entrada = scan.nextLine().trim();

                            if(!isInt(entrada)) {
                                 throw new Exception("Número inválido, tente novamente!\n\n");
                            }
                            numTime = Integer.parseInt(entrada);
                            
                            partida.setTimeMandante(campeonato.getTimes().get(numTime));
                            
                            System.out.println("Digite o número de gols do mandante:");
                            entrada = scan.nextLine().trim();

                            if(!isInt(entrada)) {
                                 throw new Exception("Número inválido, tente novamente!\n\n");
                            }
                            numGol = Integer.parseInt(entrada);
                            
                            partida.setGolMandante(numGol);
                            
                            System.out.println("Digite o número correspondente ao time visitante:");
                            entrada = scan.nextLine().trim();

                            if(!isInt(entrada)) {
                                 throw new Exception("Número inválido, tente novamente!\n\n");
                            }
                            
                            if(Integer.parseInt(entrada) == numTime) {
                                 throw new Exception("Time já foi escolhido como mandante, tente novamente!\n\n");
                            }
                            numTime = Integer.parseInt(entrada);
                            
                            partida.setTimeVisitante(campeonato.getTimes().get(numTime));
                            
                            System.out.println("Digite o número de gols do visitante:");
                            entrada = scan.nextLine().trim();

                            if(!isInt(entrada)) {
                                 throw new Exception("Número inválido, tente novamente!\n\n");
                            }
                            numGol = Integer.parseInt(entrada);
                            
                            partida.setGolVisitande(numGol);
                            
                            partidas.add(partida);
                            
                            System.out.println("Deseja cadastrar outra partida (S/N)?");
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } while (!("n").equalsIgnoreCase(saida));
                    campeonato.setPartidas(partidas);
                    campeonatoService.CriaCampeonato(campeonato);
                    break;
                case 3:
                    //verifica se o campeonado foi Criado
                    if (campeonatoService.verificaCampeonatoCriado()) {
                        campeonato = campeonatoService.recuperaCampeonatoCriado();
                        for (int i = 0; i < campeonato.getPartidas().size(); i++) {
                            Partida partida = campeonato.getPartidas().get(i);
                            System.out.println(partida.getTimeMandante().getNome() + " " +
                                               partida.getGolMandante() + " X " +
                                               partida.getGolVisitande() + " " +
                                               partida.getTimeVisitante().getNome()
                            );
                        }
                    } else {
                        System.out.println("Por favor, criar campeonato primeiro.");
                    }
                    break;
                case 4:
                    System.out.println("\nEm construção, por favor, tente mais tarde.");
                    break;
                case 5:
                    System.out.println("\nEncerrando o sistema de Campeonato de Futebol.");
                    System.exit(0);
                break;
                default:
                    System.out.println("Menu Errado, tente novamente\n\n");
            }
        } while (menu != 3);
    }
    
    /*
    * Metodo de validacao do valor digitado, pois o menu so pode ser numero.
    * Verifica se um numero e inteiro ou nao
    */
    public static boolean isInt(String numero) {
        return numero.matches("\\d*");
    }
}
