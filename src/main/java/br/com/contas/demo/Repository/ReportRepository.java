package br.com.contas.demo.Repository;

import br.com.contas.demo.Entity.Orders;
import br.com.contas.demo.Entity.Report;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRepository extends JpaRepository<Report, Long> {


}
