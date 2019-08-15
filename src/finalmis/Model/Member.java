package finalmis.Model;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Member {
    private Connexion con;
    private int id;
    private String lastname;
    private String firstname;
    private String email;
    private Date Birthday;
    private String status;
    public Member(){
        con = new Connexion("localhost", "root", "ImmokaleE23", "mispro");
    }
    public Member(int id,String Lastname,String Firstname,String Email,Date Birthday,String Status){
        //con = new Connexion("localhost", "root", "ImmokaleE23", "mispro");
        this.id = id;
        this.lastname = Lastname;
        this.firstname = Firstname;
        this.email = Email;
        this.Birthday = Birthday;
        this.status = Status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date Birthday) {
        this.Birthday = Birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public Boolean addMember(){
        try {
            String query = "call insert_member('"+getLastname()+"','"+getFirstname()+"','"+getEmail()+"','"+getBirthday()+"','"+Integer.parseInt(getStatus())+"')";
            return con.executeInsertProc(query);
        } catch (Exception e) {
            System.err.println(e);
        }
        return false;
    }
    
    public ArrayList<Member> fetchMembers(){
        ArrayList<Member> members = new ArrayList<>();
        try {
            String query = "call select_member()";
            ResultSet rs = con.executeSelectProc(query);
            Member member;
            while(rs.next()){
                String stat;
                if(rs.getInt("Status")==1){
                    stat = "Parent";
                }else{
                    stat = "Child";
                }
                member = new Member(rs.getInt("idFAMILY_MEMBER"),rs.getString("Lastname"), rs.getString("Firstname"), rs.getString("Email_address"), rs.getDate("Birthdate"), stat);
                members.add(member);
            }
        } catch (Exception e) {
            Logger.getLogger(Member.class.getName()).log(Level.SEVERE, null, e);
        }
        return members;
    }
    
    public int countmembers(){
        int count = 0;
        try {
            String query ="SELECT COUNT(idFAMILY_MEMBER) AS A FROM FAMILY_MEMBER";
            ResultSet rs = con.executeSelectProc(query);
            while(rs.next()){
                count = rs.getInt("A");
            }
            return count;
        } catch (Exception e) {
            return 0;
        }
    }
}