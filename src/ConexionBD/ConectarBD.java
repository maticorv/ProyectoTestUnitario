package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConectarBD {
    private static Connection  con = null;
    private static final String driver ="com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://127.0.0.1/ma-tematica";
    private static final String user = "root";
    private static final String pass = "";
    
 
    
    public ConectarBD() {
    }

    public Connection getCon() throws SQLException {
        try{
            //Cargar la conexion
            Class.forName (driver);
            
            con = DriverManager.getConnection (url,user,pass);
            
            System.out.println("Conexion establecida");
            
            //JOptionPane.showMessageDialog(null,"Conexion esta establecida" );
            
        }catch (ClassNotFoundException | SQLException e){
            
            System.out.println("Error en la conexion");
            
            JOptionPane.showMessageDialog(null,"Error de conexion" +e);
            
        }
        return con;
        
    }

    public void setCon(Connection con) {
        ConectarBD.con = con;
    }

   
    
    
}