package tn.esprit.boukarimohamedraed4iet_i4.Domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Equipement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idEquipement;

    private String libelle;

    @JsonIgnore
    @ManyToMany(mappedBy = "equipements", fetch = FetchType.LAZY)
    @ToString.Exclude
    private Set<Vehicule> vehicules = new HashSet<>();
}
