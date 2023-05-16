import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads{

    private Connection connection;

//    This class should have a private instance property named connection of type Connection that is initialized in the constructor. Define your constructor so that it accepts an instance of your Config class so that it can obtain the database credentials.

    public MySQLAdsDao(){
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    Config.getUrl(),
                    Config.getUser(),
                    Config.getPassword());
        } catch (SQLException sqlx){
            throw new RuntimeException("Error connecting to db", sqlx);
        }
    }


    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM adlister_db.ads");
            while (resultSet.next()) {
                Ad ad = new Ad(
                        resultSet.getLong("id"),
                        resultSet.getLong("user_id"),
                        resultSet.getString("title"),
                        resultSet.getString("description")
                );
                ads.add(ad);
            }
        } catch (SQLException sqlx) {
            throw new RuntimeException("error connecting to db", sqlx);
        }
        return ads;
    }


    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
