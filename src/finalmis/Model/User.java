package finalmis.Model;

import java.awt.List;
import java.sql.ResultSet;
import java.util.ArrayList;

public class User {
    private String username;
    private String password;
    private Connexion con;
    
    public User(){
        con = new Connexion("localhost", "root", "ImmokaleE23", "mispro");
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public Boolean login(String pass){
        try {
            String query = "SELECT Password FROM USER WHERE Email='" + this.getUsername() + "'";
            ResultSet res_emp = con.executeSelect(query);
            if (res_emp != null) {
                //rechercher ces element dans le tableau pour le code proposé
                //puis stocker les dans les variable l
                ArrayList<String> l1 = con.getSColumnFromResultSet(res_emp, "Password");

                //saisi des valeurs
                String password = String.valueOf(l1.get(0));
                System.out.println("vous avez mis : " + pass);
                System.out.println("on a trouve : " + password);
                //passation des valeurs au programme
                this.setPassword(password);
                if(password.equals(pass))
                {
                    System.out.println("Fait");
                    return true;
                }
                else
                {
                    System.out.println("Non fait");
                    return  false;
                }
            }
            else
            {
                System.out.println("tableau null");
                return false;  
            }
        } catch (Exception e) {
        }
        return false;
    }
    
}
