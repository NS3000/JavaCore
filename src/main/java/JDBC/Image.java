package JDBC;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.*;

public class Image {
    public static void main(String[] args) {
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/images","root" ,"root");
            PreparedStatement ps = con.prepareStatement("insert into photo values (?, ?)");

            FileInputStream fi = new FileInputStream("cat.jpg");

            ps.setString(1,"cat");
            ps.setBinaryStream(2,fi,fi.available());

            int i = ps.executeUpdate();

            System.out.println(i+ " records affected");

            FileOutputStream fo = new FileOutputStream("chair.jpg");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("Select * from photo where name = 'cat'");

            rs.next();
            Blob b = rs.getBlob(2);
            byte[] ba= b.getBytes(1,(int) b.length());
            fo.write(ba);


        }catch(Exception e){
            System.out.println(e);
        }
    }
}
