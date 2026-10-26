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
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Maintenance;
import tn.esprit.boukarimohamedraed4iet_i4.Services.IMaintenanceServices;

import java.util.List;

@RestController
@RequestMapping("maintenances")
@RequiredArgsConstructor
public class MaintenanceRestController {
    private final IMaintenanceServices iMaintenanceServices;

    @PostMapping("add")
    public Maintenance create(@RequestBody Maintenance entity) {
        return iMaintenanceServices.add(entity);
    }

    @GetMapping("get/{id}")
    public Maintenance getById(@PathVariable long id) {
        return iMaintenanceServices.getById(id);
    }

    @PutMapping("update")
    public Maintenance update(@RequestBody Maintenance entity) {
        return iMaintenanceServices.update(entity);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable long id) {
        iMaintenanceServices.deleteById(id);
    }

    @GetMapping("all")
    public List<Maintenance> findAll() {
        return iMaintenanceServices.findAll();
    }
}
