package br.com.imobiliaria.dto;

import javax.persistence.Column;

public class EnderecoDto {
    private long id;
    public String rua;
    public String bairro;
    public String cidade;
    public String pais;
    public String nImovel;
    public String cep;
    
    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getnImovel() {
        return nImovel;
    }

    public void setnImovel(String nImovel) {
        this.nImovel = nImovel;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }


}
