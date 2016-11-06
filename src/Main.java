
import java.util.ArrayList;

/**
 * Created by chawki on 28/10/16.
 */
public class Main {

    public static void main(String[] args) {
        Interaction menu = new Interaction();

        //les employes de base
        menu.getEmployes().add(new Employe("chawki", "PDG", 50000));
        menu.getEmployes().add(new Employe("ibtissem", "secretaire", 25000));
        menu.getEmployes().add(new EmployePleinTemps("yasmine", "comptable", 10000, 500));
        menu.getEmployes().add(new EmployeTempsPartiel("imad", "garde", 25));
        menu.getEmployes().add(new EmployeTempsPartiel("nesrine", "stagiere", 15));


        menu.menu();



    }

}
