package br.com.contas.demo.Controller;

import br.com.contas.demo.DTO.AdressDTO;
import br.com.contas.demo.Entity.Adress;
import br.com.contas.demo.Entity.Client;
import br.com.contas.demo.Repository.AdressRepository;
import br.com.contas.demo.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/adress")
public class AdressController {

    @Autowired
    private AdressRepository repository;


    @PostMapping

    public ResponseEntity<Adress> create (@RequestBody
    AdressDTO adressTO) {


    };


}
