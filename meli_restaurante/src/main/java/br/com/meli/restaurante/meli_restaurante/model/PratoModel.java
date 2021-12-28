package br.com.meli.restaurante.meli_restaurante.model;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class PratoModel {
    
    private Long id;
    private BigDecimal preco;
    private String descricao;
    private Integer quantidade;
}
