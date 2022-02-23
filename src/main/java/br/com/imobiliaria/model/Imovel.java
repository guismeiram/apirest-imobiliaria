package br.com.imobiliaria.model;

import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;


@Entity
@Table(appliesTo = "TB_IMOVEL")
public class Imovel implements Serializable {

    private Long id;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_tb_imovel")
    public int idImovel;
    @SuppressWarnings("JpaAttributeTypeInspection")
    @OneToMany( cascade = {CascadeType.PERSIST})
    @JoinColumn(name="idEndereco",  nullable = false)
    private List<Endereco> endereco;

    @SuppressWarnings("JpaAttributeTypeInspection")
    @OneToMany(cascade = {CascadeType.PERSIST})
    @JoinColumn(name="idUsuario", nullable = false)
    private List<Usuario> nomeProprietario;

    @Column(name = "tempo_de_uso_imovel")
    public int tempo_de_uso_imovel;

    public int getIdImovel() {
        return idImovel;
    }

    public void setIdImovel(int idImovel) {
        this.idImovel = idImovel;
    }

    public List<Endereco> getEndereco() {
        return endereco;
    }

    public void setEndereco(List<Endereco> endereco) {
        this.endereco = endereco;
    }

    public List<Usuario> getNomeProprietario() {
        return nomeProprietario;
    }

    public void setNomeProprietario(List<Usuario> nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }

    public int getTempo_de_uso_imovel() {
        return tempo_de_uso_imovel;
    }

    public void setTempo_de_uso_imovel(int tempo_de_uso_imovel) {
        this.tempo_de_uso_imovel = tempo_de_uso_imovel;
    }

    public Enum getStatus() {
        return Status;
    }

    public void setStatus(Enum status) {
        Status = status;
    }

    @Column(name = "status")
    public Enum Status;

    public Imovel(List<Endereco> endereco, List<Usuario> nomeProprietario) {
        this.endereco = endereco;
        this.nomeProprietario = nomeProprietario;
    }

    public Imovel() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
