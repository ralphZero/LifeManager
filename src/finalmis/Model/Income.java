package finalmis.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Income {
    private int id;
    private Double Amount;
    private Date EntryDate;
    private int CatId;
    private int memberID;
      private String MemberName;
    private String CatName;
     
    private Connexion con;
    
    public Income(){
        con = new Connexion("localhost", "root", "ImmokaleE23", "mispro");
    }

    public Income(int id,Double Amount, Date EntryDate,String CatName, int CatId,int memberID ,String MemberName) {
        this.id = id;
        this.Amount = Amount;
        this.EntryDate = EntryDate;
        this.CatId = CatId;
        this.MemberName = MemberName;
        this.CatName = CatName;
        this.memberID = memberID;
        //con = new Connexion("localhost", "root", "ImmokaleE23", "mispro");
    }

     public Income(String Fullname,Double Amount,Date Date_entry,String Category) {
         
        this.MemberName = Fullname;
        this.Amount = Amount;
        this.EntryDate = Date_entry;
        this.CatName = Category;
    }
    public String getMemberName() {
        return MemberName;
    }

    public String getCatName() {
        return CatName;
    }

    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    public void setCatName(String CatName) {
        this.CatName = CatName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }

    public Date getEntryDate() {
        return EntryDate;
    }

    public void setEntryDate(Date EntryDate) {
        this.EntryDate = EntryDate;
    }

    public int getCatId() {
        return CatId;
    }

    public void setCatId(int CatId) {
        this.CatId = CatId;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }
    
    public Boolean addIncome(){
        try {
            String query = "call insert_capital("+getAmount()+",'"+getCatId()+"','"+getMemberID()+"')";
            return con.executeInsertProc(query);
        } catch (Exception e) {
            Logger.getLogger(Income.class.getName()).log(Level.SEVERE, null, e);
            return false;
        }
    }
    public ArrayList<Income> fetchIncome(){
        ArrayList<Income> inc = new  ArrayList<>();
        try {
            String query = "call getCapitalByMonth()";
            ResultSet rs = con.executeSelectProc(query);
            while(rs.next()){ 
               // Income i = new Income(rs.getInt("idCAPITAL"),rs.getDouble("Amount"),rs.getDate("Date_entry"),rs.getInt("idCAPITAL_CATEGORY"),rs.getInt("idFAMILY_MEMBER"));
                Income i = new Income(rs.getString("Fullname"),rs.getDouble("Amount"),rs.getDate("Date_entry"),rs.getString("Category"));
                 
                inc.add(i);
            }
            return inc;
        } catch (Exception e) {
            Logger.getLogger(Income.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public String checkBalance(){
        try {
            String c = null;
            String query="call check_balance(@balance)";
            ResultSet resultSet = con.executeSelectProc(query);
            while(resultSet.next()){
                c = resultSet.getString("balance");
            }
            return c;
        } catch (Exception e) {
            Logger.getLogger(Income.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    public ArrayList<Income> bindComboMonth(){
        try {
            ArrayList<Income> list = new ArrayList<>();
            String query = "call getCapitalByMonth()";
            ResultSet rs = con.executeSelectProc(query);
            while(rs.next()){
                Income i = new Income(rs.getString("Fullname"),rs.getDouble("Amount"),rs.getDate("Date_entry"),rs.getString("Category"));
                list.add(i);
            }
            return list;
        } catch (SQLException e) {
            Logger.getLogger(Income.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    public ArrayList<Income> bindComboSemestrial(){
        try {
            ArrayList<Income> list = new ArrayList<>();
            String query = "call getCapitalBySemester()";
            ResultSet rs = con.executeSelectProc(query);
            while(rs.next()){
                Income i = new Income(rs.getString("Fullname"),rs.getDouble("Amount"),rs.getDate("Date_entry"),rs.getString("Category"));
                list.add(i);
            }
            return list;
        } catch (SQLException e) {
            Logger.getLogger(Income.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    public ArrayList<Income> bindComboYear(){
        try {
            ArrayList<Income> list = new ArrayList<>();
            String query = "call getCapitalByYear()";
            ResultSet rs = con.executeSelectProc(query);
            while(rs.next()){
                Income i = new Income(rs.getString("Fullname"),rs.getDouble("Amount"),rs.getDate("Date_entry"),rs.getString("Category"));
                list.add(i);
            }
            return list;
        } catch (SQLException e) {
            Logger.getLogger(Income.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
}


