package br.com.imobiliaria.model;

import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Table(appliesTo = "TB_TELEFONE")
public class Telefone implements Serializable {

    private Long id;
    @Id
    @Column(name = "idTelefone", nullable = false)
    public int idTelefone;
    @Column(name = "telefonePessoal", nullable = false)
    public String telefonePessoal;
    @Column(name = "telefoneDaCasa", nullable = false)
    public String telefoneDaCasa;
    @Column(name = "telefoneDoTrabalho", nullable = false)
    public String telefoneDoTrabalho;

    public int getIdTelefone() {
        return idTelefone;
    }

    public void setIdTelefone(int idTelefone) {
        this.idTelefone = idTelefone;
    }

    public String getTelefonePessoal() {
        return telefonePessoal;
    }

    public void setTelefonePessoal(String telefonePessoal) {
        this.telefonePessoal = telefonePessoal;
    }

    public String getTelefoneDaCasa() {
        return telefoneDaCasa;
    }

    public void setTelefoneDaCasa(String telefoneDaCasa) {
        this.telefoneDaCasa = telefoneDaCasa;
    }

    public String getTelefoneDoTrabalho() {
        return telefoneDoTrabalho;
    }

    public void setTelefoneDoTrabalho(String telefoneDoTrabalho) {
        this.telefoneDoTrabalho = telefoneDoTrabalho;
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
