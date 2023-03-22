package it.softwareinside.harrypotter.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import it.softwareinside.harrypotter.models.Incantesimo;
import it.softwareinside.harrypotter.services.IncantesimoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class IncantesimoRestController {
    
    @Autowired
    IncantesimoService incantesimoS;

    @GetMapping("/print-spell")
    public Incantesimo print() {
        return incantesimoS.generate()[0];  
    }
    
    @GetMapping("/add-spell")
    public String add(){
        return incantesimoS.add();
    }

    @DeleteMapping("/delete-spell")
    public String delete(@RequestParam String id){
        return incantesimoS.delete(id);
    }

    @DeleteMapping("/delete-all")
    public String deleteAll(@RequestParam int pw){
        return incantesimoS.deleteAll(pw);
    }

    @GetMapping("/database")
    public Iterable<Incantesimo> database(){
        return incantesimoS.database();
    }

    @GetMapping("/find-spell")
    public Incantesimo find(@RequestParam String id){
        return incantesimoS.find(id);
    }
}
