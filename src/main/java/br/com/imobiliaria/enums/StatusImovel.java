package br.com.imobiliaria.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusImovel {
    Alugado,
    Venda,
    Comprado, //acabou de ser comprado
    Vazio //para a alugar
}
