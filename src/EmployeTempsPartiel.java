/**
 * Created by chawki on 28/10/16.
 */
public class EmployeTempsPartiel extends Employe {

    private double salaireHoraire;
    private int heures;

    public EmployeTempsPartiel(String nom, String fonction, double salaireHoraire, int heures) {
        super(nom, fonction);
        this.salaireHoraire = salaireHoraire;
        this.heures = heures;
        setSalaire(calculeSalaires());

    }

    public double getSalaireHoraire() {
        return salaireHoraire;
    }

    public int getHeures() {
        return heures;
    }

    public void setHeures(int heures) {
        this.heures = heures;
    }

    public void setSalaireHoraire(double salaireHoraire) {
        this.salaireHoraire = salaireHoraire;
    }

    //methode pour calcduler le salaire de lemployer partiel
    private double calculeSalaires() {
        return salaireHoraire * heures;
    }

}
