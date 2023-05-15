package dao;

import com.mysql.cj.jdbc.Driver;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest {

    private static List<String> getArtistNames() {

        List<String> artistNames = new ArrayList<>();

        try {
            // Establish Connection to the database
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?useSSL=false",
                    "root",
                    "codeup"
            );
            // Create a statement
            Statement statement = connection.createStatement();
            // Execute statement
            ResultSet resultSet = statement.executeQuery("SELECT artist FROM codeup_test_db.albums");
            // Iterate over the results
            while (resultSet.next()) {
                // Add the name to the list of names
                artistNames.add(resultSet.getString("artist"));
            }
        } catch (SQLException sqlx) {
            sqlx.printStackTrace();
        }
        return artistNames;
    }

    public static void main(String[] args) {
        List<String> authorNames = getArtistNames();
        for (String artist : authorNames) {
            System.out.println(artist);
        }
    }

}
