package br.com.meli.restaurante.meli_restaurante.dto;

import java.math.BigDecimal;

import br.com.meli.restaurante.meli_restaurante.model.Caixa;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CaixaDTO {
	private BigDecimal valorTotal;

	// Singleton
	private static CaixaDTO caixaInstancia = null;

	private CaixaDTO() {
		this.valorTotal = BigDecimal.ZERO;
	}

	private CaixaDTO(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public static CaixaDTO getInstance() {
		if (caixaInstancia == null) {
			caixaInstancia = new CaixaDTO();
		}
		return caixaInstancia;
	}

	// Builder
	public static Caixa converte(CaixaDTO dto) {
		return Caixa.builder()
				.valorTotal(dto.getValorTotal())
				.build();
	}

	public static CaixaDTO converte(Caixa caixa) {
		return CaixaDTO.builder()
				.valorTotal(caixa.getValorTotal())
				.build();
	}
}
