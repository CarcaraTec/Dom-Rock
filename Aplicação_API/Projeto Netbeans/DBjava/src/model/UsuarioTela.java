/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Administrador
 */
public class UsuarioTela {
    
    private String nome_da_empresa;
    private String cnpj;
    private String responsavel;
    private String telefone;
    private String email;

    public UsuarioTela(String nome_da_empresa, String cnpj, String responsavel, String telefone, String email) {
        this.nome_da_empresa = nome_da_empresa;
        this.cnpj = cnpj;
        this.responsavel = responsavel;
        this.telefone = telefone;
        this.email = email;
    }

    public UsuarioTela(String nome_empresa, String responsavel, String telefone, String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    public String getNome_da_empresa() {
        return nome_da_empresa;
    }

    public void setNome_da_empresa(String nome_da_empresa) {
        this.nome_da_empresa = nome_da_empresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
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

    
    
}
