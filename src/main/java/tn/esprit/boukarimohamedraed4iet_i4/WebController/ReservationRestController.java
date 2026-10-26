package tn.esprit.boukarimohamedraed4iet_i4.WebController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Reservation;
import tn.esprit.boukarimohamedraed4iet_i4.Services.IReservationServices;

import java.util.List;

@RestController
@RequestMapping("reservations")
@RequiredArgsConstructor
public class ReservationRestController {
    private final IReservationServices iReservationServices;

    @PostMapping("add")
    public Reservation create(@RequestBody Reservation entity) {
        return iReservationServices.add(entity);
    }

    @GetMapping("get/{id}")
    public Reservation getById(@PathVariable long id) {
        return iReservationServices.getById(id);
    }

    @PutMapping("update")
    public Reservation update(@RequestBody Reservation entity) {
        return iReservationServices.update(entity);
    }

    @DeleteMapping("delete/{id}")
    public void delete(@PathVariable long id) {
        iReservationServices.deleteById(id);
    }

    @GetMapping("all")
    public List<Reservation> findAll() {
        return iReservationServices.findAll();
    }
}
