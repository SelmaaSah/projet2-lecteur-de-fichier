package LecteurDeFichiers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public abstract class LecteurFichierAbstrait implements LecteurFichier {
    
    protected String cheminFichier;
    protected List<String> contenu; 
    
    public LecteurFichierAbstrait(String cheminFichier) {
        this.cheminFichier = cheminFichier;
        this.contenu = new ArrayList<>();
    }
    
    public abstract void lire();
    
    @Override
    public void afficher() {
        System.out.println("--- Affichage original- ---");
        for (String ligne : this.contenu) {
            System.out.println(ligne);
        }
    }
  //System.out.println("nb lignes : " + this.contenu.size());
    
    @Override
    public void afficherInverseLignes() {
    	
    	//Collections.reverse(this.contenu);
        	System.out.println("--- Affichage lignes inversées---");
        for (int i = this.contenu.size() - 1; i >= 0; i--) {
            System.out.println(this.contenu.get(i));
        }
    }
   
    @Override
    public void afficherPalindromique() {
        System.out.println("--- Affichage palindromique ---");
        for (String ligne : this.contenu) {
            String 	ligneInversee = new StringBuilder(ligne).reverse().toString();
            System.out.println(ligneInversee);
        }
    }

    public boolean comparer(LecteurFichier autre) {
       
        if (autre instanceof LecteurFichierAbstrait) {
            LecteurFichierAbstrait autreLecteur = (LecteurFichierAbstrait) autre;
            return this.contenu.equals(autreLecteur.getContenu());
        }
        return false;
    }
  
    public List<String> getContenu() {
        return this.contenu;
    }
}