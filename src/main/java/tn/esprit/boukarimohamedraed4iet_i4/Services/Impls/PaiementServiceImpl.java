package tn.esprit.boukarimohamedraed4iet_i4.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Paiement;
import tn.esprit.boukarimohamedraed4iet_i4.Repository.IPaiementRepository;
import tn.esprit.boukarimohamedraed4iet_i4.Services.IPaiementServices;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaiementServiceImpl implements IPaiementServices {
    private final IPaiementRepository repository;

    @Override
    public Paiement getById(long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Paiement introuvable avec l'id : " + id));
    }

    @Override
    public Paiement add(Paiement entity) {
        return repository.save(entity);
    }

    @Override
    public Paiement update(Paiement entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Paiement> findAll() {
        return repository.findAll();
    }
}
