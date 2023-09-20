package br.com.contas.demo.Controller;

import br.com.contas.demo.DTO.ItemDTO;
import br.com.contas.demo.Entity.Item;
import br.com.contas.demo.Service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RestController
@RequestMapping("/Item")
public class ItemController {

    @Autowired
    private ItemService service;

@GetMapping("/findall")

public List<Item> Findall() {
    return service.Findall();
}

@GetMapping("/codigo")
private Optional<Item> FindByCOdigo (@RequestParam String codigo) {
    return service.FindByCodigo(codigo);
}

    @PostMapping

    public ResponseEntity<Item> create (@RequestBody
    ItemDTO itemDTO) {

        return service.create(itemDTO);
    };

@PutMapping("/update")
    private ResponseEntity<Object> update(@RequestBody ItemDTO itemDTO, @RequestParam Long id){
    return service.update(id, itemDTO);
}

@DeleteMapping
    private ResponseEntity<Object> Delete(@RequestParam long id){

    return service.delete(id);
}



}
