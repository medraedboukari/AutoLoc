package tn.esprit.boukarimohamedraed4iet_i4.Domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDate;
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
    @OneToMany(mappedBy = "contrat", cascade = CascadeType.ALL)
    List<Paiement> paiementList;
}

