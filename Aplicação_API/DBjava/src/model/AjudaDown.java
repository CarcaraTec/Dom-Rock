package model;

public class AjudaDown {
    private static String nome;
    private static String telefone;
    private static String email;
    private static String mensagem;

    
        Object[] novoProduto = new Object[]{
            nome,
            telefone,
            email,
            mensagem,
        };

    
    
    public Object[] getNovoProduto() {
        return novoProduto;
    }    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }
    public void insert(Silver usuarioluiz) {

    } 

    public void setCnpj(String string) {
        
    }
}