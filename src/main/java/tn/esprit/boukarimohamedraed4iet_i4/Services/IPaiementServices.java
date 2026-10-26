package tn.esprit.boukarimohamedraed4iet_i4.Services;

import tn.esprit.boukarimohamedraed4iet_i4.Domain.Paiement;

import java.util.List;

public interface IPaiementServices {
    Paiement getById(long id);
    Paiement add(Paiement entity);
    Paiement update(Paiement entity);
    void deleteById(long id);
    List<Paiement> findAll();
}
