package tn.esprit.boukarimohamedraed4iet_i4.Domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
      @Schema(accessMode = Schema.AccessMode.READ_ONLY)
      private Long idvehicule;
      private String immatriculation;
      private String marque;
      private String modele;
    @Enumerated(value=EnumType.STRING)

    private CategorieVehicule categorie;
      private BigDecimal tarifJournalier;
      @Enumerated(value=EnumType.STRING)
      private StatutVehicule statut;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    @ToString.Exclude
    private Agence agence;

    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "vehicule_equipement",
            joinColumns = @JoinColumn(name = "vehicule_idvehicule"),
            inverseJoinColumns = @JoinColumn(name = "equipement_idequipement")
    )
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    @ToString.Exclude
    private Set<Equipement> equipements = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy = "vehicule", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    @ToString.Exclude
    private List<Maintenance> maintenances = new ArrayList<>();
}
