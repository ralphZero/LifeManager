package finalmis.Model;

import java.awt.Color;
import java.awt.Container;
import java.awt.Paint;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.Dataset;
import org.jfree.data.general.DefaultPieDataset;

public class ChartGenerator {
    
    private Connexion con;
    public ChartGenerator(){
        con = new Connexion("localhost", "root", "ImmokaleE23", "mispro");
    }
    
    public ChartPanel createPieChartSpentMonth() throws SQLException{
        String query = "call getGraphicSpentByMonth()";
        ResultSet rs = con.executeSelectProc(query);
        
        ArrayList<Double> a = new ArrayList<>();
        while(rs.next()){
            a.add(rs.getDouble("Somme"));
        }
        
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Allocation des enfants", new Double(a.get(0)));
        pieDataset.setValue("Remboursements", new Double(a.get(1)));
        pieDataset.setValue("Autres depenses", new Double(a.get(2)));
        JFreeChart chart = ChartFactory.createPieChart("Monthly expenses", pieDataset,true,true,false);
        chart.getPlot().setBackgroundPaint(Color.WHITE);
        ChartPanel panel = new ChartPanel(chart);
        return panel;
    }
    
    public ChartPanel createPieChartSpentSemester() throws SQLException{
        String query = "call getGraphicSpentBySemester()";
        ResultSet rs = con.executeSelectProc(query);
        
        ArrayList<Double> a = new ArrayList<>();
        while(rs.next()){
            a.add(rs.getDouble("Somme"));
        }
        
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Allocation des enfants", new Double(a.get(0)));
        pieDataset.setValue("Remboursements", new Double(a.get(1)));
        pieDataset.setValue("Autres depenses", new Double(a.get(2)));
        JFreeChart chart = ChartFactory.createPieChart("Semestrialy expenses", pieDataset,true,true,false);
        chart.getPlot().setBackgroundPaint(Color.WHITE);
        ChartPanel panel = new ChartPanel(chart);
        return panel;
    }
    
    public ChartPanel createPieChartSpentYearly() throws SQLException{
        String query = "call getGraphicSpentByYear()";
        ResultSet rs = con.executeSelectProc(query);
        
        ArrayList<Double> a = new ArrayList<>();
        while(rs.next()){
            a.add(rs.getDouble("Somme"));
        }
        
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Allocation des enfants", new Double(a.get(0)));
        pieDataset.setValue("Remboursements", new Double(a.get(1)));
        pieDataset.setValue("Autres depenses", new Double(a.get(2)));
        JFreeChart chart = ChartFactory.createPieChart("Yearly expenses", pieDataset,true,true,false);
        chart.getPlot().setBackgroundPaint(Color.WHITE);
        ChartPanel panel = new ChartPanel(chart);
        return panel;
    }
    
    /////////////////////////
    //capital
    public ChartPanel createPieChartCapitalYearly() throws SQLException{
        String query = "call getGraphicCapitalByYear()";
        ResultSet rs = con.executeSelectProc(query);
        
        ArrayList<Double> a = new ArrayList<>();
        while(rs.next()){
            a.add(rs.getDouble("Somme"));
        }
        
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Salaires", new Double(a.get(0)));
        pieDataset.setValue("Dons", new Double(a.get(1)));
        pieDataset.setValue("Emprunts bancaires", new Double(a.get(2)));
        JFreeChart chart = ChartFactory.createPieChart("Yearly income", pieDataset,true,true,false);
        chart.getPlot().setBackgroundPaint(Color.WHITE);
        ChartPanel panel = new ChartPanel(chart);
        return panel;
    }
    
    public ChartPanel createPieChartCapitalSemester() throws SQLException{
        String query = "call getGraphicCapitalBySemester()";
        ResultSet rs = con.executeSelectProc(query);
        
        ArrayList<Double> a = new ArrayList<>();
        while(rs.next()){
            a.add(rs.getDouble("Somme"));
        }
        
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Salaires", new Double(a.get(0)));
        pieDataset.setValue("Dons", new Double(a.get(1)));
        pieDataset.setValue("Emprunts bancaires", new Double(a.get(2)));
        JFreeChart chart = ChartFactory.createPieChart("Semestrial income", pieDataset,true,true,false);
        chart.getPlot().setBackgroundPaint(Color.WHITE);
        ChartPanel panel = new ChartPanel(chart);
        return panel;
    }
    
    public ChartPanel createPieChartCapitalMonth() throws SQLException{
        String query = "call getGraphicCapitalByMonth()";
        ResultSet rs = con.executeSelectProc(query);
        
        ArrayList<Double> a = new ArrayList<>();
        while(rs.next()){
            a.add(rs.getDouble("Somme"));
        }
        
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        pieDataset.setValue("Salaires", new Double(a.get(0)));
        pieDataset.setValue("Dons", new Double(a.get(1)));
        pieDataset.setValue("Emprunts bancaires", new Double(a.get(2)));
        JFreeChart chart = ChartFactory.createPieChart("Monthly income", pieDataset,true,true,false);
        chart.getPlot().setBackgroundPaint(Color.WHITE);
        ChartPanel panel = new ChartPanel(chart);
        return panel;
    }
    
}
