package br.com.contas.demo.repository;

import br.com.contas.demo.Entity.*;
import br.com.contas.demo.Repository.OrdersRepository;
import br.com.contas.demo.Repository.SaborRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@DataJpaTest
public class SaborRepositoryTest {
    @Autowired
    public SaborRepository underTest;

    @BeforeEach
    public void Setup() {

    }

    @AfterEach
    void tearDown () {
        underTest.deleteAll();

    }

    @Test
    void findByNome () {
        Sabor sabor = new Sabor();
        sabor.setNome("picanha");
        sabor.setPreco_adicional(2F);

        underTest.save(sabor);

        Optional<Sabor> expected = Optional.ofNullable(underTest.findByNome("picanha"));

        Assertions.assertThat(expected).isNotEmpty();
        Assertions.assertThat(expected.get().equals(sabor));
    }

}