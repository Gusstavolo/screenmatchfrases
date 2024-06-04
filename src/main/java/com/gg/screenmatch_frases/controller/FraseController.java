package com.gg.screenmatch_frases.controller;


import com.gg.screenmatch_frases.dto.FrasesDTO;
import com.gg.screenmatch_frases.service.FraseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FraseController {
    @Autowired
    private FraseService servico;

    @GetMapping("/series/frases")
    public FrasesDTO obterFraseAleatoria() {
        return servico.obterFraseAleatoria();
    }
}
