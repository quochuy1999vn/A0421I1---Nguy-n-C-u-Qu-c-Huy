package music.entity;

import javax.persistence.*;

@Entity
@Table(name = "music_player_app")
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private String kindOfMusic;
    private String link;

    public Music() {
    }

    public Music(long id, String name, String kindOfMusic, String link) {
        this.id = id;
        this.name = name;
        this.kindOfMusic = kindOfMusic;
        this.link = link;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
