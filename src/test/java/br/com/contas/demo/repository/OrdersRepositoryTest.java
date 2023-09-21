package br.com.contas.demo.repository;

import br.com.contas.demo.Entity.*;
import br.com.contas.demo.Repository.ClientRepository;
import br.com.contas.demo.Repository.ItemRepository;
import br.com.contas.demo.Repository.OrdersRepository;
import br.com.contas.demo.Service.ClientService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.w3c.dom.stylesheets.LinkStyle;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@DataJpaTest
public class OrdersRepositoryTest {

    @Autowired
    public OrdersRepository  underTest;

    @Autowired
    public ClientRepository clientRepository;
    @Autowired
    public ItemRepository itemRepository;

    @AfterEach
    void tearDown () {
        underTest.deleteAll();;
        clientRepository.deleteAll();
    }
    @Test
    public  void findByStatus () {
        //given
        String codigo = "coca";
        Float preco = 5F;
        Boolean pizza = false;
        Item item    = new Item(codigo, preco, pizza);
       itemRepository.save(item);
        List<Item> items = new ArrayList<>();
        items.add(item);
        Client client = new Client("Jose", "459911224630" , "010.254.719-03");
        clientRepository.save(client);
        Orders order = new Orders( 1L, LocalDateTime.now(),
                Payment.CARTAO, Status.PAGO,
                "coquinha gelada", client, items);
        underTest.save(order);
        //when
        List<Orders> expected = underTest.findByStatus(Status.PAGO);
        //then
        Assertions.assertThat(expected).isNotEmpty();
    }


    @Test
    public void findByDay () {
        //given
        String codigo = "coca";
        Float preco = 5F;
        Boolean pizza = false;
        Item item    = new Item(codigo, preco, pizza);
        itemRepository.save(item);
        List<Item> items = new ArrayList<>();
        items.add(item);
        Client client = new Client("Jose", "459911224630" , "010.254.719-03");
        clientRepository.save(client);
        Orders order = new Orders( 1L, LocalDateTime.now(),
                Payment.CARTAO, Status.PAGO,
                "coquinha gelada", client, items);
        underTest.save(order);
        //when
        List<Orders> expected = underTest.findByDay(order.getDay());
        //then
        Assertions.assertThat(expected).isNotEmpty();


    }



}