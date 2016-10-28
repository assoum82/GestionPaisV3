
import java.util.ArrayList;

/**
 * Created by chawki on 28/10/16.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Employe> employes = new ArrayList<>();

        employes.add(new Employe("Chawki", "PDG", 500000));
        employes.add(new EmployePleinTemps("Mohammed", "Secretaire", 5500, 1000));
        employes.add(new EmployeTempsPartiel("Isak", "Agent de securité ", 750, 20));

        for (int i = 0; i < employes.size(); i++) {
            employes.get(i).afficheCheque();
        }

    }
}
