package br.com.imobiliaria.model;

import br.com.imobiliaria.enums.StatusImovel;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
@javax.persistence.Table(name="TB_IMOVEL")
public class Imovel  implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tb_imovel")
    private long idImovel;



    @Column(name = "tempo_de_uso_imovel")
    private String tempo_de_uso_imovel;



    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private StatusImovel StatusImovel = br.com.imobiliaria.enums.StatusImovel.Alugado;


    @JsonFormat(pattern = "hh:mm:ss a")
    private LocalDate dataDeAlocacao;


    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Endereco> endereco = new ArrayList<>();



}
