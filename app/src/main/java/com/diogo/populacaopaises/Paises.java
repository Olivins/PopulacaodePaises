package com.diogo.populacaopaises;

public class Paises {

    public Integer ranking;
    public String nome;
    public Integer populacao;
    public Integer ano;
    public Integer imagem;

    public Paises(Integer ranking, String nome, Integer populacao, Integer ano, Integer imagem) {
        this.ranking = ranking;
        this.nome = nome;
        this.populacao = populacao;
        this.ano = ano;
        this.imagem = imagem;
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPopulacao() {
        return populacao;
    }

    public void setPopulacao(Integer populacao) {
        this.populacao = populacao;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getImagem() {
        return imagem;
    }

    public void setImagem(Integer imagem) {
        this.imagem = imagem;
    }
}
