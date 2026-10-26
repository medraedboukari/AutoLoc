package tn.esprit.boukarimohamedraed4iet_i4.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Agence;
import tn.esprit.boukarimohamedraed4iet_i4.Repository.IAgenceRepository;
import tn.esprit.boukarimohamedraed4iet_i4.Services.IAgenceServices;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgenceServiceImpl implements IAgenceServices {
    private final IAgenceRepository repository;

    @Override
    public Agence getById(long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Agence introuvable avec l'id : " + id));
    }

    @Override
    public Agence add(Agence entity) {
        return repository.save(entity);
    }

    @Override
    public Agence update(Agence entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Agence> findAll() {
        return repository.findAll();
    }
}
