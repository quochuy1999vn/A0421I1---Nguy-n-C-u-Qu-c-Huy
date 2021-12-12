package upload_songs.service;

import upload_songs.model.Song;

import java.util.ArrayList;
import java.util.List;

public class SongService implements ISongService{
    List<Song> songList = new ArrayList<>();
    @Override
    public List<Song> findAll() {
        return songList;
    }

    @Override
    public void save(Song song) {
        songList.add(song);
    }

    @Override
    public Song findById(String name) {
        return songList.get(Integer.parseInt(name));
    }

    @Override
    public void update(String name, Song song) {
        for(Song s : songList) {
            if (s.getName() == name) {
                s = song;
                break;
            }
        }
    }

    @Override
    public void remove(String name) {
        for(int i = 0; i < songList.size(); i++) {
            if (songList.get(Integer.parseInt(name)).getName() == name) {
                songList.remove(name);
                break;
            }
        }
    }
}
