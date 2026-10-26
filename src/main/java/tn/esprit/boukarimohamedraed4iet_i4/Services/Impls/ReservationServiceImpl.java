package tn.esprit.boukarimohamedraed4iet_i4.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Reservation;
import tn.esprit.boukarimohamedraed4iet_i4.Repository.IReservationRepository;
import tn.esprit.boukarimohamedraed4iet_i4.Services.IReservationServices;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationServiceImpl implements IReservationServices {
    private final IReservationRepository repository;

    @Override
    public Reservation getById(long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Reservation introuvable avec l'id : " + id));
    }

    @Override
    public Reservation add(Reservation entity) {
        return repository.save(entity);
    }

    @Override
    public Reservation update(Reservation entity) {
        return repository.save(entity);
    }

    @Override
    public void deleteById(long id) {
        repository.deleteById(id);
    }

    @Override
    public List<Reservation> findAll() {
        return repository.findAll();
    }
}
