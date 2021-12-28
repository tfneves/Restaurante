package br.com.meli.restaurante.meli_restaurante.service;

import java.math.BigDecimal;

import org.springframework.stereotype.Service;

import br.com.meli.restaurante.meli_restaurante.dto.CaixaDTO;

@Service
public class CaixaService {

	public MesaDTO fechaMesa() {
		return null;
	}

	public BigDecimal getValorTotal() {
		CaixaDTO dto = new CaixaDTO();
		return dto.getValorTotal();
	}
}
