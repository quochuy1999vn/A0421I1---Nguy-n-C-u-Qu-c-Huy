package upload_songs.model;

import org.springframework.web.multipart.MultipartFile;

public class SongForm {
    private String name;
    private String singer;
    private String kindOfMusic;
    private MultipartFile link;

    public SongForm() {
    }

    public SongForm(String name, String singer, String kindOfMusic, MultipartFile link) {
        this.name = name;
        this.singer = singer;
        this.kindOfMusic = kindOfMusic;
        this.link = link;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getKindOfMusic() {
        return kindOfMusic;
    }

    public void setKindOfMusic(String kindOfMusic) {
        this.kindOfMusic = kindOfMusic;
    }

    public MultipartFile getLink() {
        return link;
    }

    public void setLink(MultipartFile link) {
        this.link = link;
    }
}
