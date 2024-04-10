package in.rp.springbootcrud.springbootcrudapi.dao;

import java.util.List;

import jakarta.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



import in.rp.springbootcrud.springbootcrudapi.model.Gamer;

@Repository
public class GamerDAOImpl implements GamerDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Gamer> get() {
        Session currentSession = entityManager.unwrap(Session.class);
        Query<Gamer> query = currentSession.createQuery("from Gamer", Gamer.class);
        List<Gamer> list = query.getResultList();
        return list;
    }

    @Override
    public Gamer get(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Gamer gamerObj = currentSession.get(Gamer.class, id);
        return gamerObj;
    }

    @Override
    public void save(Gamer gamer) {
        Session currentSession = entityManager.unwrap(Session.class);
        currentSession.saveOrUpdate(gamer);
    }

    @Override
    public void delete(int id) {
        Session currentSession = entityManager.unwrap(Session.class);
        Gamer gamerObj = currentSession.get(Gamer.class, id);
        currentSession.delete(gamerObj);
    }

}