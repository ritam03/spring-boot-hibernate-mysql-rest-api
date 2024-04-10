package in.rp.springbootcrud.springbootcrudapi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import in.rp.springbootcrud.springbootcrudapi.dao.GamerDAO;
import in.rp.springbootcrud.springbootcrudapi.model.Gamer;

@Service
public class GamerServiceImpl implements GamerService {

    @Autowired
    private GamerDAO gamerDAO;

    @Transactional
    @Override
    public List<Gamer> get() {
        return gamerDAO.get();
    }

    @Transactional
    @Override
    public Gamer get(int id) {
        return gamerDAO.get(id);
    }

    @Transactional
    @Override
    public void save(Gamer gamer) {
        gamerDAO.save(gamer);
    }

    @Transactional
    @Override
    public void delete(int id) {
        gamerDAO.delete(id);
    }

}