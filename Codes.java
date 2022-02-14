package team_management;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import rojerusan.RSMaterialButtonRectangle;

/**
 *
 * @author ALka Media
 */
public class Codes {
    Connection con;
    Statement std;
    CallableStatement cs;
 public   ResultSet rs;
    public void setConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost/team_mngt_system","root","");
            std=con.createStatement();
        }catch(ClassNotFoundException | SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public void setSQL(String sql){
        
        try{
             setConnection();
             rs=std.executeQuery(sql);
             if(rs.next())
                 JOptionPane.showMessageDialog(null, rs.getString("msg"));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
      
    }
    public void viewTable(String sql, JTable table){
        try{
            setConnection();
            rs=std.executeQuery(sql);
            table.setModel(DbUtils.resultSetToTableModel(rs)); 
            con.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public ResultSet search(String sql){
         try{
            setConnection();
            rs=std.executeQuery(sql);
             }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
         return rs;
    }
    
    public void fillCombo(String sql, JComboBox box, String field){
         try{
            setConnection();
            rs=std.executeQuery(sql);
            while(rs.next())
          box.addItem(rs.getString(field));
            con.close();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    public void Call(String st){
        try{
        cs=con.prepareCall(st);
        rs=cs.executeQuery();
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
//    public void report(String path,String sql){
//        try{
//            setConnection();
//            JasperDesign design=JRXmlLoader.load(path);
//            JRDesignQuery query=new JRDesignQuery();
//            query.setText(sql);
//            design.setQuery(query);
//            JasperReport rep=JasperCompileManager.compileReport(design);
//            JasperPrint pr=JasperFillManager.fillReport(rep, null,con);
//            JasperViewer.viewReport(pr, false);
//        }catch(Exception ex){
//          JOptionPane.showMessageDialog(null, ex.getMessage());
//        }
//    }
    
    
       public void report(String path, String sql){
        try{
            setConnection();          
            JasperDesign design=JRXmlLoader.load(path);
            JRDesignQuery query=new JRDesignQuery();
            query.setText(sql);
            design.setQuery(query);
            JasperReport report=JasperCompileManager.compileReport(design);
            JasperPrint pr=JasperFillManager.fillReport(report,null,con);
            JasperViewer.viewReport(pr, false);
                 }catch(Exception ex){
        JOptionPane.showMessageDialog(null, ex.getMessage());
    }
//    
//}
//    public void viewDash(String select_suMbalance_Lacag_FROM_accounts, String ff, RSMaterialButtonRectangle AccountCount) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    private void getConnection() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//
//   
}
}

