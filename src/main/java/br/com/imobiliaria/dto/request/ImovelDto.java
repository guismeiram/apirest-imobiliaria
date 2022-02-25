package br.com.imobiliaria.dto.request;

import br.com.imobiliaria.model.Endereco;
import br.com.imobiliaria.model.Imovel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class ImovelDto {
    private long id;
    private String tempo_de_uso_imovel;
    //private LocalDateTime dataDeAlocacao;
    //private LocalDateTime dataDeSaidaImovel;
    private List<Endereco> enderecoDtoList;

    /*public ImovelDto() {

    }

    public void load() throws Exception {
        throw new NullPointerException();
    }

    /*public ImovelDto(Imovel imovel) {
        this.id = imovel.getIdImovel();
        this.tempo_de_uso_imovel = imovel.getTempo_de_uso_imovel();
        this.dataDeAlocacao = imovel.getDataDeAlocacao();
        this.dataDeSaidaImovel = imovel.getDataDeSaidaImovel();
        this.enderecoDtoList = imovel.getEndereco();

    }*/

    /*public ImovelDto(long id, String tempo_de_uso_imovel, LocalDateTime dataDeAlocacao, LocalDateTime dataDeSaidaImovel, List<Endereco> enderecoDtoList) {
        this.id = id;
        this.tempo_de_uso_imovel = tempo_de_uso_imovel;
        this.dataDeAlocacao = dataDeAlocacao;
        this.dataDeSaidaImovel = dataDeSaidaImovel;
        this.enderecoDtoList = enderecoDtoList;
    }*/
}
