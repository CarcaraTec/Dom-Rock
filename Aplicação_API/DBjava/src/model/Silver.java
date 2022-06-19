package model;

public class Silver {
    private static String nomeSilver;
    private static String status;
    private static String problema;
    private static String cnpjSilver;

    
        Object[] novoProduto = new Object[]{
            nomeSilver,
            status,
            problema,
        };

    
    
    public Object[] getNovoProduto() {
        return novoProduto;
    }    
    
    public String getNomeSilver() {
        return nomeSilver;
    }

    public void setNomeSilver(String nomeSilver) {
        this.nomeSilver = nomeSilver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }
    public String getCnpjSilver() {
        return cnpjSilver;
    }

    public void setCnpjSilver(String cnpjSilver) {
        this.cnpjSilver = cnpjSilver;
    }
    public void insert(Silver usuarioluiz) {

    } 

    public void setCnpj(String string) {
        
    }
}
    
