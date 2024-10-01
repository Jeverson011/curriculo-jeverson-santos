package com.curriculo.curriculo_jeverson_santos.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.curriculo.curriculo_jeverson_santos.model.CurriculoModel;
import com.curriculo.curriculo_jeverson_santos.model.CursoComplementarModel;
import com.curriculo.curriculo_jeverson_santos.model.EnderecoModel;
import com.curriculo.curriculo_jeverson_santos.model.ExperienciaProfissionalModel;
import com.curriculo.curriculo_jeverson_santos.model.FormacaoModel;

@Controller
@RequestMapping("/curriculo")
public class CurriculoController {
    @GetMapping("/")
    public ModelAndView visualizarCurriculo() {
        CurriculoModel curriculo = new CurriculoModel();

        curriculo.setNome("Jeverson Santos");
        curriculo.setTelefone("11979903060");
        curriculo.setEmail("jeverson.jsantos@gmail.com");
        curriculo.setLinkedin("https://br.Linkedin.com/in/jeveson-santos");

        EnderecoModel endereco = new EnderecoModel();
        endereco.setRua("Rua da Fraternidade");
        endereco.setBairro("Grajau");
        endereco.setCidade("Sao Paulo");
        endereco.setCep("04847-200");

        curriculo.setEndereco(endereco);

        FormacaoModel formacao1 = new FormacaoModel();
        formacao1.setInstituicao("SENAC");
        formacao1.setCurso("Analise e desenvolvimento de Sistemas");
        formacao1.setAno("2023 - Atual");
        formacao1.setDuracao("30 meses (2 anos e 6 meses)");

        FormacaoModel formacao2 = new FormacaoModel();
        formacao2.setInstituicao("Uninove");
        formacao2.setCurso("Administração de Recursos Humanos");
        formacao2.setAno("2010 - 2012");
        formacao2.setDuracao("24 meses (2 anos)");

        List<FormacaoModel> listaFormacao = new ArrayList<>();
        listaFormacao.add(formacao1);
        listaFormacao.add(formacao2);

        curriculo.setListaFormacao(listaFormacao);

        CursoComplementarModel curso1 = new CursoComplementarModel();
        curso1.setInstituicao("Udemy");
        curso1.setCurso("Testes Automatizados");
        curso1.setAno("Cursando");
        curso1.setDuracao("40 horas");

        List<CursoComplementarModel> listaCursoComplementares = new ArrayList<>();
        listaCursoComplementares.add(curso1);

        curriculo.setListaCursoComplementares(listaCursoComplementares);

        ExperienciaProfissionalModel experiencia1 = new ExperienciaProfissionalModel();
        experiencia1.setEmpresa("Cashin");
        experiencia1.setCargo("Analista de Qualidade");
        experiencia1.setAno("Atual");
        experiencia1.setDescricaoDoCargo("Testes e afins");

        ExperienciaProfissionalModel experiencia2 = new ExperienciaProfissionalModel();
        experiencia2.setEmpresa("LTJ Sistemas");
        experiencia2.setCargo("Analista de Qualidade Jr");
        experiencia2.setAno("2022 a 2023");
        experiencia2.setDescricaoDoCargo("Testes e afins");

        List<ExperienciaProfissionalModel> listaExperienciaProfissional = new ArrayList<>();
        listaExperienciaProfissional.add(experiencia1);
        listaExperienciaProfissional.add(experiencia2);

        curriculo.setListaExperienciaProfissional(listaExperienciaProfissional);

        ModelAndView mv = new ModelAndView("curriculo-jeverson");
        mv.addObject("curriculo", curriculo);

        return mv;
    }
}