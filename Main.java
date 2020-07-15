import java.util.Scanner;
import java.time.Date;
import java.time.LocalDate;
import java.util.Integer;

public class Main {
    public static void main(String[] args) {
        String choix;
        final int TAILLE=10;
        private int nombreService = 0;
        private final Service[TAILLE] tabServices;
        int serviceActuelle = 0;
        private int nombreEmploye = 0;
        private final Employe[TAILLE] tabEmploye;
        
        do {

            System.out.println("Menu");
            System.out.println("1-Ajouter service");
            System.out.println("2- Lister Les services");
            System.out.println("3-Affecter un employe dans un service ");
            System.out.println("4-Lister les employés d'un service ");
            System.out.println("5-Afficher les employés qui doivent partir en retraite cette année ");
            System.out.println("6-Quitter");
            System.out.println("Faites un choix");
            Scanner clavier = new Scanner(System.in);
            choix = clavier.nextLine();

            switch (choix) {
                case "1":
                    System.out.println("Donnner le libelle du service");
                    String libelle = clavier.nextLine();
                    Service service = new Service();
                    service.setLibelle(libelle);
                    tabService[service] = service1;
                    serviceactuelle++;
                    break;
                System.out.println("==================******************===========");
                case "2":
                    System.out.println("Lister les services");
                    for(int i=0;i<nbreDeService;++i){
                    System.out.print(tabServices[i].affiche());
                    break;
                System.out.println("==================******************===========");
                case "3":
                System.out.println("Entrer les informations de l'employe");
                System.out.println("Entrer le Nom Complet");
                String nomComplet =clavier.nextLine();
                System.out.println("Entrer la Date d'embauche (jj/mm/aaaa)");
                LocalDate dateEmb= LocalDate.now();
                Employe employe1=new Employe(nomComplet,dateEmbauche);
                System.out.println("Entrer le service de l'employe");
                String service=clavier.nextLine();
                serviceEmploye[nombreServiceEmploye]=employe;
                nombreServiceEmploye++;
                System.out.println("==================******************===========");
                    break;
                case "4":
                System.out.println("Lister les employés par service");
                Service.listerEmployeService();            
                break;
                case "5":
                
                break;
        
            default:
                break;


        }
        } while (choix != "6" );
            } 