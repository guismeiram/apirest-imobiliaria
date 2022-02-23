package br.com.imobiliaria.model;

import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(appliesTo = "TB_USUARIO")
public class Usuario implements Serializable {

    private Long id;
    @Id
    @Column(name = "idUsuario", nullable = false)
    public int idUsuario;
    @ManyToOne
    @JoinColumn(name = "telefone_id")
    public Telefone telefone;
    @Column(name = "rg", nullable = false)
    public String rg;
    @Column(name = "cpf", nullable = false)
    public String cpf;
    @Column(name = "nome", nullable = false)
    public String nome;
    @Column(name = "sobrenome", nullable = false)
    public String sobrenome;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Telefone getTelefone() {
        return telefone;
    }
}
