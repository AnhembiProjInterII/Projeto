/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhembi.ads.service;

import com.anhembi.ads.model.Campeonato;
import com.anhembi.ads.util.ManipulaArquivos;

/**
 *
 * @author neto
 */
public class CampeonatoService {
    
    
    private final ManipulaArquivos mArquivos;
    
    public CampeonatoService(){
        
        mArquivos = new ManipulaArquivos();
    }
    
    public String CriaCampeonato(Campeonato campeonato){
        
        String message = "";
        
        
        if(campeonato.getNome().equals("")){
            message = "É obrigatório digitar o nome do campeonato";
        }
     
        mArquivos.gravaDados(campeonato);
        
        return message;
    }
    
    
    public Boolean verificaCampeonatoCriado(){
        
        return mArquivos.leDados() != null;
    }
    
}
