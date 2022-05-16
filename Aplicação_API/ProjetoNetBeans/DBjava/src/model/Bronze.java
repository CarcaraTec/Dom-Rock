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
    private String origem;
    private String formato;
    private String sistema;
    private String volume_json;
    private String freq_json;
    private String volume_csv;
    private String freq_csv;
    private String volume_planilhas;
    private String freq_planilhas;
    private String volume_tabelas;
    private String freq_tabelas;
    private String volume_pdf;
    private String freq_pdf;
    private String volume_audio;
    private String freq_audio;
    private String volume_texto;
    private String freq_texto;

    public Bronze(String origem, String formato, String sistema, String volume_json, String freq_json, String volume_csv, String freq_csv, String volume_planilhas, String freq_planilhas, String volume_tabelas, String freq_tabelas, String volume_pdf, String freq_pdf, String volume_audio, String freq_audio, String volume_texto, String freq_texto) {
        this.origem = origem;
        this.formato = formato;
        this.sistema = sistema;
        this.volume_json = volume_json;
        this.freq_json = freq_json;
        this.volume_csv = volume_csv;
        this.freq_csv = freq_csv;
        this.volume_planilhas = volume_planilhas;
        this.freq_planilhas = freq_planilhas;
        this.volume_tabelas = volume_tabelas;
        this.freq_tabelas = freq_tabelas;
        this.volume_pdf = volume_pdf;
        this.freq_pdf = freq_pdf;
        this.volume_audio = volume_audio;
        this.freq_audio = freq_audio;
        this.volume_texto = volume_texto;
        this.freq_texto = freq_texto;
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

    public String getVolume_json() {
        return volume_json;
    }

    public void setVolume_json(String volume_json) {
        this.volume_json = volume_json;
    }

    public String getFreq_json() {
        return freq_json;
    }

    public void setFreq_json(String freq_json) {
        this.freq_json = freq_json;
    }

    public String getVolume_csv() {
        return volume_csv;
    }

    public void setVolume_csv(String volume_csv) {
        this.volume_csv = volume_csv;
    }

    public String getFreq_csv() {
        return freq_csv;
    }

    public void setFreq_csv(String freq_csv) {
        this.freq_csv = freq_csv;
    }

    public String getVolume_planilhas() {
        return volume_planilhas;
    }

    public void setVolume_planilhas(String volume_planilhas) {
        this.volume_planilhas = volume_planilhas;
    }

    public String getFreq_planilhas() {
        return freq_planilhas;
    }

    public void setFreq_planilhas(String freq_planilhas) {
        this.freq_planilhas = freq_planilhas;
    }

    public String getVolume_tabelas() {
        return volume_tabelas;
    }

    public void setVolume_tabelas(String volume_tabelas) {
        this.volume_tabelas = volume_tabelas;
    }

    public String getFreq_tabelas() {
        return freq_tabelas;
    }

    public void setFreq_tabelas(String freq_tabelas) {
        this.freq_tabelas = freq_tabelas;
    }

    public String getVolume_pdf() {
        return volume_pdf;
    }

    public void setVolume_pdf(String volume_pdf) {
        this.volume_pdf = volume_pdf;
    }

    public String getFreq_pdf() {
        return freq_pdf;
    }

    public void setFreq_pdf(String freq_pdf) {
        this.freq_pdf = freq_pdf;
    }

    public String getVolume_audio() {
        return volume_audio;
    }

    public void setVolume_audio(String volume_audio) {
        this.volume_audio = volume_audio;
    }

    public String getFreq_audio() {
        return freq_audio;
    }

    public void setFreq_audio(String freq_audio) {
        this.freq_audio = freq_audio;
    }

    public String getVolume_texto() {
        return volume_texto;
    }

    public void setVolume_texto(String volume_texto) {
        this.volume_texto = volume_texto;
    }

    public String getFreq_texto() {
        return freq_texto;
    }

    public void setFreq_texto(String freq_texto) {
        this.freq_texto = freq_texto;
    }
    
    
}
