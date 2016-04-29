package com.anhembi.ads.service;

import com.anhembi.ads.model.Campeonato;
import com.anhembi.ads.util.ManipulaArquivos;

/**
 * @author Gustavo Martins Oliveira - RA 20706520
 * @author Gustavo Soares Handa - RA 20856177
 * @author Norberto Ferreira dos Santos Neto - RA 20735810
 * @author Rodrigo Fabiano - 20585554
 * @author Rodrigo Ferreira Bravo - 20742535
 */
public class CampeonatoService {
    
    
    private final ManipulaArquivos mArquivos;
    
    public CampeonatoService(){
        
        mArquivos = new ManipulaArquivos();
    }
    
    /**
     * Servico para gravar os dados no arquivo / criar campeonato
     * @param campeonato
     * @return Mensagem de criado ou erro
     */
    public String CriaCampeonato(Campeonato campeonato){
        
        String message = "";
        
        
        if(campeonato.getNome().equals("")){
            message = "É obrigatório digitar o nome do campeonato";
        }
     
        mArquivos.gravaDados(campeonato);
        
        return message;
    }
    
    /**
     * Verifica se o campeonato já foi criado, ou seja, se o objeto já foi criado
     * @return true/false
     */
    public Boolean verificaCampeonatoCriado(){
        
        return mArquivos.leDados() != null;
    }
    
    public Campeonato recuperaCampeonatoCriado(){
        
        return mArquivos.leDados();
    }
    
}
