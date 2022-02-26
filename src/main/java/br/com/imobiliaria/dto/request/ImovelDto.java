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
    private LocalDateTime dataDeAlocacao;
    private LocalDateTime dataDeSaidaImovel;
    private List<Endereco> enderecoDtoList;


}
