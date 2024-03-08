package JDBC;

import java.sql.*;
import java.util.Scanner;

public class Conn {
    public static void main(String[] args) throws ServerStoppedException {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            Statement statement = connection.createStatement();
        
            Scanner scanner = new Scanner(System.in);

            String createQuery = "create table if not exists accounts ( acc_no int primary key auto_increment, name varchar(25) , age int, mob_no varchar(10) not null, balance int default 0);";
            statement.execute(createQuery);
            String insertQuery = "insert into accounts (name,age,mob_no,balance) values (?,?,?,?)";
            PreparedStatement parameterizedQuery = connection.prepareStatement(insertQuery);

            String name;
            int age;
            String mobileNo;
            int balance;

            System.out.println("Enter name");
            while (!scanner.hasNext("[A-Za-z]+")) {
                System.out.println("enter alphabets only .");
                scanner.nextLine();
            }
            name = scanner.nextLine();

            System.out.println("Enter age");
            while (!(scanner.hasNextInt())) {
                System.out.println("enter valid age");
                scanner.next();
            }
            age = scanner.nextInt();

            System.out.println("Mobile no");
            while (!scanner.hasNext("[1-9]+")) {
                System.out.println("enter numbers only");
                scanner.next();
            }
            mobileNo = scanner.nextLine();
            scanner.next();

            System.out.println("Enter balance");
            while (!(scanner.hasNextInt())) {
                System.out.println("enter valid balance");
                scanner.nextLine();
            }
            balance = scanner.nextInt();

            parameterizedQuery.setString(1, name);
            parameterizedQuery.setInt(2, age);
            parameterizedQuery.setString(3, mobileNo);
            parameterizedQuery.setInt(4, balance);


            parameterizedQuery.execute();

            String selectQuery = "Select * from accounts";
            ResultSet result = statement.executeQuery(selectQuery);

            while (result.next()) {
                System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getInt(3) + " " + result.getString(4) + " " + result.getInt(5));
            }

            connection.close();

        }catch( SQLException sqlException){
            throw new ServerStoppedException();
        }

    }
}
class ServerStoppedException extends Exception{
    ServerStoppedException(){
        super("SQL Server Not Running");
    }
}
