package in.rp.springbootcrud.springbootcrudapi.service;

import java.util.List;

import in.rp.springbootcrud.springbootcrudapi.model.Gamer;

public interface GamerService {

    List<Gamer> get();

    Gamer get(int id);

    void save(Gamer gamer);

    void delete(int id);
}