package br.com.contas.demo.service;

import br.com.contas.demo.DTO.ClientDTO;
import br.com.contas.demo.Entity.Client;
import br.com.contas.demo.Repository.AdressRepository;
import br.com.contas.demo.Repository.ClientRepository;
import br.com.contas.demo.Service.ClientService;
import org.hamcrest.Matcher;
import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.Matchers.notNullValue;
import static org.junit.jupiter.api.Assertions.assertThrows;

@ExtendWith(MockitoExtension.class)
public class ClientServiceTest {

    @InjectMocks
    ClientService service;

    @Mock
    private ClientRepository repository;
    @Mock
    private AdressRepository adressRepository;
    ClientDTO client;
    @BeforeEach
    private void Setup () {
        client = new ClientDTO("", "45999326309", "01025471903");

    }
    @Test
 private void teste1 () {
        final RuntimeException e = assertThrows(RuntimeException.class, () -> {
            service.create(client);
        });

    MatcherAssert.assertThat(e, notNullValue());

    }


}
