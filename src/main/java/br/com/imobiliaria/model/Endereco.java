package br.com.imobiliaria.model;

import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Table(appliesTo = "TB_ENDERECO")
public class Endereco implements Serializable {

    private Long id;

    @Id
    @Column(name = "id", nullable = false)
    public int idEnderco;
    @Column(name = "numero", nullable = false)
    public int numero;
    @Column(name = "rua", nullable = false)
    public String rua;
    @Column(name = "bairro", nullable = false)
    public String bairro;
    @Column(name = "cidade", nullable = false)
    public String cidade;
    @Column(name = "pais", nullable = false)
    public String pais;
    @Column(name = "nimovel", nullable = false)
    public String nImovel;
    @Column(name = "cep", nullable = false)
    public String cep;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
