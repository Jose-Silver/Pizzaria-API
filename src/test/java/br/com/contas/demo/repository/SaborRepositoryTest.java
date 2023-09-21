package br.com.contas.demo.repository;

import br.com.contas.demo.Entity.*;
import br.com.contas.demo.Repository.OrdersRepository;
import br.com.contas.demo.Repository.SaborRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@DataJpaTest
public class SaborRepositoryTest {
    @Autowired
    public SaborRepository underTest;

    @BeforeEach
    public void Setup() {
        String codigo = "coca";
        Float preco = 5F;
        Boolean pizza = false;
        Item item    = new Item(codigo, preco, pizza);
        List<Item> items = new ArrayList<>();
        items.add(item);

        Client client = new Client("Jose", "459911224630" , "010.254.719-03");

        Orders order = new Orders( 1L, LocalDateTime.now(),
                Payment.CARTAO, Status.PAGO,
                "coquinha gelada", client, items);
    }

    @AfterEach
    void tearDown () {
        underTest.deleteAll();

    }

}