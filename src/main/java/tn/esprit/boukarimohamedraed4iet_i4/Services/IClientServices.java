package tn.esprit.boukarimohamedraed4iet_i4.Services;

import tn.esprit.boukarimohamedraed4iet_i4.Domain.Client;

import java.util.List;

public interface IClientServices {
    Client getById(long id);
    Client add(Client entity);
    Client update(Client entity);
    void deleteById(long id);
    List<Client> findAll();
}
