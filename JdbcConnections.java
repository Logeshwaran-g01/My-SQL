package Utilities;

import java.sql.*;

public class JdbcConnections {
    public static void main(String[] args) {

       //Using JDBC

        String query = "select * from data;";

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jdbc?user=root&password=Lokki@0412");
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                System.out.println(resultSet.getInt(1)+" "+ resultSet.getString(2)
                +" "+ resultSet.getString(3)+" "+ resultSet.getDouble(4));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
