import java.sql.Connection;
import java.sql.DriverManager;
public class DBConnection {
    public static Connection getConnection(){
        Connection con=null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection ("jdbc:mysql://Localhost:3306/bank_management","root","");
             System.out.println("Connection Established");
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
            return null;
        }
        return con;

    }
    
}

