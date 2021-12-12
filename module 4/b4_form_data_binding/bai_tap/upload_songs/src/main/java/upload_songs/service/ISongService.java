package upload_songs.service;

import upload_songs.model.Song;

import java.util.List;

public interface ISongService {
    List<Song> findAll();

    void save(Song song);

    Song findById(String name);

    void update(String name, Song song);

    void remove(String name);
}
