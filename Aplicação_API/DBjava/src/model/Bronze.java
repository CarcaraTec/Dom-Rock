/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Igor
 */
public class Bronze {
    private static String origem;
    private static String formato;
    private static String sistema;
    private static String volume;
    private static String frequencia;
    private static String cnpj;
    
    public Bronze(String origem, String formato, String sistema, String volume, String frequencia, String cnpj) {
        this.origem = origem;
        this.formato = formato;
        this.sistema = sistema;
        this.volume = volume;
        this.frequencia = frequencia;
        this.cnpj = cnpj;
    }

    public Bronze() {
        
    }

    
    
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public String getSistema() {
        return sistema;
    }

    public void setSistema(String sistema) {
        this.sistema = sistema;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(String frequencia) {
        this.frequencia = frequencia;
    }
    
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    
}
