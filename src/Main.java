
import java.util.ArrayList;

/**
 * Created by chawki on 28/10/16.
 */
public class Main {

    public static void main(String[] args) {
        ArrayList<Employe> employes = new ArrayList<>(); //notre tab de type Employe

        employes.add(new Employe("Chawki", "PDG", 150000)); //le premier objet du tab est de type Employe (class mere)
        employes.add(new EmployePleinTemps("Mohammed", "Secretaire", 500, 1000));//le 2em objet est de type EmployePleintemp (class fille)
        employes.add(new EmployeTempsPartiel("Isak", "Agent de securité ", 500));//le 3em objet est de type EmployeTempPLein (class fille)


        /*
        -affichage du cheque ( np: le salaire est calculer directement dans la methode afficheCheque() par lien d'heritage )
        -la methode calculeSalaire() a ete redefini dans les class fille
        -pour redefinire une methode (polymorphisme) il faut garder les meme parametre d'entré et modifiant seulement son bloc ou son type de sort
          */

        for (int i = 0; i < employes.size(); i++) {
            employes.get(i).afficheCheque();
        }

    }
}
