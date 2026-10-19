package tn.esprit.boukarimohamedraed4iet_i4.Services;

import tn.esprit.boukarimohamedraed4iet_i4.Domain.Vehicule;

import java.util.List;

public interface IVehiculeServices {
    Vehicule getById(long id);
    Vehicule add(Vehicule vehicule);
    Vehicule update(Vehicule vehicule);
    void deleteById(long id);
    List<Vehicule> findAll();
}
