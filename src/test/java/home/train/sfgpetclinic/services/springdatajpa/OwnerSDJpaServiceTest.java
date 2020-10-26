package home.train.sfgpetclinic.services.springdatajpa;

import home.train.sfgpetclinic.model.Owner;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@Disabled(value = "Wait until Mocking")
class OwnerSDJpaServiceTest {

    OwnerSDJpaService sdJpaService;

    @BeforeEach
    void setUp() {
        sdJpaService=new OwnerSDJpaService(null,null,null);
    }

    @Disabled
    @Test
    void findByLastName() {
        Owner owner=sdJpaService.findByLastName("John");
    }

    @Test
    void findAllByLastNameLike() {
    }

    @Test
    void findAll() {
    }

    @Test
    void findById() {
    }

    @Test
    void save() {
    }

    @Test
    void delete() {
    }

    @Test
    void deleteById() {
    }
}