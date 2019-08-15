package finalmis.Model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Category {
    private int id;
    private String name;
    private String desc;
    private Connexion con;

    public Category(int id, String name, String desc) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        //con = new Connexion("localhost", "root", "ImmokaleE23", "mispro");
    }
    
    public Category(){
        con = new Connexion("localhost", "root", "ImmokaleE23", "mispro");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ArrayList<Category> fetchCategory(){
        ArrayList<Category> cat = new ArrayList<>();
        try {
            String query = "call select_capital_category()";
            ResultSet rs = con.executeSelectProc(query);
            while(rs.next()){
                Category c = new Category(rs.getInt("idCAPITAL_CATEGORY"),rs.getString("Name"),rs.getString("Description"));
                cat.add(c);
            }
            return cat;
        } catch (Exception e) {
            return null;
        }
    }
    
    public ArrayList<Category> fetchSpentCategory(){
        ArrayList<Category> cat = new ArrayList<>();
        try {
            String query = "call select_category_spent()";
            ResultSet rs = con.executeSelectProc(query);
            while(rs.next()){
                Category c = new Category(rs.getInt("idSPENT_CATEGORY"),rs.getString("Name"),rs.getString("Description"));
                cat.add(c);
            }
            return cat;
        } catch (Exception e) {
            Logger.getLogger(Category.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public void setCategoryData(){
        try {
            String query = "call insert_capital_category('"+getName()+"','"+getDesc()+"')";
            con.executeInsertProc(query);
        } catch (Exception e) {
        }
    }
    
    public void setSpentCategoryData(){
        try {
            String query = "call insert_category_spent('"+getName()+"','"+getDesc()+"')";
            con.executeInsertProc(query);
        } catch (Exception e) {
        }
    }
}
