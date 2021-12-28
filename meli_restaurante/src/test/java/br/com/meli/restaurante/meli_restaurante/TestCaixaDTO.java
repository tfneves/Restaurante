package br.com.meli.restaurante.meli_restaurante;

import java.math.BigDecimal;

import br.com.meli.restaurante.meli_restaurante.dto.CaixaDTO;
import br.com.meli.restaurante.meli_restaurante.model.Caixa;

public class TestCaixaDTO {
	public static void main(String[] args) {
		Caixa c1 = Caixa.getInstance();
		c1.setValorTotal(new BigDecimal("100"));
		Caixa c2 = Caixa.getInstance();
		c2.setValorTotal(new BigDecimal("150"));
		Caixa c3 = Caixa.getInstance();
		c3.setValorTotal(new BigDecimal("200"));
		System.out.println("c1: " + c1.getValorTotal());
		System.out.println("c2: " + c2.getValorTotal());
		System.out.println("c3: " + c3.getValorTotal());

		CaixaDTO d = CaixaDTO.converte(c1);
		System.out.println("d: " + d.getValorTotal());
	}
}
