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
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Equipement;
import tn.esprit.boukarimohamedraed4iet_i4.Services.IEquipementServices;

import java.util.List;

@RestController
@RequestMapping("equipements")
@RequiredArgsConstructor
public class EquipementRestController {
    private final IEquipementServices iEquipementServices;

    @PostMapping("add")
    public Equipement create(@RequestBody EquipementRequest request) {
        Equipement equipement = new Equipement();
        equipement.setLibelle(request.libelle());
        return iEquipementServices.add(equipement);
    }

    @GetMapping("get/{id}")
    public Equipement getById(@PathVariable long id) {
        return iEquipementServices.getById(id);
    }

    @PutMapping("update")
    public Equipement update(@RequestBody Equipement entity) {
        return iEquipementServices.update(entity);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable long id) {
        iEquipementServices.deleteById(id);
    }

    @GetMapping("all")
    public List<Equipement> findAll() {
        return iEquipementServices.findAll();
    }
}
