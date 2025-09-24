package Ac14;

public class CarteiraTrabalho {
    private String numero;
    private String dataEmissao;
    private String orgaoEmissor;

    public CarteiraTrabalho(String numero, String dataEmissao, String orgaoEmissor) {
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.orgaoEmissor = orgaoEmissor;
    }

    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }
    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }
    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }
}
