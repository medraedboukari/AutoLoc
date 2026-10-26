package tn.esprit.boukarimohamedraed4iet_i4.Services;

import tn.esprit.boukarimohamedraed4iet_i4.Domain.Equipement;

import java.util.List;

public interface IEquipementServices {
    Equipement getById(long id);
    Equipement add(Equipement entity);
    Equipement update(Equipement entity);
    void deleteById(long id);
    List<Equipement> findAll();
}
