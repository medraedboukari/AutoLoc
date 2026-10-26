package tn.esprit.boukarimohamedraed4iet_i4.Services;

import tn.esprit.boukarimohamedraed4iet_i4.Domain.Reservation;

import java.util.List;

public interface IReservationServices {
    Reservation getById(long id);
    Reservation add(Reservation entity);
    Reservation update(Reservation entity);
    void deleteById(long id);
    List<Reservation> findAll();
}
