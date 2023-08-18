package br.com.contas.demo.Repository;

import br.com.contas.demo.Entity.Client;
import br.com.contas.demo.Entity.Delivery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {


}
