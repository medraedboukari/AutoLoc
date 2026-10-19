package tn.esprit.boukarimohamedraed4iet_i4.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Vehicule;
import tn.esprit.boukarimohamedraed4iet_i4.Repository.IVehiculeRepository;
import tn.esprit.boukarimohamedraed4iet_i4.Services.IVehiculeServices;

import java.util.List;
@Service
@RequiredArgsConstructor

public class VehiculeServiceImpl implements IVehiculeServices {
    private final IVehiculeRepository iVehiculeRepository;

    @Override
    public Vehicule getById(long id) {
        return iVehiculeRepository.findById(id).get();
    }

    @Override
    public Vehicule add(Vehicule vehicule) {
        return iVehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule update(Vehicule vehicule) {
        return iVehiculeRepository.save(vehicule);
    }

    @Override
    public void deleteById(long id) {
        iVehiculeRepository.deleteById(id);

    }

    @Override
    public List<Vehicule> findAll() { return iVehiculeRepository.findAll(); }
    }
