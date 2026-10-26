package tn.esprit.boukarimohamedraed4iet_i4.Services;

import tn.esprit.boukarimohamedraed4iet_i4.Domain.Contrat;

import java.util.List;

public interface IContratServices {
    Contrat getById(long id);
    Contrat add(Contrat entity);
    Contrat update(Contrat entity);
    void deleteById(long id);
    List<Contrat> findAll();
}
