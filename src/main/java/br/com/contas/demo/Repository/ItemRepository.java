package br.com.contas.demo.Repository;

import br.com.contas.demo.Entity.Delivery;
import br.com.contas.demo.Entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {


}
