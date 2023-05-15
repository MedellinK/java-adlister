package dao;

import com.mysql.cj.jdbc.Driver;
import models.Artist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArtistDao implements Artists {

    private Connection connection;

    public ArtistDao(){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?useSSL=false",
                    "root",
                    "codeup"
            );
        } catch (SQLException sqlx) {
            throw new RuntimeException("Error connecting to the database!", sqlx);
        }
    }

    @Override
    public List<Artist> all() {
        List<Artist> artists = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            // Execute statement
            ResultSet resultSet = statement.executeQuery("SELECT * FROM codeup_test_db.albums");
            // Iterate over the results
            while (resultSet.next()) {
                Artist artist = new Artist(
                        resultSet.getLong("ID"),
                        resultSet.getString("Artist"),
                        resultSet.getString("Record_Name")
                );
                // Add the name to the list of names
                artists.add(artist);
            }
            } catch (SQLException sqlx) {
                throw new RuntimeException("Error retrieving all artists.", sqlx);
            }
            return artists;
        }



    @Override
    public void insert(Artist artist) {

    }
}
