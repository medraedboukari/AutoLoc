package tn.esprit.boukarimohamedraed4iet_i4.WebController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Agence;
import tn.esprit.boukarimohamedraed4iet_i4.Services.IAgenceServices;

import java.util.List;

@RestController
@RequestMapping("agences")
@RequiredArgsConstructor
public class AgenceRestController {
    private final IAgenceServices iAgenceServices;

    @PostMapping("add")
    public Agence create(@RequestBody AgenceRequest request) {
        Agence agence = new Agence();
        agence.setNom(request.nom());
        agence.setVille(request.ville());
        agence.setAdresse(request.adresse());
        agence.setTelephone(request.telephone());
        return iAgenceServices.add(agence);
    }

    @GetMapping("get/{id}")
    public Agence getById(@PathVariable long id) {
        return iAgenceServices.getById(id);
    }

    @PutMapping("update")
    public Agence update(@RequestBody Agence entity) {
        return iAgenceServices.update(entity);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable long id) {
        iAgenceServices.deleteById(id);
    }

    @GetMapping("all")
    public List<Agence> findAll() {
        return iAgenceServices.findAll();
    }
}
