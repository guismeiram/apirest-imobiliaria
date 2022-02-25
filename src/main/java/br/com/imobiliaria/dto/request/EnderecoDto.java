package br.com.imobiliaria.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDto {
    private Long id;

    public String numero;
    public String rua;
    public String bairro;
    public String cidade;
    public String pais;
    public String nImovel;
    public String cep;
}
