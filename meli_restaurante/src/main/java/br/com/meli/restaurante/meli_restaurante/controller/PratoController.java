package br.com.meli.restaurante.meli_restaurante.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.meli.restaurante.meli_restaurante.dto.PratoDTO;
import br.com.meli.restaurante.meli_restaurante.model.PratoModel;
import lombok.Data;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@Data
@RestController
@RequestMapping("/prato")
public class PratoController {
    
    @PostMapping("/cadastra")
    public ResponseEntity<PratoDTO> cadastra(@RequestBody PratoDTO dto, UriComponentsBuilder uriBuilder) {
        PratoModel p = PratoDTO.converte(dto);
        URI uri = uriBuilder.path("/list/{id}").buildAndExpand(p.getId()).toUri();
        return ResponseEntity.created(uri).body(PratoDTO.converte(p));
    }    
}
