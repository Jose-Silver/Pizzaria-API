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
//public class AnotacoesService {
//
//    @Autowired
//    private AnotacaoRepository repository;
//    @Autowired
//    private UserRepository userRepository;
//
//    public ResponseEntity<Anotacao> Create (AnotacaoDTO anotacaoDTO, String user_name) {
//
//
//        try {
//            User user = userRepository.findByNome(user_name);
//            Anotacao new_anotacao = new Anotacao();
//            BeanUtils.copyProperties(anotacaoDTO, new_anotacao);
//            List<Anotacao> User_anotacoes = user.getAnotacaoList();
//            User_anotacoes.add(new_anotacao);
//            user.setAnotacaoList(User_anotacoes);
//            userRepository.save(user);
//            repository.save(new_anotacao);
//            return ResponseEntity.ok(new_anotacao);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//
//        }
//
//    };
//
//
//}
