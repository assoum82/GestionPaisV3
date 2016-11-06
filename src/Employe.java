/**
 * Created by chawki on 28/10/16.
 */
public class Employe {

    private String nom;
    private String fonction;
    private double salaire;
    private int nbAbsence;
    private int nbEmployer = 0;

    //constructeur pour l'heritage
    public Employe(String nom, String fonction) {
        this.nom = nom;
        this.fonction = fonction;
        this.nbAbsence = 0;
        nbEmployer++;

    }

    public Employe(String nom, String fonction, double salaire) {
        this.nom = nom;
        this.fonction = fonction;
        this.salaire = salaire;
        this.nbAbsence = 0;
        nbEmployer++;
    }


    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public int getNbAbsence() {
        return nbAbsence;
    }

    public void setNbAbsence(int nbAbsence) {
        this.nbAbsence = nbAbsence;
    }

    public String getNom() {
        return nom;
    }

    public String getFonction() {
        return fonction;
    }

    public int getNbEmployer() {
        return nbEmployer;
    }

    public double calculSalaire() {
        return salaire;
    }

    //methode pour afficher le cheque
    public void afficheCheque() {
        String msg = "";
        if (nbAbsence != 0) {
            msg = "[" + nbAbsence + " absence]";
        }
        if (nbAbsence >= 3)
            msg = "[" + nbAbsence + " absence][prime suprimer]";
        System.out.println("Payer à l'ordre de " + nom + " ( " + fonction + " ) ***" + calculSalaire() + " DA " + msg);
    }
}
