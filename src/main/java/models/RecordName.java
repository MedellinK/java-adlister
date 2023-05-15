package models;

public class RecordName {

    private long id;
    private String recordName;
    private Artist artist;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

public RecordName() {
    }

    public RecordName(long id, String recordName, Artist artist) {
        this.id = id;
        this.recordName = recordName;
        this.artist = artist;
    }
}
