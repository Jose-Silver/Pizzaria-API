package br.com.contas.demo.Repository;

import br.com.contas.demo.Entity.Item;
import br.com.contas.demo.Entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {


}
