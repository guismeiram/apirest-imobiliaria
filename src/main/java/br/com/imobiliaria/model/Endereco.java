package br.com.imobiliaria.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@javax.persistence.Table(name="TB_ENDERECO")
public class Endereco implements Serializable{


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long idEnderco;

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
