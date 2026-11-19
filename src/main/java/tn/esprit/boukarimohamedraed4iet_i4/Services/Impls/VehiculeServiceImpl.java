package tn.esprit.boukarimohamedraed4iet_i4.Services.Impls;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Agence;
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Equipement;
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Vehicule;
import tn.esprit.boukarimohamedraed4iet_i4.Repository.IAgenceRepository;
import tn.esprit.boukarimohamedraed4iet_i4.Repository.IEquipementRepository;
import tn.esprit.boukarimohamedraed4iet_i4.Repository.IVehiculeRepository;
import tn.esprit.boukarimohamedraed4iet_i4.Services.IVehiculeServices;

import java.util.List;
@Service
@RequiredArgsConstructor

public class VehiculeServiceImpl implements IVehiculeServices {
    private final IVehiculeRepository iVehiculeRepository;
    private final IAgenceRepository iAgenceRepository;
    private final IEquipementRepository iEquipementRepository;

    @Override
    public Vehicule getById(long id) {
        return iVehiculeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Vehicule introuvable avec l'id : " + id));
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

    @Override
    @Transactional
    public Vehicule assignToAgence(Long vehiculeId, Long agenceId) {
        Vehicule vehicule = getById(vehiculeId);
        Agence agence = iAgenceRepository.findById(agenceId)
                .orElseThrow(() -> new EntityNotFoundException("Agence introuvable avec l'id : " + agenceId));
        //affectation du vehicule à l'agence
        vehicule.setAgence(agence);
        return iVehiculeRepository.save(vehicule);
    }

    @Override
    @Transactional
    public Vehicule assignToEquipement(Long vehiculeId, Long equipementId) {
        Vehicule vehicule = getById(vehiculeId);
        Equipement equipement = iEquipementRepository.findById(equipementId)
                .orElseThrow(() -> new EntityNotFoundException("Equipement introuvable avec l'id : " + equipementId));

        vehicule.getEquipements().add(equipement);
        return iVehiculeRepository.save(vehicule);
    }
}
