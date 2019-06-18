package br.ufrn.imd.spring101;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import br.ufrn.imd.spring101.model.Ocorrencia;
import br.ufrn.imd.spring101.service.CustomerService;
import br.ufrn.imd.spring101.service.ServicoOcorrencia;

@SpringBootApplication
public class Spring101Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =  SpringApplication.run(Spring101Application.class, args);
		//ServicoOcorrencia servicoOcorrencia = new ServicoOcorrencia();
//		ServicoOcorrencia servicoOcorrencia = context.getBean(ServicoOcorrencia.class);
//		List<Ocorrencia> ocorrencias = servicoOcorrencia.getOcorrencias();
//		for (Ocorrencia ocorrencia : ocorrencias) {
//			System.out.println(ocorrencia.getDescricao());
//		}
//		
//		CustomerService customerService = context.getBean(CustomerService.class);
//		//List<Customer> customers = 
	}
}
