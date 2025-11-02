package Main;

import LecteurDeFichiers.*; 
public class FileReader {

    public static void main(String[] args) {
    	
    	
    	// Test 1: Fichier Texte (.txt)
        //String cheminFichier = "C:\\Users\\selma\\Downloads\\testdoc-texte.txt"; 
        
        //LecteurFichier monLecteur = new LecteurTxt(cheminFichier);
        
    	// Test 2: Fichier JSON (.json)
    	//String cheminFichier = "fichiers-a-tester/output.json";


    	//LecteurFichier monLecteur = new LecteurJSON(cheminFichier);
        
        
        //String cheminFichier = "C:\\Users\\selma\\Downloads\\FICHIER-xml.xml";

        //System.out.println("Chemin utilisé : " + cheminFichier + "\n");

        //LecteurFichier monLecteur = new LecteurXML(cheminFichier);
    	
    	// Test 3: Fichier XML (.xml)
        String cheminFichier = "fichiers-a-tester/FICHIER-xml.xml";

        System.out.println("Chemin utilisé : " + cheminFichier + "\n");

        LecteurFichier monLecteur = new LecteurXML(cheminFichier);
        
        monLecteur.lire();
        monLecteur.afficher(); 
        monLecteur.afficherInverseLignes(); 
        monLecteur.afficherPalindromique(); 
               
        System.out.println("---- Test de comparaison ---");
        
        LecteurFichier lecteurBis = new LecteurTxt(cheminFichier);
        lecteurBis.lire();
        
        boolean sontIdentiques = monLecteur.comparer(lecteurBis); 
        System.out.println("Les contenus sont identiques ? " + sontIdentiques);
    }
}