package br.com.contas.demo.Repository;

import br.com.contas.demo.Entity.Adress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdressRepository extends JpaRepository< Adress, Long> {


}
