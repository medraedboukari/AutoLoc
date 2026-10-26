package tn.esprit.boukarimohamedraed4iet_i4.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Equipement;
import tn.esprit.boukarimohamedraed4iet_i4.Repository.IEquipementRepository;
import tn.esprit.boukarimohamedraed4iet_i4.Services.IEquipementServices;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementServiceImpl implements IEquipementServices {
    private final IEquipementRepository repository;

    @Override
    public Equipement getById(long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Equipement introuvable avec l'id : " + id));
    }

    @Override
    public Equipement add(Equipement entity) {
        return repository.save(entity);
    }

    @Override
    public Equipement update(Equipement entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Equipement> findAll() {
        return repository.findAll();
    }
}
