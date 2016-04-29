package com.anhembi.ads.util;

import com.anhembi.ads.model.Campeonato;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Gustavo Martins Oliveira - RA 20706520
 * @author Gustavo Soares Handa - RA 20856177
 * @author Norberto Ferreira dos Santos Neto - RA 20735810
 * @author Rodrigo Fabiano - 20585554
 * @author Rodrigo Ferreira Bravo - 20742535
 */
public class ManipulaArquivos {

    /**
     * Grava os dados no arquivo
     * @param campeonato
     * @return mensagem de sucesso ou erro
     */
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
    
    /**
     * Le os dados gravados no arquivo
     * @return retorna um objeto do tipo Campeonato
     */
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
