package tn.esprit.boukarimohamedraed4iet_i4.Services;

import tn.esprit.boukarimohamedraed4iet_i4.Domain.Employe;

import java.util.List;

public interface IEmployeServices {
    Employe getById(long id);
    Employe add(Employe entity);
    Employe update(Employe entity);
    void deleteById(long id);
    List<Employe> findAll();
}
