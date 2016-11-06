/**
 * Created by chawki on 28/10/16.
 */
public class EmployeTempsPartiel extends Employe {

    private double salaireHoraire;
    private int heures;

    public EmployeTempsPartiel(String nom, String fonction, int heures) {
        super(nom, fonction);
        this.heures = heures;
        if (heures <= 10) {
            this.salaireHoraire = 100;
        } else if (heures > 10 && heures <= 30) {
            this.salaireHoraire = 500;
        } else this.salaireHoraire = 750;
        calculSalaire();
    }
    //methode redefini pour calculer le salaire de lemployer partiel


    @Override
    public double calculSalaire() {
        setSalaire(salaireHoraire * heures);
        return getSalaire();
    }
}
