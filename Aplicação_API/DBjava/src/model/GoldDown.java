/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author walla
 */
public class GoldDown {
    private static String tipoSilver;
    private static String nomeGold;
    private static String cnpj;

    Object[] novoProduto = new Object[]{
            tipoSilver,
            nomeGold,
        };


    public Object[] getNovoProduto() {
        return novoProduto;
    }    

    public String getTipoSilver() {
        return tipoSilver;
    }

    public void setTipoSilver(String tipoSilver) {
        this.tipoSilver = tipoSilver;
    }

    public String getNomeGold() {
        return nomeGold;
    }

    public void setNomeGold(String nomeGold) {
        this.nomeGold = nomeGold;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    } 
    

