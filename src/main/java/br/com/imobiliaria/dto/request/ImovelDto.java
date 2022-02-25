package br.com.imobiliaria.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ImovelDto {
    private long id;
    private String tempo_de_uso_imovel;
    private LocalDateTime dataDeAlocacao;
    private LocalDateTime dataDeSaidaImovel;
}
