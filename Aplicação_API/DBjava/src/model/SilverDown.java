
package model;


public class SilverDown {
    private String nomeSilver;
    private String status;
    private String problema;
    private String cnpjSilver;
    
    public SilverDown(String nomeSilver, String status, String problema, String cnpjSilver) {
        this.nomeSilver = nomeSilver;
        this.status = status;
        this.problema = problema;
        this.cnpjSilver = cnpjSilver;
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
}
