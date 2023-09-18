package br.com.contas.demo.Repository;

import br.com.contas.demo.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    Client findByNome(String name);
    Optional<Client> findById(Long id);

    boolean selectExistisCpf(String cpf);


}
