import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by chawki on 06/11/16.
 */
public class Interaction {

    private ArrayList<Employe> employes = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    //GETTERS
    public ArrayList<Employe> getEmployes() {
        return employes;
    }

    //SETTERS
    public void setEmployes(ArrayList<Employe> employes) {
        this.employes = employes;
    }

    private void afficheNomEmploye() {
        for (int i = 0; i < employes.size(); i++) {
            System.out.println(i + 1 + "- " + employes.get(i).getNom());
        }
    }

    /*methode pour afficher les separateur de ligne */
    private void afficheSeparateur() {
        for (int i = 0; i < 3; i++) {
            System.out.print("+----------------");
        }
        System.out.print("+");
    }

    /*cette methode calcule l'espace a laisser dans une case en fonction de la taille de la chaine
     exemple la taille dune case = 16 et une chaine = 7 donc lespace laisser = 9*/
    private String calculeEspace(String chaine) {
        String espace = "";
        for (int i = 0; i < (16 - chaine.length()) - 1; i++) { //14 c'est la taille d'une case
            espace = espace + " ";
        }
        return espace;
    }


    //methode qui fait appel au 2 methode precedante pour tracé le tableau
    public void afficheTab() {

        afficheSeparateur();
        System.out.println("\n|     Non        |     Fonction   |     Salaire    |");
        afficheSeparateur();
        for (int j = 0; j < employes.size(); j++) {
            System.out.println("\n| " + employes.get(j).getNom() + calculeEspace(employes.get(j).getNom()) + "| " + employes.get(j).getFonction() + calculeEspace(employes.get(j).getFonction()) + "| " + calculeEspace(String.valueOf(employes.get(j).getSalaire()) + 1111) + employes.get(j).getSalaire() + " DA " + "|");
            afficheSeparateur();
        }
    }


    //notre menu d'interaction
    public void menu() {
        boolean val = false;
        while (!val) {
            System.out.println("\n-----------MENU---------");
            System.out.println("1- afficher le tableau des employes");
            System.out.println("2- afficher les cheque de paie ");
            System.out.println("3- marquer une absence d'un employe");
            System.out.println("4- afficher les employes absent");
            System.out.println("5- quitter");
            System.out.print("\nchoix : ");
            int choix = sc.nextInt();

            switch (choix) {

                case 1:
                    afficheTab();
                    break;
                case 2:
                    for (int i = 0; i < employes.size(); i++) {
                        employes.get(i).afficheCheque();
                    }
                    break;
                case 3:
                    System.out.println("sur quel employe ? :");
                    afficheNomEmploye();
                    System.out.print("choix :");
                    choix = sc.nextInt();
                    employes.get(choix - 1).setNbAbsence(employes.get(choix - 1).getNbAbsence() + 1);
                    employes.get(choix-1).calculSalaire();
                    break;

                case 4:
                    int comp = 0;
                    for (int i = 0; i < employes.size(); i++) {
                        if (employes.get(i).getNbAbsence() != 0) {
                            comp++;
                            System.out.println(comp + "- " + employes.get(i).getNom() + " " + employes.get(i).getNbAbsence() + " absence");
                        }
                    }
                    System.out.println("le nombre d'employes abssent = " + comp);
                    break;
                case 5:
                    val = true;
                    break;
                default:
                    System.out.println("erreur de saisi");
                    break;
            }
        }
    }

}
