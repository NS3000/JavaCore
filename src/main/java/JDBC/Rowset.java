package JDBC;

import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
import java.sql.JDBCType;
import java.sql.SQLException;

public class Rowset {
    public static void main(String[] args) throws SQLException {
        JdbcRowSet rs = RowSetProvider.newFactory().createJdbcRowSet();

        rs.setUrl("jdbc:mysql://localhost:3306/test");
        rs.setUsername("root");
        rs.setPassword("root");
        rs.setCommand("select * from accounts");
        rs.execute();

        while(rs.next()){
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getInt(5));
        }

    }
}
