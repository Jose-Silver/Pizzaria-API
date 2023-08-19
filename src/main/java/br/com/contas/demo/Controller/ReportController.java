package br.com.contas.demo.Controller;

import br.com.contas.demo.DTO.SaborDTO;
import br.com.contas.demo.Entity.Report;
import br.com.contas.demo.Entity.Sabor;
import br.com.contas.demo.Service.ReportService;
import br.com.contas.demo.Service.SaborService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Controller
@RestController
@RequestMapping("/Report")
public class ReportController {

    @Autowired
    private ReportService service;

@GetMapping ( "/Period")

    private ResponseEntity<Report> periodReport ( @RequestParam String day1, String day2) {
    LocalDate start = LocalDate.parse(day1);
    LocalDate end = LocalDate.parse(day1);
    return service.GetReport(start,end);

}

    @GetMapping ( "/day")

    private ResponseEntity<Report> periodReport ( @RequestParam String day1) {
        LocalDate day = LocalDate.parse(day1);
        return service.GetReportDay(day);
    }
}
