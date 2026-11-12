package tn.esprit.boukarimohamedraed4iet_i4.Domain;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idContrat;

    private LocalDate dateSignature;
    private BigDecimal montantTotal;
    private boolean valide;

    @JsonBackReference
    @OneToOne(fetch = FetchType.LAZY)
    @ToString.Exclude
    private Reservation reservation;

    @JsonManagedReference
    @OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL,
            orphanRemoval = true, fetch = FetchType.LAZY)
    @ToString.Exclude
    private List<Paiement> paiements = new ArrayList<>();
}
