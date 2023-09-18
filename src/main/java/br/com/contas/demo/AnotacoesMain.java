package br.com.contas.demo;

import br.com.contas.demo.DTO.ClientDTO;
import br.com.contas.demo.Entity.Client;
import br.com.contas.demo.Service.ClientService;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SpringBootApplication
public class AnotacoesMain {

	public static void main(String[] args) {
		SpringApplication.run(AnotacoesMain.class, args);
	}







}
