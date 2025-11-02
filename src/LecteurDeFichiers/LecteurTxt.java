package LecteurDeFichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class LecteurTxt extends LecteurFichierAbstrait {
    
    public LecteurTxt(String cheminFichier) {
        super(cheminFichier);
    }
   
    @Override 
    public void lire() {
        try {
            this.contenu = Files.readAllLines(Paths.get(this.cheminFichier));
        } 
        
        
        catch (IOException e) {
        	
            System.err.println("----Erreur  :---- " + e.getMessage());
            this.contenu.clear(); 
        }
    }
    
}