package br.com.imobiliaria.dto;

import javax.persistence.Column;

public class TelefoneDto {
    private long id;

    public String telefonePessoal;
    public String telefoneDaCasa;
    public String telefoneDoTrabalho;
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


}
