package br.ufrn.imd.spring101.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import br.ufrn.imd.spring101.model.Ocorrencia;

@Repository
public interface OcorrenciaDAO extends JpaRepository<Ocorrencia, Integer> {

	
}
