# Stratégies de fetch et de cascade

| Association | Fetch | Cascade / orphan removal | Justification |
|---|---|---|---|
| Contrat → Paiement | `LAZY` | `ALL` + `orphanRemoval = true` | Un paiement dépend de son contrat. Les opérations du contrat sont propagées à ses paiements et un paiement retiré de la collection est supprimé. |
| Agence → Vehicule | `LAZY` | Aucune | Un véhicule peut survivre à la suppression de son agence. |
| Agence → Employe | `LAZY` | Aucune | Un employé ne doit pas être supprimé automatiquement avec son agence. |
| Vehicule ↔ Equipement | `LAZY` | Aucune | Les équipements sont partagés entre plusieurs véhicules et utilisent un `Set`. |
| Client → Reservation | `LAZY` | `PERSIST` | La création d'un client peut persister ses nouvelles réservations, sans propager automatiquement les suppressions. |
| Reservation → Vehicule | `LAZY` | Aucune | Un véhicule existe indépendamment des réservations. |
| Reservation ↔ Contrat | `LAZY` | `ALL` côté `Reservation` | Le contrat est rattaché à une réservation et son cycle de vie est propagé depuis celle-ci. |
| Vehicule → Maintenance | `LAZY` | `PERSIST` | Une maintenance nouvellement créée avec un véhicule peut être persistée, sans cascade de suppression. |

Les associations vers des collections restent `LAZY` afin d'éviter de charger inutilement
l'ensemble des objets liés lors de la lecture d'une entité. Les associations `ManyToOne` et
`OneToOne`, qui sont `EAGER` par défaut en JPA, sont explicitement forcées à `LAZY`.
