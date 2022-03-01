package br.com.imobiliaria.model;

import br.com.imobiliaria.enums.StatusImovel;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.time.LocalDate;


// link do swagger:http://localhost:8080/documentation.html
@Schema(name = "Imovel", description = "Example imovel schema")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.persistence.Table(name="TB_IMOVEL")
public class Imovel  implements Serializable {

    private static final long serialVersionUID = 1L;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tb_imovel")
    private long idImovel;

    @NotNull
    private int codigo;

    @Column(name = "tempo_de_uso_imovel")
    private String tempo_de_uso_imovel;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusImovel StatusImovel = br.com.imobiliaria.enums.StatusImovel.Alugado;

    @Column(name = "data_alocacao")
    private LocalDate dataDeAlocacao;

    @Column(name = "numero")
    private String numero;

    @Column(name = "rua")
    private String rua;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "pais")
    private String pais;

    @Column(name = "nimovel")
    private String nImovel;

    @Column(name = "cep")
    private String cep;








}
