package com.cursodados.service;

import com.cursodados.domain.CursoDados;
import com.cursodados.repository.CursoDadosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CursoDadosService {

    @Autowired
    CursoDadosRepository cursoDadosRepository;

    public void criarLead(CursoDados cursoDados){
        cursoDadosRepository.save(cursoDados);
    }

    public Iterable<CursoDados> exibirPageCurso(){
        return cursoDadosRepository.findAll();
    }

}
