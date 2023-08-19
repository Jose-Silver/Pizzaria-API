package br.com.contas.demo.Repository;

import br.com.contas.demo.Entity.Delivery;
import br.com.contas.demo.Entity.MetodoEntrega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DeliveryRepository extends JpaRepository<Delivery, Long> {
List<Delivery> findByMetodoEntrega (MetodoEntrega metodoEntrega);

}
