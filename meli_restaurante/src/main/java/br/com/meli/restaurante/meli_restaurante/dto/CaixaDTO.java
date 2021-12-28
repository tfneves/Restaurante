package br.com.meli.restaurante.meli_restaurante.dto;

import java.math.BigDecimal;

import br.com.meli.restaurante.meli_restaurante.model.Caixa;
import lombok.Data;

@Data
public class CaixaDTO {
	private BigDecimal valorTotal = Caixa.getInstance().getValorTotal();
}
