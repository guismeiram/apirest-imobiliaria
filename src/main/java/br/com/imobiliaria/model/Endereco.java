package br.com.imobiliaria.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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




}
