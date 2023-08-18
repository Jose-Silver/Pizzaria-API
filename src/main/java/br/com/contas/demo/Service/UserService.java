//package br.com.contas.demo.Service;
//
//import org.springframework.beans.BeanUtils;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepository repository;
//
//    public List<User> listall () {
//        return repository.findAll();
//    }
//    public ResponseEntity<User> Create (UserDTO userdto) {
//
//
//        try {
//            User new_user = new User();
//            BeanUtils.copyProperties(userdto, new_user);
//            repository.save(new_user);
//            return ResponseEntity.ok(new_user);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//
//        }
//
//    };
//
//    public List<Anotacao> get_all_anotations ( String name) {
//
//        User usuario = repository.findByNome(name);
//
//        if(usuario == null) {
//            throw  new NullPointerException("usuario nao existe");
//        } else {
//            return usuario.getAnotacaoList();
//        }
//
//    }
//
//}
