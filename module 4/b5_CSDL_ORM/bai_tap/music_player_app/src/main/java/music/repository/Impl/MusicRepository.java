package music.repository.Impl;

import music.entity.Music;
import music.repository.IMusicRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
public class MusicRepository implements IMusicRepository {

    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List findAll() {
        TypedQuery<Music> musicTypedQuery = entityManager.createQuery("select m from Music m", Music.class);
        return musicTypedQuery.getResultList();
    }

    @Override
    public Music findById(long id) {
        TypedQuery<Music> musicTypedQuery = entityManager.createQuery("select m from Music m where m.id =: id", Music.class);
        musicTypedQuery.setParameter("id", id);
        return musicTypedQuery.getSingleResult();
    }


    @Override
    public void save(Music music) {
        if (music.getId() < 0) {
            entityManager.merge(music);
        }else {
            entityManager.persist(music);
        }
    }


    @Override
    public void remove(long id) {
        Music music = findById(id);
        if (music != null) {
            entityManager.remove(music);
        }
    }
}
