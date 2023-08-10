package br.com.contas.demo.Repository;

import br.com.contas.demo.Entity.Anotacao;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnotacaoRepository extends JpaRepository <Anotacao, Long> {
}
