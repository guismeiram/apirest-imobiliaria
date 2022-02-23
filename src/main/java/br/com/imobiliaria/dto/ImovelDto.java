package br.com.imobiliaria.dto;

import javax.persistence.Column;

public class ImovelDto {
    private long id;

    public int tempo_de_uso_imovel;
    public Enum Status;

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


}
