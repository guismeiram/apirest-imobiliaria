package br.com.imobiliaria.dto.request;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ImovelDto {
    private long id;
    private int codigo;
    private String tempo_de_uso_imovel;
    private LocalDate dataDeAlocacao;
    private br.com.imobiliaria.enums.StatusImovel StatusImovel = br.com.imobiliaria.enums.StatusImovel.Alugado;
    private String numero;
    private String rua;
    private String bairro;
    private String cidade;
    private String pais;
    private String nImovel;
    private String cep;

}
