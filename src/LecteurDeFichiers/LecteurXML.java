package LecteurDeFichiers;

import java.io.IOException;
import java.nio.charset.StandardCharsets; 
import java.nio.file.Files;
import java.nio.file.Paths;


public class LecteurXML extends LecteurFichierAbstrait {


    public LecteurXML(String cheminFichier) {
        super(cheminFichier); 
        System.out.println("Constructeur XML reçoit : [" + cheminFichier + "]");
    }


    @Override
    public void lire() {
        System.out.println("Méthode lire() XML utilise le chemin : " + this.cheminFichier);
        
        try {
            this.contenu = Files.readAllLines(Paths.get(this.cheminFichier), StandardCharsets.ISO_8859_1);
        } 
        catch (IOException e) {
            System.err.println("Erreur lors de la lecture du fichier XML : " + e.getMessage());
            e.printStackTrace();
            this.contenu.clear(); 
        }
    }
}