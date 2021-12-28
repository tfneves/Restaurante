package br.com.meli.restaurante.meli_restaurante.model;

import java.math.BigDecimal;

import lombok.Data;

@Data
public class Caixa {
	private BigDecimal valorTotal;

	// Singleton
	private static Caixa caixaInstancia = null;

	private Caixa() {
		this.valorTotal = BigDecimal.ZERO;
	}

	private Caixa(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public static Caixa getInstance() {
		if (caixaInstancia == null) {
			caixaInstancia = new Caixa();
		}
		return caixaInstancia;
	}
}
