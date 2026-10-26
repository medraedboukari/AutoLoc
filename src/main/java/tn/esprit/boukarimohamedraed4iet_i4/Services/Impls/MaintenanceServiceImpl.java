package tn.esprit.boukarimohamedraed4iet_i4.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Maintenance;
import tn.esprit.boukarimohamedraed4iet_i4.Repository.IMaintenanceRepository;
import tn.esprit.boukarimohamedraed4iet_i4.Services.IMaintenanceServices;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MaintenanceServiceImpl implements IMaintenanceServices {
    private final IMaintenanceRepository repository;

    @Override
    public Maintenance getById(long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Maintenance introuvable avec l'id : " + id));
    }

    @Override
    public Maintenance add(Maintenance entity) {
        return repository.save(entity);
    }

    @Override
    public Maintenance update(Maintenance entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Maintenance> findAll() {
        return repository.findAll();
    }
}
