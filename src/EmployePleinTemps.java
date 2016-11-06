/**
 * Created by chawki on 28/10/16.
 */
public class EmployePleinTemps extends Employe {

    private double salaireSemaine;
    private double prime;

    public EmployePleinTemps(String non, String fonction, double salaireSemaine, double prime) {
        super(non, fonction);
        this.salaireSemaine = salaireSemaine;
        this.prime = prime;
        calculSalaire();
    }



    //methode redefini pour calculer le salaire de l'employer a plein temps

    @Override
    public double calculSalaire() {
        if (3 > getNbAbsence())
            setSalaire(salaireSemaine * 4 + prime);
        else
            setSalaire(salaireSemaine * 4);
        return getSalaire();
    }
}
