package br.com.contas.demo.Repository;

import br.com.contas.demo.Entity.Client;
import br.com.contas.demo.Entity.Report;
import br.com.contas.demo.Entity.Sabor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaborRepository extends JpaRepository<Sabor, Long> {

    Sabor findByNome(String nome);

}
