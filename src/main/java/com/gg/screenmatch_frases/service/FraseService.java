package com.gg.screenmatch_frases.service;

import com.gg.screenmatch_frases.dto.FrasesDTO;
import com.gg.screenmatch_frases.model.Frases;
import com.gg.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FraseService {

    @Autowired
    private FraseRepository repositorio;
    public FrasesDTO obterFraseAleatoria() {
        Frases frase = repositorio.buscaFraseAleatoria();
        return new FrasesDTO(frase.getTitulo(), frase.getFrase(), frase.getPersonagem(), frase.getPoster());
    }
}
