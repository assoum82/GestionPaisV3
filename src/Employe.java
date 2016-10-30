/**
 * Created by chawki on 28/10/16.
 */
public class Employe {

    private String nom;
    private String fonction;
    private double salaire;

    //constructeur pour l'heritage
    public Employe(String nom, String fonction) {
        this.nom = nom;
        this.fonction = fonction;
    }

    public Employe(String nom, String fonction,double salaire) {
        this.nom = nom;
        this.fonction = fonction;
        this.salaire=salaire;
    }


    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }


    public double calculSalaire() {
        return salaire;
    }

    //methode pour afficher le cheque
    public void afficheCheque() {
        System.out.println("Payer à l'ordre de " + nom + " ( " + fonction + " ) ***" + calculSalaire() + " DA");
    }
}
