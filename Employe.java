import java.time.LocalDate;
import java.util.Integer;
public class Employe implements IEmploye{

private int id;
private  String nomComplet;
protected LocalDate dateEmbauche;
private static int nombreEmploye ;

    public Employe(){
        nombreEmploye++;
        id=nombreEmploye;
    }
    public Employe(String nomComplet,LocalDate dateEmbauche){
        this.nomComplet=nomComplet;
        this.dateEmbauche=dateEmbauche;
    }
    public int getId(){
    
        return id;
    }
    public String getNomComplet(){
    
        return nomComplet;
    }
    public String getDateEmbauche(){
    
        return dateEmbauche;
    }
    public void setId(int id){
    
        this.id=id;
    }
    public void setNomComplet(String nomComplet){
    
        this.nomComplet=nomComplet;
    }
    public void setDateEmbauche(LocalDate dateEmbauche){
    
        this.dateEmbauche=dateEmbauche; 
    }
     @Override
        public String affiche(){
            return "ID: "+id+"NOM Complet: "+nomComplet+"Date d'embauche : "+dateEmbauche ;
                
            }
        public Integer compareTo(Object compareTo) {

        Employe compareToEmp = (Employe)compareTo;

        if (id == compareToEmp.id) return 0;

        if (id > compareToEmp.id) return 1;

        return -1;        

        }
        public int Anciennete()
        {
            int Anc;
            Anc = DateTime.Now.Year - dateembauche.Year;
            if (dateEmbauche.AddYears(Anc) > DateTime.Now.Date)
                Anc--;
            return Anc;
 
        }




}