package tn.esprit.boukarimohamedraed4iet_i4.WebController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Vehicule;
import tn.esprit.boukarimohamedraed4iet_i4.Services.IVehiculeServices;

@RestController
@RequestMapping("vehicules")
@RequiredArgsConstructor
public class VehiculeRestController {
    private final IVehiculeServices iVehiculeServices;

    @PostMapping("add")
    public Vehicule create(@RequestBody Vehicule vehicule) {
        return iVehiculeServices.add(vehicule);
    }

    @GetMapping("get/{id}")
    public Vehicule getById(@PathVariable long id) {
        return iVehiculeServices.getById(id);
    }

    @PutMapping("update")
    public Vehicule update(@RequestBody Vehicule vehicule) {
        return iVehiculeServices.update(vehicule);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable long id) {
        iVehiculeServices.deleteById(id);
    }

    @GetMapping("all")
    public java.util.List<Vehicule> findAll() {
        return iVehiculeServices.findAll();
    }
}
