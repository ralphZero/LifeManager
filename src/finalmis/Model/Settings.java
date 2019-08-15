package finalmis.Model;

public class Settings {
    private Connexion con;
    
    public Settings(){
      con = new Connexion("localhost", "root", "ImmokaleE23", "mispro"); 
    }
    
}
