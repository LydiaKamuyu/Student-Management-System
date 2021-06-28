import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class The_Connection {
    
    private static String servername ="localhost";
     private static String dbname ="student_management_db";
      private static String username ="root";
       private static Integer portnumber =3306;
        private static String password ="";
           
        public static Connection getTheConnection()
        {
            Connection connection = null;
            
            MysqlDataSource datasource=new MysqlDataSource();
            datasource.setServerName(servername);
            datasource.setUser(username);
            datasource.setDatabaseName(dbname);
            datasource.setPortNumber(portnumber);
            datasource.setPassword(password);
            
        try {
            connection = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(The_Connection.class.getName()).log(Level.SEVERE, null, ex);
        }
          
            return connection;
        }
    static ResultSet getData(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }   
}
