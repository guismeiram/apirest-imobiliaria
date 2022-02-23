package br.com.imobiliaria.model;

import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Table(appliesTo = "TB_ENDERECO")
public class Endereco implements Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
