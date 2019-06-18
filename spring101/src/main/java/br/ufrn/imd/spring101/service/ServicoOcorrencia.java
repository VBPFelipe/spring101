package br.ufrn.imd.spring101.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.ufrn.imd.spring101.model.Ocorrencia;
import br.ufrn.imd.spring101.repository.OcorrenciaDAO;

@Service
public class ServicoOcorrencia {


	@Autowired
	private OcorrenciaDAO ocorrenciaDAO;
	
	
	public List<Ocorrencia> getOcorrencias() {
		return ocorrenciaDAO.findAll();
	}
		
	
	public void populate(int n){
	
		for (int i = 1; i <= n; i++) {
			Ocorrencia ocorrencia = new Ocorrencia(i, "Ocorrencia " + Integer.toString(i), "Descricao " + Integer.toString(i));
			ocorrenciaDAO.save(ocorrencia);
			//listOcorrencia.add(ocorrencia);
		}
	}
}
