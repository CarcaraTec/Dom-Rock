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
public class Gold {
    private static String tipoSilver;
    private static String nomeGold;
    private static String cnpj;

    public Gold(String tipoSilver, String nomeGold, String cnpj) {
        this.tipoSilver = tipoSilver;
        this.nomeGold = nomeGold;
        this.cnpj = cnpj;
    }

    public Gold() {
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
    public void insert(Silver usuarioigor) {

    } 

    public String getNomeSilver() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
