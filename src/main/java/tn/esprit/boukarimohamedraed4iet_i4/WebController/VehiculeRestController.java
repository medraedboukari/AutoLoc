package tn.esprit.boukarimohamedraed4iet_i4.WebController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.boukarimohamedraed4iet_i4.Domain.Vehicule;
import tn.esprit.boukarimohamedraed4iet_i4.Services.IVehiculeServices;

@RestController
@RequestMapping("vehicules")
@RequiredArgsConstructor
public class VehiculeRestController {
    private final IVehiculeServices iVehiculeServices;

    @PostMapping("add")
    Vehicule create( Vehicule vehicule) {
        return iVehiculeServices.add(vehicule);
    }
}

