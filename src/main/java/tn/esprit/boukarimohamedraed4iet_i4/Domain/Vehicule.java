package tn.esprit.boukarimohamedraed4iet_i4.Domain;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString

public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
      private long idvehicule;
      private String immatriculation;
      private String marque;
      private String modele;
    @Enumerated(value=EnumType.STRING)

    private CategorieVehicule categorie;
      private BigDecimal tarifJournalier;
      @Enumerated(value=EnumType.STRING)
      private StatutVehicule statut;

  @ManyToMany
  List<Equipement> equipements;
  @ManyToOne
    Agence agence;
}
