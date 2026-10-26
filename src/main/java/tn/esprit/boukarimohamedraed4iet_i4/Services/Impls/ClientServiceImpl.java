package tn.esprit.boukarimohamedraed4iet_i4.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Client;
import tn.esprit.boukarimohamedraed4iet_i4.Repository.IClientRepository;
import tn.esprit.boukarimohamedraed4iet_i4.Services.IClientServices;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements IClientServices {
    private final IClientRepository repository;

    @Override
    public Client getById(long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Client introuvable avec l'id : " + id));
    }

    @Override
    public Client add(Client entity) {
        return repository.save(entity);
    }

    @Override
    public Client update(Client entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Client> findAll() {
        return repository.findAll();
    }
}
