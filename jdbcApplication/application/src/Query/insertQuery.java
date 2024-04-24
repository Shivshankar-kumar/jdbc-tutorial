
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.lang.Exception;

public class insertQuery {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement st=null;

        //make connection

        conn=connection.getJdbcConnection();
        if(conn!=null){
                try{
                    String query="INSERT INTO student(name, age, city) VALUES('jiyaambani','23', 'Mumbai')";
                st=conn.prepareStatement(query);
                //Upate Query for inserting data into DB Query Using Statement
                int rowAffected=st.executeUpdate();
                if(rowAffected==1){
                    System.out.println("Row inserted");
                }else{
                    System.out.println("Row not inserted");
                }
            }catch(Exception e){
            System.out.println("Execeptioin Occured at line: 26 "+e);
        }
        finally{
            connection.closeResource(conn,st);
        }
    }
}
}