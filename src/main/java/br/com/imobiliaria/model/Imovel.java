package br.com.imobiliaria.model;

import br.com.imobiliaria.enums.StatusImovel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@javax.persistence.Table(name="TB_IMOVEL")
public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_tb_imovel")
    public long idImovel;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Endereco> endereco;

    @Column(name = "tempo_de_uso_imovel")
    public String tempo_de_uso_imovel;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    public StatusImovel StatusImovel;

    @Column(name = "data_de_alocacao")
    private LocalDateTime dataDeAlocacao;

    @Column(name = "data_de_saida_imovel")
    private LocalDateTime dataDeSaidaImovel;











}
