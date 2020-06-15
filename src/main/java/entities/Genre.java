package entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "genre")
public class Genre {

    @Id
    @Column(name = "genreid")
    private int genreId;

    @Column(name = "Name")
    private String name;

    @OneToMany(
            mappedBy = "genre",
            cascade = CascadeType.ALL
    )
    private List<Track> tracks = new ArrayList<>();

    public Genre() { }

    public Genre(int genreId, String name) {
        this.genreId = genreId;
        this.name = name;
    }

    public int getGenreId() {
        return genreId;
    }

    public void setGenreId(int genreId) {
        this.genreId = genreId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Track> getTracks() { return tracks; }

    public void setTracks(List<Track> tracks) { this.tracks = tracks; }
}
