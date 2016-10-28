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
        setSalaire(calculeSalaires());
    }

    public double getPrime() {
        return prime;
    }

    public double getSalaireSemaine() {
        return salaireSemaine;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public void setSalaireSemaine(double salaireSemaine) {
        this.salaireSemaine = salaireSemaine;
    }

    //methode pour calculer le salaire de l'employer a plein temps
    private double calculeSalaires() {
        return salaireSemaine * 4 + prime;
    }
}
