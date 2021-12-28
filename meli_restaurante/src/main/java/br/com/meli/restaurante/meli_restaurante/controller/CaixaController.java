package br.com.meli.restaurante.meli_restaurante.controller;

import java.math.BigDecimal;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.meli.restaurante.meli_restaurante.service.CaixaService;

@RestController
@RequestMapping("/caixa}")
public class CaixaController {
	CaixaService caixaService = new CaixaService();

	@GetMapping("/{mesaId}")
	public ResponseEntity<MesaDTO> fechaMesa(@PathVariable int mesaId) {
		return ResponseEntity.ok(caixaService.fechaMesa(mesaId));
	}

	@GetMapping
	public ResponseEntity<BigDecimal> consultaValorCaixa() {
		return ResponseEntity.ok(caixaService.getValorTotal());
	}
}
