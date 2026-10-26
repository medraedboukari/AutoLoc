package tn.esprit.boukarimohamedraed4iet_i4.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Client;

public interface IClientRepository extends JpaRepository<Client, Long> {
}
