/**
 * Created by chawki on 28/10/16.
 */
public class Employe {

    private String nom;
    private String fonction;
    private double salaire;


    public Employe() {
        this.nom = "none";
        this.fonction = "none";
        this.salaire = 0;
    }

    //constructeur pour l'heritage
    public Employe(String nom, String fonction) {
        this.nom = nom;
        this.fonction = fonction;
    }


    public Employe(String nom, String fonction, double salaire) {
        this.nom = nom;
        this.fonction = fonction;
        this.salaire = salaire;
    }


    public double getSalaire() {
        return salaire;
    }

    public String getFonction() {
        return fonction;
    }

    public String getNom() {
        return nom;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    //methode pour afficher le cheque
    void afficheCheque() {
        System.out.println("Payer à l'ordre de " + nom + " ( " + fonction + " ) ***" + salaire + " DA");
    }
}
