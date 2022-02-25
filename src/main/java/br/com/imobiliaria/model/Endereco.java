package br.com.imobiliaria.model;

import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@javax.persistence.Table(name="TB_ENDERECO")
public class Endereco{

    private Long id;

    @Id
    public int idEnderco;
    @Column(name = "numero")
    public String numero;
    @Column(name = "rua")
    public String rua;
    @Column(name = "bairro")
    public String bairro;
    @Column(name = "cidade")
    public String cidade;
    @Column(name = "pais")
    public String pais;
    @Column(name = "nimovel")
    public String nImovel;
    @Column(name = "cep")
    public String cep;

    public int getIdEnderco() {
        return idEnderco;
    }

    public void setIdEnderco(int idEnderco) {
        this.idEnderco = idEnderco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

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
