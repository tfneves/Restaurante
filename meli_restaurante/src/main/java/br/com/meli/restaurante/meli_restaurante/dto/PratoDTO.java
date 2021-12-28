package br.com.meli.restaurante.meli_restaurante.dto;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import br.com.meli.restaurante.meli_restaurante.model.PratoModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Builder
@Data
@AllArgsConstructor
public class PratoDTO {
    
    private static Long countId = (long) 0;
    
    @JsonProperty(access = Access.WRITE_ONLY)
    private Long id;
    private BigDecimal preco;
    private String descricao;
    private Integer quantidade;

    public PratoDTO(){
        this.id = countId++;
    }


    // Converte Model em DTO - Criação DTO
    public static PratoModel converte(PratoDTO dto){
        return PratoModel.builder()
            .id(dto.getId())
            .preco(dto.getPreco())
            .descricao(dto.getDescricao())
            .quantidade(dto.getQuantidade())
            .build();
    }


    // Converte DTO em Model
    public static PratoDTO converte(PratoModel prato){
        return PratoDTO.builder()
            .preco(prato.getPreco())
            .descricao(prato.getDescricao())
            .quantidade(prato.getQuantidade())
            .build();
    }

}
