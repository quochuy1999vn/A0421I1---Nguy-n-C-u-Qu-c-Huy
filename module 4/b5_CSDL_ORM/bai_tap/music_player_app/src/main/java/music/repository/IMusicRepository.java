package music.repository;

import music.entity.Music;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface IMusicRepository {
    List<Music> findAll();

    Music findById(long id);

    void save(Music music);

    void remove(long id);
}
