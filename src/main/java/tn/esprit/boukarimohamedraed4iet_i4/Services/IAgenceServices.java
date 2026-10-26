package tn.esprit.boukarimohamedraed4iet_i4.Services;

import tn.esprit.boukarimohamedraed4iet_i4.Domain.Agence;

import java.util.List;

public interface IAgenceServices {
    Agence getById(long id);
    Agence add(Agence entity);
    Agence update(Agence entity);
    void deleteById(long id);
    List<Agence> findAll();
}
