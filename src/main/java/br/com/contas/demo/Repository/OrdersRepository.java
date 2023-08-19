package br.com.contas.demo.Repository;

import br.com.contas.demo.Entity.Item;
import br.com.contas.demo.Entity.Orders;
import br.com.contas.demo.Entity.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Statement;
import java.time.LocalDate;
import java.util.List;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
List<Orders> findByStatus (Status status);

List<Orders> findByDay (LocalDate day);

}
