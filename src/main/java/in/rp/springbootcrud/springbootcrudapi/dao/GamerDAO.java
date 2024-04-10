package in.rp.springbootcrud.springbootcrudapi.dao;

import java.util.List;

import in.rp.springbootcrud.springbootcrudapi.model.Gamer;

public interface GamerDAO {

    List<Gamer> get();

    Gamer get(int id);

    void save(Gamer gamer);

    void delete(int id);
}