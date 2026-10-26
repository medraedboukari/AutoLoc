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
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Client;
import tn.esprit.boukarimohamedraed4iet_i4.Services.IClientServices;

import java.util.List;

@RestController
@RequestMapping("clients")
@RequiredArgsConstructor
public class ClientRestController {
    private final IClientServices iClientServices;

    @PostMapping("add")
    public Client create(@RequestBody Client entity) {
        return iClientServices.add(entity);
    }

    @GetMapping("get/{id}")
    public Client getById(@PathVariable long id) {
        return iClientServices.getById(id);
    }

    @PutMapping("update")
    public Client update(@RequestBody Client entity) {
        return iClientServices.update(entity);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable long id) {
        iClientServices.deleteById(id);
    }

    @GetMapping("all")
    public List<Client> findAll() {
        return iClientServices.findAll();
    }
}
