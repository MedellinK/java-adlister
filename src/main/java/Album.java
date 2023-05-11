//Referring back to the Database Design lesson, create beans for the quotes and authors tables (Quote and Author). Instead of including a foreign key property in the Quote class, include an Author property.

import java.io.Serializable;

public class Album implements Serializable {

    private int id;
    private String artist;
    private String recordName;
    private String releaseYear;
    private String sales;
    private String genre;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public String getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(String releaseYear) {
        this.releaseYear = releaseYear;
    }

    public String getSales() {
        return sales;
    }

    public void setSales(String sales) {
        this.sales = sales;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Album() {
    }


    public Album(int id, String artist, String recordName, String releaseYear) {
        this.id = id;
        this.artist = artist;
        this.recordName = recordName;
        this.releaseYear = releaseYear;
    }

    public Album(int id, String artist, String recordName, String releaseYear, String sales) {
        this.id = id;
        this.artist = artist;
        this.recordName = recordName;
        this.releaseYear = releaseYear;
        this.sales = sales;
    }

    public Album(int id, String artist, String recordName, String releaseYear, String sales, String genre) {
        this.id = id;
        this.artist = artist;
        this.recordName = recordName;
        this.releaseYear = releaseYear;
        this.sales = sales;
        this.genre = genre;
    }

}
