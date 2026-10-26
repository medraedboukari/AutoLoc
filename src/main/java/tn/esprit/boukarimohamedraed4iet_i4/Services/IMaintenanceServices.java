package tn.esprit.boukarimohamedraed4iet_i4.Services;

import tn.esprit.boukarimohamedraed4iet_i4.Domain.Maintenance;

import java.util.List;

public interface IMaintenanceServices {
    Maintenance getById(long id);
    Maintenance add(Maintenance entity);
    Maintenance update(Maintenance entity);
    void deleteById(long id);
    List<Maintenance> findAll();
}
