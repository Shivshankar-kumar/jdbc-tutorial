
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class connection {
    //establish connection
    public static Connection getJdbcConnection(){
        Connection conn=null;
        // try{
        // FileInputStream fis=new FileInputStream("/application/app.properties");
        // //properties is a sub-class of Hashtable
        // Properties p=new Properties();
        // p.load(fis);

        // //to access the value from file
        // String url=p.getProperty("url");
        // String user=p.getProperty("user");
        // String password=p.getProperty("password");
        // System.out.println(url);
        // System.out.println(user);
        // System.out.println(password);
        try{
        String url="jdbc:postgresql://localhost:5432/studentinfo";
        String user="postgres";
        String password="123";
        //load the driver
        conn=DriverManager.getConnection(url, user, password);
        
        }catch(SQLException e){
            System.out.println(e);
        }
        return conn;
    }

    public static void closeResource(Connection conn,PreparedStatement st){
        if(conn!=null){
            try{
            conn.close();
        }catch(SQLException sq){
            System.out.println(sq);
        }
    }
        if(st!=null){
            try{
            st.close();
        }catch(SQLException sq){
            System.out.println(sq);
        }
        }
    }
}
