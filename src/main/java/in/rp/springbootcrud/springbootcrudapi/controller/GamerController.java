package in.rp.springbootcrud.springbootcrudapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.rp.springbootcrud.springbootcrudapi.model.Gamer;
import in.rp.springbootcrud.springbootcrudapi.service.GamerService;

@RestController
@RequestMapping("/api")
public class GamerController {

    @Autowired
    private GamerService gamerService;

    @PostMapping("/gamer")
    public Gamer save(@RequestBody Gamer gamerObj) {
        gamerService.save(gamerObj);
        return gamerObj;
    }

    @GetMapping("/gamer")
    public List<Gamer> get(){
        return gamerService.get();
    }

    @GetMapping("/gamer/{id}")
    public Gamer get(@PathVariable int id) {
        Gamer gamerObj = gamerService.get(id);
        if(gamerObj == null) {
            throw new RuntimeException("Gamer not found for the Id:"+id);
        }
        return gamerObj;
    }

    @PutMapping("/gamer")
    public Gamer update(@RequestBody Gamer gamerObj) {
        gamerService.save(gamerObj);
        return gamerObj;
    }

    @DeleteMapping("/gamer/{id}")
    public String delete(@PathVariable int id) {
        gamerService.delete(id);
        return "Gamer has been deleted with id:"+id;
    }
}