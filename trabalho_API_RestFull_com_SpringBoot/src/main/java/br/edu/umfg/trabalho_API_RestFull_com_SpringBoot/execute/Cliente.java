package br.edu.umfg.trabalho_API_RestFull_com_SpringBoot.execute;

public class Cliente {
    private Integer clientId;
    private Integer documento;
    private String nome;
    private String sobreNome;

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId){
        this.clientId = clientId;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
}
