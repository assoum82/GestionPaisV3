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
    }


    //methode redefini pour calculer le salaire de l'employer a plein temps

    @Override
    public double calculSalaire() {
        setSalaire(salaireSemaine * 4 + prime);
        return getSalaire();
    }
}
