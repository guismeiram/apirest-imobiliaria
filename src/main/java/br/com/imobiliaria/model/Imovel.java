package br.com.imobiliaria.model;

import br.com.imobiliaria.enums.Statusimovel;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@javax.persistence.Table(name="TB_IMOVEL")
public class Imovel {

    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_tb_imovel")
    public long idImovel;
    @SuppressWarnings("JpaAttributeTypeInspection")
    @OneToMany( cascade = {CascadeType.PERSIST})
    @JoinColumn(name="idEndereco",  nullable = false)
    private List<Endereco> endereco;
    @Column(name = "tempo_de_uso_imovel")
    public String tempo_de_uso_imovel;
    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    public Statusimovel StatusImovel;
    @Column(name = "data_de_alocacao")
    private LocalDateTime dataDeAlocacao;
    @Column(name = "data_de_saida_imovel")
    private LocalDateTime dataDeSaidaImovel;

    public Imovel() {


    }

    public Statusimovel getStatusImovel() {
        return StatusImovel;
    }


    public Imovel(String tempo_de_uso_imovel, LocalDateTime dataDeAlocacao, LocalDateTime dataDeSaidaImovel) {
        this.tempo_de_uso_imovel = tempo_de_uso_imovel;
        this.dataDeAlocacao = dataDeAlocacao;
        this.dataDeSaidaImovel = dataDeSaidaImovel;
    }

    public void setStatusImovel(Statusimovel statusImovel) {
        StatusImovel = statusImovel;
    }



    public long getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(long idImovel) {
        this.idImovel = idImovel;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    public String getTempo_de_uso_imovel() {
        return tempo_de_uso_imovel;
    }

    public void setTempo_de_uso_imovel(String tempo_de_uso_imovel) {
        this.tempo_de_uso_imovel = tempo_de_uso_imovel;
    }



    public LocalDateTime getDataDeAlocacao() {
        return dataDeAlocacao;
    }

    public void setDataDeAlocacao(LocalDateTime dataDeAlocacao) {
        this.dataDeAlocacao = dataDeAlocacao;
    }

    public LocalDateTime getDataDeSaidaImovel() {
        return dataDeSaidaImovel;
    }

    public void setDataDeSaidaImovel(LocalDateTime dataDeSaidaImovel) {
        this.dataDeSaidaImovel = dataDeSaidaImovel;
    }







}
