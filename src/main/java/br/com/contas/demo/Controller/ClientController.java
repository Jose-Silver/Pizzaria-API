package br.com.contas.demo.Controller;

import br.com.contas.demo.DTO.AdressDTO;
import br.com.contas.demo.DTO.ClientDTO;
import br.com.contas.demo.Entity.Client;
import br.com.contas.demo.Repository.ClientRepository;
import br.com.contas.demo.Service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService service;

@GetMapping("/findall")

public List<Client> Findall() {
    return service.Findall();
}

    @GetMapping("/name")

    public List<Client> findByName(@RequestParam String nome) {
        return service.FindByName(nome);
    }

    @PostMapping

    public ResponseEntity<Client> create (@RequestBody
    ClientDTO clientDTO) {

        return service.create(clientDTO);
    };

@PutMapping("/update")
    private ResponseEntity<Object> update(@RequestBody ClientDTO clientDTO, @RequestParam Long id){
    return service.update(id, clientDTO);
}

@DeleteMapping
    private ResponseEntity<Object> Delete(@RequestParam long id){

    return service.delete(id);
}

@PutMapping("/adress")

    public ResponseEntity<Object> addAdress (@RequestBody AdressDTO adressDTO, @RequestParam Long id){
    return service.AddAdress(id, adressDTO);
}

}
