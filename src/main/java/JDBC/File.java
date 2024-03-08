package JDBC;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.sql.*;

public class File {
    public static void main(String[] args) {
       try {
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/images", "root", "root");
           PreparedStatement ps = con.prepareStatement("insert into files values ( ?,?)");

           FileReader fr = new FileReader("AnyDesk.exe");
           ps.setString(1,"executable");
           ps.setCharacterStream(2,fr);

           int i =ps.executeUpdate();
           System.out.println(i+ " rows updated");

           FileWriter fw = new FileWriter("written.exe");
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("select * from files where name = 'executable'");

           rs.next();
           Clob c = rs.getClob(2);
           Reader fr1 = c.getCharacterStream();

           while((i=fr1.read())!=-1){
               fw.write(i);
           }
           System.out.println("Written Successfully");

       }catch (Exception e){
           System.out.println(e);
       }
    }
}
