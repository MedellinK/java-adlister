package dao;

import com.mysql.cj.jdbc.Driver;
import models.RecordName;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecordsDao extends Records {

    private Connection connection;

    public RecordsDao(Connection connection) {
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
    public List<RecordName> all() {
        List<RecordName> records = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM codeup_test_db.albums");
            while (resultSet.next()) {
                RecordName recordName = new Record(
                        resultSet.getLong("ID"),
                        resultSet.getString("Artist"),
                        resultSet.getString("Record_Name")
                );
                records.add(recordName);
            }
        } catch (SQLException sqlx) {
            throw new RuntimeException("Error retrieving all records.", sqlx);
        }
        return records;
    }

    @Override
    public void insert(RecordName recordName) {

    }
}
