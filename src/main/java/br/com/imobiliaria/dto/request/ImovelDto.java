package br.com.imobiliaria.dto.request;

import br.com.imobiliaria.enums.StatusImovel;
import br.com.imobiliaria.model.Endereco;
import br.com.imobiliaria.model.Imovel;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ImovelDto {
    private long id;
    private String tempo_de_uso_imovel;
   private LocalDate dataDeAlocacao;

    //private List<Endereco> endereco = new ArrayList<>();
    private br.com.imobiliaria.enums.StatusImovel StatusImovel = br.com.imobiliaria.enums.StatusImovel.Alugado;


}
