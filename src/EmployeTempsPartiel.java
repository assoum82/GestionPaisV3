/**
 * Created by chawki on 28/10/16.
 */
public class EmployeTempsPartiel extends Employe {

    private double salaireHoraire;
    final private int heures = 35;

    public EmployeTempsPartiel(String nom, String fonction, double salaireHoraire) {
        super(nom, fonction);
        this.salaireHoraire = salaireHoraire;
    }


    //methode redefini pour calculer le salaire de lemployer partiel


    @Override
    public double calculSalaire() {
        setSalaire(salaireHoraire * heures);
        return getSalaire();
    }
}
