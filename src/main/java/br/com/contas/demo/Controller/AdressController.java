package br.com.contas.demo.Controller;

import br.com.contas.demo.DTO.AdressDTO;
import br.com.contas.demo.Entity.Adress;
import br.com.contas.demo.Service.AdressService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RestController
@RequestMapping("/Adress")
public class AdressController {

    @Autowired
    private AdressService service;




    @PostMapping

    public ResponseEntity<Adress> create( @Valid @RequestBody
    AdressDTO adressDTO) {

        return service.create(adressDTO);
    };

@PutMapping("/update")
    private ResponseEntity<Object> update(@RequestBody AdressDTO adressDTO, @RequestParam Long id){
    return service.update(id, adressDTO);
}

@DeleteMapping
    private ResponseEntity<Object> Delete(@RequestParam Long id){

    return service.delete(id);
}



}
