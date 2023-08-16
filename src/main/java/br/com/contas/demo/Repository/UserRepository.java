package br.com.contas.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, Long> {
    public User findByNome ( String nome);
}
