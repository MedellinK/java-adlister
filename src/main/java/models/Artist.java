package models;

public class Artist {

    private long id;
    private String artistName;
    private String recordName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public Artist() {
    }

public Artist(long id,String artistName) {
        this.artistName = artistName;
        this.id = id;
    }

    public Artist(long id, String artistName, String recordName) {
        this.id = id;
        this.artistName = artistName;
        this.recordName = recordName;
    }
}
