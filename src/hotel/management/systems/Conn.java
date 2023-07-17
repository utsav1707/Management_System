
package hotel.management.systems;

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    Conn() {
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotelmanagementsystem","root","Avengers@5030");
            s=c.createStatement();
        }
        catch(Exception  e){
            e.printStackTrace();
        }
    }
}
