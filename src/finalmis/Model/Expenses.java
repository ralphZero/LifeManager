package finalmis.Model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Expenses {
    private int id;
    private Double Amount;
    private Date EntryDate;
    private int Catid;
    private int MemberID;
    private String MemberName;
    private String CatName;
    private Connexion con;
    
    public Expenses(){
        con = new Connexion("localhost", "root", "ImmokaleE23", "mispro");
    }

    public Expenses(int id, Double Amount,Date EntryDate, int Catid, int MemberID) {
        this.id = id;
        this.Amount = Amount;
        this.EntryDate = EntryDate;
        this.Catid = Catid;
        this.MemberID = MemberID;
    }

    public Expenses(String MemberName,Double Amount, Date EntryDate, String CatName) {
        this.Amount = Amount;
        this.EntryDate = EntryDate;
        this.MemberName = MemberName;
        this.CatName = CatName;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String MemberName) {
        this.MemberName = MemberName;
    }

    public String getCatName() {
        return CatName;
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

    public Date getEntryDate() {
        return EntryDate;
    }

    public void setEntryDate(Date EntryDate) {
        this.EntryDate = EntryDate;
    }
    
    public Double getAmount() {
        return Amount;
    }

    public void setAmount(Double Amount) {
        this.Amount = Amount;
    }

    public int getCatid() {
        return Catid;
    }

    public void setCatid(int Catid) {
        this.Catid = Catid;
    }

    public int getMemberID() {
        return MemberID;
    }

    public void setMemberID(int MemberID) {
        this.MemberID = MemberID;
    }
    
    public Boolean addExpense(Double amount,int cat,int member){
        try {
            String query ="call insert_spent('"+getAmount()+"','"+getCatid()+"','"+getMemberID()+"')";
            return con.executeInsertProcExpense(query,amount,cat,member);
        } catch (Exception e) {
            Logger.getLogger(Expenses.class.getName()).log(Level.SEVERE, null, e);
            return null;
    }
}
    
    public ArrayList<Expenses> fetchExepense(){
        ArrayList<Expenses> arrayList = new ArrayList<>();
        try {
            String query = "call getSpentByMonth()";
            ResultSet rs = con.executeSelectProc(query);
            while(rs.next()){
                Expenses ex = new Expenses(rs.getString("Fullname"), rs.getDouble("Amount"),rs.getDate("Date_entry"),rs.getString("Category"));
                arrayList.add(ex);
               
            }
            return arrayList;
        } catch (SQLException e) {
            Logger.getLogger(Expenses.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public ArrayList<Expenses> bindComboBoxSemestrialy(){
        ArrayList<Expenses> arrayList = new ArrayList<>();
        try {
            String query = "call getSpentBySemester()";
            ResultSet rs = con.executeSelectProc(query);
            while(rs.next()){
                Expenses ex = new Expenses(rs.getString("Fullname"), rs.getDouble("Amount"),rs.getDate("Date_entry"),rs.getString("Category"));
                arrayList.add(ex);
            }
            return arrayList;
        } catch (SQLException e) {
            Logger.getLogger(Expenses.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }
    
    public ArrayList<Expenses> bindComboBoxYearly(){
        ArrayList<Expenses> arrayList = new ArrayList<>();
        try {
            String query = "call getSpentByYear()";
            ResultSet rs = con.executeSelectProc(query);
            while(rs.next()){
                Expenses ex = new Expenses(rs.getString("Fullname"), rs.getDouble("Amount"),rs.getDate("Date_entry"),rs.getString("Category"));
                arrayList.add(ex);
            }
            return arrayList;
        } catch (SQLException e) {
            Logger.getLogger(Expenses.class.getName()).log(Level.SEVERE, null, e);
            return null;
        }
    }

}
