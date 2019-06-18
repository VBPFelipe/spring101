package br.ufrn.imd.spring101.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.ufrn.imd.spring101.model.Ocorrencia;
import br.ufrn.imd.spring101.service.ServicoOcorrencia;

@Controller
public class OcorrenciaController {

	@Autowired
	private ServicoOcorrencia servicoOcorrencia;
	
	//@RequestMapping(value="/ocorrencias", method=RequestMethod.GET)
	@GetMapping("/ocorrencias")
	public String listOcorrencia(Model model) {
		model.addAttribute("textoModel", "Model do Spring");
		model.addAttribute("ocorrencias",servicoOcorrencia.getOcorrencias());
		return "listOcorrencia";
	}
	
	//@RequestMapping(value="/ocorrencias", method=RequestMethod.POST)
	@PostMapping("/ocorrencia")
	public String postOcorrencia(Ocorrencia ocorrencia) {
		return "listOcorrencia";
	}
	
	@GetMapping("/populate")
	public String populate() {
		servicoOcorrencia.populate(7);
		return "sucesso";
	}
}

