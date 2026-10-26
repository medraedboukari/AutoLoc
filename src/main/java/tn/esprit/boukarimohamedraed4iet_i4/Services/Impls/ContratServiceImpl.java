package tn.esprit.boukarimohamedraed4iet_i4.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Contrat;
import tn.esprit.boukarimohamedraed4iet_i4.Repository.IContratRepository;
import tn.esprit.boukarimohamedraed4iet_i4.Services.IContratServices;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratServiceImpl implements IContratServices {
    private final IContratRepository repository;

    @Override
    public Contrat getById(long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Contrat introuvable avec l'id : " + id));
    }

    @Override
    public Contrat add(Contrat entity) {
        return repository.save(entity);
    }

    @Override
    public Contrat update(Contrat entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Contrat> findAll() {
        return repository.findAll();
    }
}
