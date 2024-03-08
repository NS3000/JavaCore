package JDBC;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class Batch {
    public static void main(String[] args) throws SQLException, IOException {

        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
        PreparedStatement stm = con.prepareStatement("insert into accounts (name,age,mob_no,balance) values (?,?,?,?)");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){

            System.out.println("enter name");
            String name=br.readLine();
            System.out.println("enter age");
            String s1 = br.readLine();
            int age =Integer.parseInt(s1);
            System.out.println("mob_no");
            String mob_no = br.readLine();
            System.out.println("Enter balance");
            String bal = br.readLine();
            int balance = Integer.parseInt(bal);

            stm.setString(1,name);
            stm.setInt(2,age);
            stm.setString(3,mob_no);
            stm.setInt(4,balance);
            stm.addBatch();

            System.out.println("more?(y/n)");
            String ans = br.readLine();
            if(ans.equals("n")){break;}

        }

        stm.executeBatch();
        System.out.println("Executed successfully");



        String sel = "Select * from accounts";
        ResultSet rs = stm.executeQuery(sel);

        while(rs.next()) {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5));
        }
        con.close();
    }
}
