package tn.esprit.boukarimohamedraed4iet_i4.Domain;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    private long idAgence;

    private String nom;
    private String ville;
    private String adresse;
    private String telephone;
    @JsonIgnore
    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    @ToString.Exclude
    private List<Vehicule> vehicules = new ArrayList<>();

    @JsonIgnore
    @OneToMany(mappedBy = "agence", fetch = FetchType.LAZY)
    @Schema(accessMode = Schema.AccessMode.READ_ONLY)
    @ToString.Exclude
    private List<Employe> employes = new ArrayList<>();
}
