package br.com.contas.demo.Controller;

import br.com.contas.demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    private ResponseEntity<List<User>> findall ( ) {
        return ResponseEntity.ok(service.listall());
    }

    @PostMapping
    private ResponseEntity<User> create_user (@RequestBody UserDTO userDTO) {
        return service.Create(userDTO);
    };

    @GetMapping ( "/anotations")
    private ResponseEntity<List<Anotacao>> Find_all_anotations (@PathVariable String nome) {
        return ResponseEntity.ok(service.get_all_anotations(nome));
    }
}
