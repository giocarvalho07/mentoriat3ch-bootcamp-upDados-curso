package com.cursodados.controller;

import com.cursodados.domain.CursoDados;
import com.cursodados.service.CursoDadosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CursoDadosController {

    @Autowired
    CursoDadosService cursoDadosService;

    @GetMapping("/mT3ch-curso-dados")
    public String index() {
        return "index";
    }

    @PostMapping("/mT3ch-curso-dados")
    public String cadastrarCurso(CursoDados cursoDados) {
        cursoDadosService.criarLead(cursoDados);
        return "pages/cursoDados";
    }


    @GetMapping("/mT3ch-receber-curso-dados")
    public ModelAndView receberCurso() {
        ModelAndView model = new ModelAndView("pages/cursoDados");
        Iterable<CursoDados> cursoDados = cursoDadosService.exibirPageCurso();
        model.addObject("cursoDados", cursoDados);
        return model;
    }

}
