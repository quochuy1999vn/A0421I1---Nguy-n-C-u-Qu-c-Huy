package music.service.Impl;

import music.entity.Music;
import music.repository.IMusicRepository;
import music.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MusicService implements IMusicService {

    @Autowired
    IMusicRepository musicRepository;
    @Override
    public List<Music> findAll() {
        return musicRepository.findAll();
    }

    @Override
    public Music findById(long id) {
        return musicRepository.findById(id);
    }

    @Override
    public void save(Music music) {
        musicRepository.save(music);
    }

    @Override
    public void remove(long id) {
        musicRepository.remove(id);
    }
}
