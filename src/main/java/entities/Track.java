package entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name = "Track")
public class Track {
    @Column(name = "TrackId")
    @Id
    private int trackId;

    @Column(name = "Name")
    private String name;


    @Column(name = "AlbumId")
    private int albumId;

    @Column(name = "MediaTypeId")
    private int mediaTypeId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "genreid")
    private Genre genre;

    @Column(name = "Composer")
    private String composer;

    @Column(name = "Milliseconds")
    private int milliseconds;

    @Column(name = "Bytes")
    private int bytes;

    @Column(name = "UnitPrice")
    private double unitPrice;

    @Column(name = "available")
    private boolean available;

    @Column(name = "description")
    private String description;

    @Column(name = "labelid")
    private int labelid;

    private LocalDate publication;

    public Track() { }

    public Track(int trackId, String name, int albumId, int mediaTypeId, Genre genre, String composer,
                 int milliseconds, int bytes, double unitPrice, boolean available, String description,
                 int labelid, LocalDate publication) {
        this.trackId = trackId;
        this.name = name;
        this.albumId = albumId;
        this.mediaTypeId = mediaTypeId;
        this.genre = genre;
        this.composer = composer;
        this.milliseconds = milliseconds;
        this.bytes = bytes;
        this.unitPrice = unitPrice;
        this.available = available;
        this.description = description;
        this.labelid = labelid;
        this.publication = publication;
    }

    public int getTrackId() { return trackId; }

    public void setTrackId(int trackId) { this.trackId = trackId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public int getAlbumId() { return albumId; }

    public void setAlbumId(int albumId) { this.albumId = albumId; }

    public int getMediaTypeId() { return mediaTypeId; }

    public void setMediaTypeId(int mediaTypeId) { this.mediaTypeId = mediaTypeId; }

    public Genre getGenre() { return genre; }

    public void setGenreId(Genre genre) { this.genre = genre; }

    public String getComposer() { return composer; }

    public void setComposer(String composer) { this.composer = composer; }

    public int getMilliseconds() { return milliseconds; }

    public void setMilliseconds(int milliseconds) { this.milliseconds = milliseconds; }

    public int getBytes() { return bytes; }

    public void setBytes(int bytes) { this.bytes = bytes; }

    public double getUnitPrice() { return unitPrice; }

    public void setUnitPrice(double unitPrice) { this.unitPrice = unitPrice; }

    public void setGenre(Genre genre) { this.genre = genre; }

    public boolean isAvailable() { return available; }

    public void setAvailable(boolean available) { this.available = available; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }

    public int getLabelid() { return labelid; }

    public void setLabelid(int labelid) { this.labelid = labelid; }

    public LocalDate getPublication() { return publication; }

    public void setPublication(LocalDate publication) { this.publication = publication; }
}
