package tn.esprit.boukarimohamedraed4iet_i4.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Employe;
import tn.esprit.boukarimohamedraed4iet_i4.Repository.IEmployeRepository;
import tn.esprit.boukarimohamedraed4iet_i4.Services.IEmployeServices;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeServiceImpl implements IEmployeServices {
    private final IEmployeRepository repository;

    @Override
    public Employe getById(long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Employe introuvable avec l'id : " + id));
    }

    @Override
    public Employe add(Employe entity) {
        return repository.save(entity);
    }

    @Override
    public Employe update(Employe entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Employe> findAll() {
        return repository.findAll();
    }
}
