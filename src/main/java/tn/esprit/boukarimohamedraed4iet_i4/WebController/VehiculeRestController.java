package tn.esprit.boukarimohamedraed4iet_i4.WebController;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
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
@Tag(name="Vehicule Management", description="Gestion: vehicule")
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

    @PutMapping("assign/{vehiculeId}/to/{agenceId}")
    public Vehicule assignToAgence(@PathVariable Long vehiculeId, @PathVariable Long agenceId) {
        return iVehiculeServices.assignToAgence(vehiculeId, agenceId);
    }

    @PutMapping("assign/{vehiculeId}/to/equipement/{equipementId}")
    public Vehicule assignToEquipement(@PathVariable Long vehiculeId, @PathVariable Long equipementId) {
        return iVehiculeServices.assignToEquipement(vehiculeId, equipementId);
    }

    @ExceptionHandler(EntityNotFoundException.class)
    @org.springframework.web.bind.annotation.ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNotFound(EntityNotFoundException exception) {
        return exception.getMessage();
    }
}
