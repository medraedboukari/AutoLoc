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
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Paiement;
import tn.esprit.boukarimohamedraed4iet_i4.Services.IPaiementServices;

import java.util.List;

@RestController
@RequestMapping("paiements")
@RequiredArgsConstructor
public class PaiementRestController {
    private final IPaiementServices iPaiementServices;

    @PostMapping("add")
    public Paiement create(@RequestBody Paiement entity) {
        return iPaiementServices.add(entity);
    }

    @GetMapping("get/{id}")
    public Paiement getById(@PathVariable long id) {
        return iPaiementServices.getById(id);
    }

    @PutMapping("update")
    public Paiement update(@RequestBody Paiement entity) {
        return iPaiementServices.update(entity);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable long id) {
        iPaiementServices.deleteById(id);
    }

    @GetMapping("all")
    public List<Paiement> findAll() {
        return iPaiementServices.findAll();
    }
}
