package com.app_rh.controllers;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.app_rh.models.Candidato;
import com.app_rh.models.Vaga;

public interface CandidatoRepository extends CrudRepository<Candidato, String>{
	Iterable<Candidato> findByVaga(Vaga vaga);
	Candidato findById(long id);
	Candidato findByRg(String rg);
	List<Candidato> findByNomeCandidato(String nomeCandidato);
}
