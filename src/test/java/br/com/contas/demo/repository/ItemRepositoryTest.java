package br.com.contas.demo.repository;

import br.com.contas.demo.Entity.Delivery;
import br.com.contas.demo.Entity.Item;
import br.com.contas.demo.Entity.MetodoEntrega;
import br.com.contas.demo.Entity.Orders;
import br.com.contas.demo.Repository.DeliveryRepository;
import br.com.contas.demo.Repository.ItemRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

@DataJpaTest
public class ItemRepositoryTest {
    @Autowired
    public  ItemRepository underTest;


    @AfterEach
    void tearDown () {
        underTest.deleteAll();;
    }

    @Test
    public void findByCodigoTest () {
        //given
        String codigo = "coca";
        Float preco = 5F;
        Boolean pizza = false;

        Item item    = new Item(codigo, preco, pizza);

        underTest.save(item);

        //when
        Optional<Item> expected = underTest.findByCodigo("coca");

        //then
        Assertions.assertThat(expected).isNotEmpty();

    }

    @Test
    @Disabled
    public void NoFindByCodigoTest () {
        //given

        //when
        Optional<Item> expected = underTest.findByCodigo("coca");

        //then
        Assertions.assertThat(expected).isEmpty();

    }
}