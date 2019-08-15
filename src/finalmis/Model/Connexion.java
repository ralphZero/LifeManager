package finalmis.Model;

import com.mysql.jdbc.CallableStatement;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSetMetaData;
import com.mysql.jdbc.Statement;
import java.awt.List;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Connexion {
    private Connection connect = null;
    private Statement state = null;
    
    static 
    {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    
    public Connexion(String host, String login, String pass, String bd){
        try 
        {
            /*connect = (Connection) DriverManager.getConnection("jdbc:mysql://" + host + "/"
                    + bd + "?" + "user=" + login + "&password=" + pass);*/
            connect = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/mispro?user=root&password=");
            state = (Statement) connect.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Erreur connection avec la base de donnee", "Erreur",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public boolean executeInsertProc(String query){
        try {
            CallableStatement statement = (CallableStatement) connect.prepareCall(query);
            return statement.execute();
        }catch (SQLException e) {
            /*String stat = e.getSQLState();
            if(stat.equals("45000")){
                JOptionPane.showMessageDialog(null,e.getMessage(), "Transaction",JOptionPane.QUESTION_MESSAGE);
            }else if (stat.equals("50000")) {
                int i = JOptionPane.showConfirmDialog(null, e.getMessage(),"Alert!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(i == JOptionPane.YES_OPTION){
                    
                
            }
           // System.err.println(e);
           /*JOptionPane.showMessageDialog(null,e.getMessage().toString(), "Transaction",JOptionPane.QUESTION_MESSAGE);
           JOptionPane j = new JOptionPane();
           String nom = j.showInputDialog(null, "Entrer le montant a epargner:","Epargne",JOptionPane.QUESTION_MESSAGE);
            procEpargne(nom);*/
        return false;
        }
    }
    public boolean executeInsertProcExpense(String query, Double amount,int Cat,int Member) throws SQLException{
        try {
            CallableStatement statement = (CallableStatement) connect.prepareCall(query);
            return statement.execute();
        }catch (SQLException e) {
            String stat = e.getSQLState();
            if(stat.equals("40000")){
                JOptionPane j = new JOptionPane();
            String valeur = j.showInputDialog(null, "Entrer le montant a epargner:","Epargne",JOptionPane.QUESTION_MESSAGE);
                CallableStatement in = (CallableStatement) connect.prepareCall("call insert_saving('"+valeur+"')");
                in.execute();
            }
            else if(stat.equals("45000")){
                JOptionPane.showMessageDialog(null,e.getMessage(), "Transaction",JOptionPane.QUESTION_MESSAGE);
            }else if (stat.equals("50000")) 
            {
                int i = JOptionPane.showConfirmDialog(null, e.getMessage(),"Alert!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
                if(i == JOptionPane.YES_OPTION){
                    CallableStatement s;
                    try {
                        s = (CallableStatement) connect.prepareCall("call force_insert_spent('"+amount+"','"+Cat+"','"+Member+"')");
                        s.execute();
                    } catch (SQLException ex) {
                        Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                }
            }else{
                    
            }
           // System.err.println(e);
           /*JOptionPane.showMessageDialog(null,e.getMessage().toString(), "Transaction",JOptionPane.QUESTION_MESSAGE);
           JOptionPane j = new JOptionPane();
           String nom = j.showInputDialog(null, "Entrer le montant a epargner:","Epargne",JOptionPane.QUESTION_MESSAGE);
            procEpargne(nom);*/
        return false;
        }
    }
        
    
    
    
    public boolean executeInsert(String query) {
        try 
        {
            return state.execute(query);
        } 
        catch (SQLException e)
        {
            int errCode = e.getErrorCode();
            //e.printStackTrace();
            System.err.println(e);
            if(errCode == 1062)
            {
                JOptionPane.showMessageDialog(null, "ErrorCode = " + errCode +"\n" + "Duplicate entry for id \n","Erreur",JOptionPane.ERROR_MESSAGE);
            }
            else if(errCode == 1169)
            {
                JOptionPane.showMessageDialog(null, "ErrorCode = " + errCode +"\n" + "Can't write, because of unique constraint, to table registeration", "Erreur",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, "ErrorCode = " + errCode +"\n" + "Find error associated with error code from the link: https://dev.mysql.com/doc/refman/5.7/en/error-messages-server.html","Erreur",JOptionPane.ERROR_MESSAGE );   
            }
            return false;
        }
    }
 
    public int executeUpdate(String query) {
        try {
            return state.executeUpdate(query);
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
         //   System.err.println(e.getSQLState());
         //   System.err.println(e.getMessage());
            return -1;
        }
    }
 
    public ResultSet executeSelect(String query) {
        try {
            return state.executeQuery(query);
        } 
        catch (SQLException e) 
        {
            e.printStackTrace();
            return null;
        }
    }
    public ResultSet executeSelectProc(String query){
        try {
            CallableStatement statement = (CallableStatement) connect.prepareCall(query);
            return statement.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        
    }
 
    public void printResultSet(ResultSet r) {
        try {
            r.beforeFirst();
            
            ResultSetMetaData meta = (ResultSetMetaData) r.getMetaData();
            int nbCol = meta.getColumnCount();
            for (int i = 1; i < nbCol + 1; ++i) {
                if (i > 1)
                    System.out.print(", ");
                System.out.print(meta.getColumnLabel(i));
            }
            System.out.println("");
            while (r.next()) {
                for (int i = 1; i < nbCol + 1; ++i) {
                    if (i > 1)
                        System.out.print(", ");
                    System.out.print(r.getString(i));
                }
                System.out.println("");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<String> getSColumnFromResultSet(ResultSet r, String col) {
        ArrayList<String> l = new ArrayList<>();
        try {
            r.beforeFirst();
            while (r.next())
                l.add(r.getString(col));
        } 
        catch (SQLException e) {
            e.printStackTrace();
        }
        return l;
    }

    private void procEpargne(String nom) {
        try {
            String query = "call insert_saving("+Double.parseDouble(nom)+")";
            CallableStatement statement = (CallableStatement) connect.prepareCall(query);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,e.getMessage().toString(), "Transaction",JOptionPane.QUESTION_MESSAGE);
        }
    }
}
