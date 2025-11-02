package LecteurDeFichiers;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LecteurJSON extends LecteurFichierAbstrait {


    public LecteurJSON(String cheminFichier) {
        super(cheminFichier); 
        
        System.out.println("Constructeur JSON reçoit : [" + cheminFichier + "]");
    }


    @Override
    public void lire() {
        
        try {
            this.contenu = Files.readAllLines(Paths.get(this.cheminFichier), StandardCharsets.ISO_8859_1);
        } 
        catch (IOException e) {
            System.err.println("Erreur de lecture du fichier JSON : " + e.getMessage());
            e.printStackTrace(); 
            this.contenu.clear(); 
        }
    }
}