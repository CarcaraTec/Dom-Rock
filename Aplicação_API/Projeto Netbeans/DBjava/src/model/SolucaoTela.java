/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author kiraisk
 */
public class SolucaoTela {
    private String nome_solucao;
    private String produto;
    private String core;

    public SolucaoTela(String nome_solucao, String produto, String core) {
        this.nome_solucao = nome_solucao;
        this.produto = produto;
        this.core = core;
    }

    public String getNome_solucao() {
        return nome_solucao;
    }

    public void setNome_solucao(String nome_solucao) {
        this.nome_solucao = nome_solucao;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCore() {
        return core;
    }

    public void setCore(String core) {
        this.core = core;
    }
    
    
    
}
