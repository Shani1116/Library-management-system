
package DBConnect;

//import java.sql.Connection;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

public class connectdb {
    
    public static Connection connect(){
        
        Connection conn = null;
        
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
        }
        catch(Exception e){
        
            System.out.println(e);
        }
        
        return conn;
    
    }
    
}
