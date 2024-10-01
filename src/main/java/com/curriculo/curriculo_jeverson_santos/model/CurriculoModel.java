package com.curriculo.curriculo_jeverson_santos.model;

import java.util.List;


public class CurriculoModel {
    private String nome;
    private String nacionalidade;
    private String telefone;
    private String email;
    private String linkedin;

    private EnderecoModel endereco;

    private List<FormacaoModel> listaFormacao;

    private List<CursoComplementarModel> listaCursoComplementares;

    private List<ExperienciaProfissionalModel> listaExperienciaProfissional;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }

    public List<FormacaoModel> getListaFormacao() {
        return listaFormacao;
    }

    public void setListaFormacao(List<FormacaoModel> listaFormacao) {
        this.listaFormacao = listaFormacao;
    }

    public List<CursoComplementarModel> getListaCursoComplementares() {
        return listaCursoComplementares;
    }

    public void setListaCursoComplementares(List<CursoComplementarModel> listaCursoComplementares) {
        this.listaCursoComplementares = listaCursoComplementares;

    }

    public List<ExperienciaProfissionalModel> getListaExperienciaProfissional() {
        return listaExperienciaProfissional;
    }

    public void setListaExperienciaProfissional(List<ExperienciaProfissionalModel> listaExperienciaProfissional) {
        this.listaExperienciaProfissional = listaExperienciaProfissional;
    }


    



    


}

