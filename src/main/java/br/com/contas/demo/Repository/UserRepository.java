package br.com.contas.demo.Repository;

import br.com.contas.demo.DTO.UserDTO;
import br.com.contas.demo.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
    public User findByNome ( String nome);
}
