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
    private String produto;
    private String solucao;
    private String funcionalidade;
    private String core;
    
    private String estrutura_min_vox;
    private String volume_vox;
    private String estrutura_min_mktEplan;
    private String volume_mktEplan;
    private String estrutura_min_sales;
    private String volume_sales;
    private String estrutura_min_pricing;
    private String volume_pricing;
    private String estrutura_min_optimization;
    private String volume_optimization;
    private String estrutura_min_matching;
    private String volume_matching;

    public Escopo(String cnpj, String nome_empresa, String objetivo_neg, String entregavel_min, String entregaveis_possi, String produto, String solucao, String funcionalidade, String core, String estrutura_min_vox, String volume_vox, String estrutura_min_mktEplan, String volume_mktEplan, String estrutura_min_sales, String volume_sales, String estrutura_min_pricing, String volume_pricing, String estrutura_min_optimization, String volume_optimization, String estrutura_min_matching, String volume_matching) {
        this.cnpj = cnpj;
        this.nome_empresa = nome_empresa;
        this.objetivo_neg = objetivo_neg;
        this.entregavel_min = entregavel_min;
        this.entregaveis_possi = entregaveis_possi;
        this.produto = produto;
        this.solucao = solucao;
        this.funcionalidade = funcionalidade;
        this.core = core;
        this.estrutura_min_vox = estrutura_min_vox;
        this.volume_vox = volume_vox;
        this.estrutura_min_mktEplan = estrutura_min_mktEplan;
        this.volume_mktEplan = volume_mktEplan;
        this.estrutura_min_sales = estrutura_min_sales;
        this.volume_sales = volume_sales;
        this.estrutura_min_pricing = estrutura_min_pricing;
        this.volume_pricing = volume_pricing;
        this.estrutura_min_optimization = estrutura_min_optimization;
        this.volume_optimization = volume_optimization;
        this.estrutura_min_matching = estrutura_min_matching;
        this.volume_matching = volume_matching;
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

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getSolucao() {
        return solucao;
    }

    public void setSolucao(String solucao) {
        this.solucao = solucao;
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

    public String getEstrutura_min_vox() {
        return estrutura_min_vox;
    }

    public void setEstrutura_min_vox(String estrutura_min_vox) {
        this.estrutura_min_vox = estrutura_min_vox;
    }

    public String getVolume_vox() {
        return volume_vox;
    }

    public void setVolume_vox(String volume_vox) {
        this.volume_vox = volume_vox;
    }

    public String getEstrutura_min_mktEplan() {
        return estrutura_min_mktEplan;
    }

    public void setEstrutura_min_mktEplan(String estrutura_min_mktEplan) {
        this.estrutura_min_mktEplan = estrutura_min_mktEplan;
    }

    public String getVolume_mktEplan() {
        return volume_mktEplan;
    }

    public void setVolume_mktEplan(String volume_mktEplan) {
        this.volume_mktEplan = volume_mktEplan;
    }

    public String getEstrutura_min_sales() {
        return estrutura_min_sales;
    }

    public void setEstrutura_min_sales(String estrutura_min_sales) {
        this.estrutura_min_sales = estrutura_min_sales;
    }

    public String getVolume_sales() {
        return volume_sales;
    }

    public void setVolume_sales(String volume_sales) {
        this.volume_sales = volume_sales;
    }

    public String getEstrutura_min_pricing() {
        return estrutura_min_pricing;
    }

    public void setEstrutura_min_pricing(String estrutura_min_pricing) {
        this.estrutura_min_pricing = estrutura_min_pricing;
    }

    public String getVolume_pricing() {
        return volume_pricing;
    }

    public void setVolume_pricing(String volume_pricing) {
        this.volume_pricing = volume_pricing;
    }

    public String getEstrutura_min_optimization() {
        return estrutura_min_optimization;
    }

    public void setEstrutura_min_optimization(String estrutura_min_optimization) {
        this.estrutura_min_optimization = estrutura_min_optimization;
    }

    public String getVolume_optimization() {
        return volume_optimization;
    }

    public void setVolume_optimization(String volume_optimization) {
        this.volume_optimization = volume_optimization;
    }

    public String getEstrutura_min_matching() {
        return estrutura_min_matching;
    }

    public void setEstrutura_min_matching(String estrutura_min_matching) {
        this.estrutura_min_matching = estrutura_min_matching;
    }

    public String getVolume_matching() {
        return volume_matching;
    }

    public void setVolume_matching(String volume_matching) {
        this.volume_matching = volume_matching;
    }
    
    

    

    public void insert(Escopo usuarioluiz) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
