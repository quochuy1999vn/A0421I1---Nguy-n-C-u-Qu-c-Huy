package music.service;

import music.entity.Music;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IMusicService {
    List<Music> findAll();

    Music findById(long id);

    void save(Music music);

    void remove(long id);
}
