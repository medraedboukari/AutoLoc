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
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Employe;
import tn.esprit.boukarimohamedraed4iet_i4.Services.IEmployeServices;

import java.util.List;

@RestController
@RequestMapping("employes")
@RequiredArgsConstructor
public class EmployeRestController {
    private final IEmployeServices iEmployeServices;

    @PostMapping("add")
    public Employe create(@RequestBody Employe entity) {
        return iEmployeServices.add(entity);
    }

    @GetMapping("get/{id}")
    public Employe getById(@PathVariable long id) {
        return iEmployeServices.getById(id);
    }

    @PutMapping("update")
    public Employe update(@RequestBody Employe entity) {
        return iEmployeServices.update(entity);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable long id) {
        iEmployeServices.deleteById(id);
    }

    @GetMapping("all")
    public List<Employe> findAll() {
        return iEmployeServices.findAll();
    }
}
