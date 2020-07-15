public class Service{

private int id;
private  String libelle;

private static int nombreService ;

    public Service(){
        nombreService++;
        id=nombreService;
    }
    public Employe(String libelle){
        this.libelle=libelle;
    }
    public int getId(){
    
        return id;
    }
    public String getLibelle(){
    
        return libelle;
    }
    
    public void setId(int id){
    
        this.id=id;
    }
    public void setLibelle(String libelle){
    
        this.libelle=libelle;
    }
    public void listerEmployeService() {
        for (final Employe e : tabEmploye) {
            if (e != null) {
                if (employeIsExist(e)) {
                    System.out.println("id :" + e.getId() + "nomComplet:" + e.getNomComplet() + "date d'embauche:"
                            + e.getDateEmbauche());
                }

            }

        }
     @Override
        public String affiche(){
            return "ID: "+id+"Libelle: "+libelle;
                
            }
        public Integer compareTo(Object compareTo) {

        Service compareToS = (Service)compareTo;

        if (id == compareToS.id) return 0;

        if (id > compareToS.id) return 1;

        return -1;        

        }
}