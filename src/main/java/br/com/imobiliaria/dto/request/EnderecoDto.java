package br.com.imobiliaria.dto.request;

import br.com.imobiliaria.model.Endereco;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnderecoDto {
    /*public EnderecoDto(Long id, String numero, String rua, String bairro, String cidade, String pais, String nImovel, String cep) {
        this.id = id;
        this.numero = numero;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.pais = pais;
        this.nImovel = nImovel;
        this.cep = cep;
    }*/

    private Long id;
    public String numero;
    public String rua;
    public String bairro;
    public String cidade;
    public String pais;
    public String nImovel;
    public String cep;

    /*public EnderecoDto() {
    }

    /*public void load() throws Exception {
        throw new NullPointerException();
    }*/
    /*public EnderecoDto(Endereco endereco ) {
        this.id = endereco.getIdEnderco();
        this.numero = endereco.getNumero();
        this.rua = endereco.getRua();
        this.bairro = endereco.getBairro();
        this.cidade = endereco.getCidade();
        this.pais = endereco.getPais();
        this.nImovel = endereco.getNImovel();
        this.cep = endereco.getCep();
    }*/
}
