/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.anhembi.ads.util;

import com.anhembi.ads.model.Campeonato;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author neto
 */
public class ManipulaArquivos {

    public String gravaDados(Campeonato campeonato) {

        String message;

        try {
            FileOutputStream fout = new FileOutputStream("campeonato.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(campeonato);
            oos.close();
            message = "salvo";

        } catch (Exception e) {
            message = e.getMessage();
        }

        return message;
    }

    public Campeonato leDados() {

        Campeonato campeonato;
        
        try {

            FileInputStream fin = new FileInputStream("campeonato.txt");
            ObjectInputStream ois = new ObjectInputStream(fin);
            campeonato = (Campeonato) ois.readObject();
            ois.close();

            return campeonato;

        } catch (IOException | ClassNotFoundException ex) {
            return null;
        }
    }

}
