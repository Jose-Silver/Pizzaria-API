package br.com.contas.demo.repository;

import br.com.contas.demo.Entity.Client;
import br.com.contas.demo.Entity.Delivery;
import br.com.contas.demo.Entity.MetodoEntrega;
import br.com.contas.demo.Entity.Orders;
import br.com.contas.demo.Repository.ClientRepository;
import br.com.contas.demo.Repository.DeliveryRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;
import java.util.Optional;

@DataJpaTest
public class DeliveryRepositoryTest {

    @InjectMocks
    private DeliveryRepository underTest;

    @Mock
    private Delivery delivery;

    @Mock
    private Orders orders;


    @AfterEach
    void tearDown () {
        underTest.deleteAll();;
    }

    @Test
    public void findByMetodoEntregaTest () {
        //given
        Delivery delivery = new Delivery(1L, MetodoEntrega.DELIVERY, "joaquim", 15.8F );
        underTest.save(delivery);

        //when
        List<Delivery> expected = underTest.findByMetodoEntrega(MetodoEntrega.DELIVERY);

        //then
        Assertions.assertThat(expected).isNotEmpty();

    }

    @Test
    public void notFindByMetodoEntregaTest () {

        //when
        List<Delivery> expected = underTest.findByMetodoEntrega(MetodoEntrega.DELIVERY);

        //then
        Assertions.assertThat(expected).isEmpty();


    }


}