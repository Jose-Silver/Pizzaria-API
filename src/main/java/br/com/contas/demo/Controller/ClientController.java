package br.com.contas.demo.Controller;

import br.com.contas.demo.DTO.ClientDTO;
import br.com.contas.demo.Entity.Client;
import br.com.contas.demo.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientRepository repository;


    @PostMapping

    public ResponseEntity<Client> create (@RequestBody
    ClientDTO clientDTO) {

        Client cliente = new Client();
        cliente.setNome(clientDTO.getNome());
        cliente.setCpf(clientDTO.getCpf());
        cliente.setPhone(clientDTO.getPhone());

         repository.save(cliente);

         return ResponseEntity.ok(cliente);
    };


}
