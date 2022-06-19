/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;

/**
 *
 * @author Igor
 */
public class Escopo {
    private String cnpj;
    private String nome_empresa;
    private String objetivo_neg;
    private String entregavel_min;
    private String entregaveis_possi;
    private String solucao;
    private String produto;
    private String funcionalidade;
    private String core;
    
    private String estrutura;
    private String volume;

    public Escopo(String cnpj, String nome_empresa, String objetivo_neg, String entregavel_min, String entregaveis_possi, String solucao, String produto, String funcionalidade, String core, String estrutura, String volume) {
        this.cnpj = cnpj;
        this.nome_empresa = nome_empresa;
        this.objetivo_neg = objetivo_neg;
        this.entregavel_min = entregavel_min;
        this.entregaveis_possi = entregaveis_possi;
        this.solucao = solucao;
        this.produto = produto;
        this.funcionalidade = funcionalidade;
        this.core = core;
        this.estrutura = estrutura;
        this.volume = volume;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome_empresa() {
        return nome_empresa;
    }

    public void setNome_empresa(String nome_empresa) {
        this.nome_empresa = nome_empresa;
    }

    public String getObjetivo_neg() {
        return objetivo_neg;
    }

    public void setObjetivo_neg(String objetivo_neg) {
        this.objetivo_neg = objetivo_neg;
    }

    public String getEntregavel_min() {
        return entregavel_min;
    }

    public void setEntregavel_min(String entregavel_min) {
        this.entregavel_min = entregavel_min;
    }

    public String getEntregaveis_possi() {
        return entregaveis_possi;
    }

    public void setEntregaveis_possi(String entregaveis_possi) {
        this.entregaveis_possi = entregaveis_possi;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getFuncionalidade() {
        return funcionalidade;
    }

    public void setFuncionalidade(String funcionalidade) {
        this.funcionalidade = funcionalidade;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }

    public String getEstrutura() {
        return estrutura;
    }

    public void setEstrutura(String estrutura) {
        this.estrutura = estrutura;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

   
    
    

    

    public void insert(Escopo usuarioluiz) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
