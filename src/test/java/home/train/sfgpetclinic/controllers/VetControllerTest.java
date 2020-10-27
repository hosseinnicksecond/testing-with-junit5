package home.train.sfgpetclinic.controllers;

import home.train.sfgpetclinic.fauxSpring;
import home.train.sfgpetclinic.fauxspring.Model;
import home.train.sfgpetclinic.model.Vet;
import home.train.sfgpetclinic.services.SpecialtyService;
import home.train.sfgpetclinic.services.VetService;
import home.train.sfgpetclinic.services.map.SpecialityMapService;
import home.train.sfgpetclinic.services.map.VetMapService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.assertThat;

@Tag("controller")
class VetControllerTest {
    VetController controller;
    VetService service;
    SpecialtyService specialtyService;
    Vet vet1;
    Vet vet2;

    @BeforeEach
    void setUp() {
        specialtyService = new SpecialityMapService();
        service = new VetMapService(specialtyService);
        vet1 = new Vet(1L, "john", "Doe", null);
        vet2 = new Vet(2L, "mary", "public", null);
        service.save(vet1);
        service.save(vet2);
        controller = new VetController(service);

    }

    @Test
    void listVets() {

        Model model = new fauxSpring();

        String view = controller.listVets(model);

        assertThat(view).isEqualTo("vets/index");

        Set maps = (Set) ((fauxSpring) model).getMap().get("vets");

        assertThat(maps.size()).isEqualTo(2);
    }
}